# soclewarThymeleaf

# Pourquoi utiliser thymeleaf dans une application Spring MVC

Thymeleaf est une solution qui nous apporte un réel avantage au niveau de la simplicité d’écriture du code HTML sur une 
application Spring MVC.
Cela permettra de visualiser plus facilement le rendu des pages HTML dans le contenu du navigateur.
Thymeleaf est peu intrusif car il s’ajoute au sein des tags HTML via des attributs thymeleaf.
En utilisant thymeleaf il est impossible de créer des fonctions ou d'ajouter du code Java au sein de ses couches de
présentation.
Le code HTML sera également bien plus léger et bien plus simple à lire.
Par contre il n'acceptera pas les tags non fermés.
Thymeleaf serait donc une bonne solution pour optimiser l'application java "le socle" pour l'entreprise Thelem.

# Comment utiliser le thymeleaf dans une application web

Tout d'abord comme dans beaucoup d'applications il est important de mettre dans un ou des fichiers HTML les éléments redondants
qui figureront dans toutes les autres pages HTML qui constituront notre application au niveau VIEW (navbar / footer / les
différents link et meta)

  - Le layout (template_defaut.html):
  
  Dans un premier temps il est important de faire figurer sur les pages HTML
  "<html xmlns:th="http://www.thymeleaf.org">"
  
  En ce qui concerne le <head></head> contenant les différentes méta et link pour qu'il puisse être pris en compte par le 
  thymeleaf il faudra procéder de la manière suivante:
  "<head th:fragment="head">"
  
  le fait de nommer la section qui accompagne le thymeleaf permet de catégoriser les différents éléments redondants qui
  pourront apparaitre dans les autres pages HTML. Ici nous utiliserons th:fragment="head" pour identifier le header avec les
  éléments qui devrons apparaitre dans les différentes pages HTML.
  
  Après avoir nommé "<head th:fragment="head">" dans le fichier "template_defaut.html" il ne reste plus qu'à en faire l'appel
  dans les pages choisient comme pour le fichier "acceuil.html" en écrivant cela:
  
  <head>
	<head th:replace="template_defaut.html :: head">
	</head>
  
 Et avec ces simples manipulatons nous avons un appel rapide du head "template_defaut.html" sur la page "acceuil.html"
 
 De la même manière nous allons procéder de façon identique en ce qui concerne le fichier "template_login.html" et plus 
 spécifiquement avec le "head":
 
 "temple_login.html" -> <head th:fragment="head"> puis sur "login.html" -> <head th:replace="template_login.html :: head">
  </head>
  
  Pour tout ce qui est <header> cela ressemble à la même manipulation simplement en changeant le nom après le "th:remplace":
  Dans template_defaut.html -> <header th:fragment="top"> 
  puis dans acceuil.html -> <header th:replace="template_defaut.html :: top"></header>
  
  De la même manière en ce qui concerne le "footer":
  Dans template_defaut.html -> <footer th:fragment="bottom">
  puis dans acceuil.html -> <footer th:replace="template_defaut.html :: bottom"></footer>
  
  Et de la même manière en ce qui concerne les <script> qui doivent être envoyer également pour le bon fonctionne des éléments:
  Dans template_defaut.html -> <div th:fragment="script">
  puis dans acceuil.html -> <div th:replace="template_defaut.html :: script"></div>
  
Voici en détail comment cela peut s'articuler sur certains éléments en utilisation du thymeleaf.
