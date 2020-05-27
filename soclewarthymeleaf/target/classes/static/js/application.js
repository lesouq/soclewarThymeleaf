// Fonction transverses au projet

/**
 *  Configuration ajax global
 */
$.ajaxSetup({
	// Disable caching of AJAX responses
	cache : false,
});

/**
 * Place un placehoder jQuery dans les champs input et textarea
 * si le navigateur ne supporte pas l'HTML5
 */
function initialiserPlaceholderJQuery(){
	$('input, textarea').placeholder();
}

/**
 * Place le footer en bas de page
 */
function placerFooter(){
	setInterval(function() {
        var docHeight = $(window).height();
        var footerHeight = $('#footer').height();
        var footerTop = $('#footer').position().top + footerHeight;
        var marginTop = (docHeight - footerTop);

        if (footerTop < docHeight)
            $('#footer').css('margin-top', marginTop + 'px'); // padding of 30 on footer
        else
            $('#footer').css('margin-top', '0px');
    }, 250); 
}

/**
 * Retour arrière sur navigateur
 * @returns
 */
function goBack() {
	$('body').addClass('wait');
	window.history.go(-1);
}


