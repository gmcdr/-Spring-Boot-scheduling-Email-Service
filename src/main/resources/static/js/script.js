
$(document).ready(function () {
    $("#telefone").mask("(00) 00000-0000")
})

const sr = ScrollReveal({
    origin: 'top',
    distance: '30px',
    duration: 2000,
    reset: true
});

sr.reveal(`.contentBx`,{
    interval: 200
})



function toggleMenu() {
    const toggleMenu = document.querySelector('.toggleMenu');
    const navbar = document.querySelector('.navbar');
    toggleMenu.classList.toggle('active')
    navbar.classList.toggle('active')
}

function errorMsg(){
				Swal.fire({
  				icon: 'error',
  				title: 'Oops...',
 			    text: 'Preencha os campos corretamente!!',
 			    confirmButtonColor: '#BB4E26'
})
}

function successMsg(){
				Swal.fire({
  				icon: 'success',
  				title: 'Preferência Enviada!',
 			    text: 'Verifique sua caixa de email!',
 			    confirmButtonColor: '#BB4E26'
})
}

function complete(){
	if(nome.value ==""){
		errorMsg();
}else if(email.value ==""){
		errorMsg();
}else if(data.value == ""){
		errorMsg();
}else if(hora.value == ""){
	errorMsg();
}
else{
	successMsg();
}
		
}
