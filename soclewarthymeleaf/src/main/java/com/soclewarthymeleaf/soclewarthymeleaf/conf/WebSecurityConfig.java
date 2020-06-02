package com.soclewarthymeleaf.soclewarthymeleaf.conf;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests()
	        .antMatchers("/login/**").permitAll()
	        .antMatchers("/accueil/**").hasAnyRole("ADMIN","USER")
	            .and()
	        .formLogin()
	        .loginPage("/login.html")
	        .defaultSuccessUrl("/accueil", true)
	        .failureUrl("/login.html?error=true")
	            .and()
	        .logout()
	        .logoutSuccessUrl("/login")
	        .logoutUrl("/logout")
	        	.and()
	        .httpBasic();
    }
		
	
	@Override
	protected void configure( final AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication()
	    .withUser("prothelem")
	        .password(encoder.encode("7nc5AFz8M"))
	        .roles("ADMIN")
	        .and()
	    .withUser("employethelem")
	        .password(encoder.encode("Br8T72sXf"))
	        .roles("USER");
	}
	
}	
