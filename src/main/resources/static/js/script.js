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
  				icon: 'error',
  				title: 'Agendamento Confirmado!',
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
