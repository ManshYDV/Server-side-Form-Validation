document.addEventListener("DOMContentLoaded", function(){
	const form=document.getElementById("LoginForm");
	form.addEventListener("submit", async function(e){
		e.preventDefault();
		const username=document.getElementById("inputUsername").value;
		const email=document.getElementById("inputEmail").value;
		const checked=document.getElementById("gridCheck").checked;
		
		document.getElementById("usernameError").innerText="";
		document.getElementById("emailError").innerText="";
		document.getElementById("checkError").innerText="";
		try{
			const response=await fetch("/lgform/login", {
				method:"POST",
				headers:{"Content-Type":"application/json"},
				body:JSON.stringify({username, email, isChecked: checked})
			});
			const data=await response.json();
			if(!response.ok){
				if(data.usernameError){
					document.getElementById("usernameError").innerText=data.usernameError;	
				}
				if(data.emailError){
					document.getElementById("emailError").innerText=data.emailError;
				}
				if(data.checkError){
					document.getElementById("checkError").innerText=data.checkError;
				}
				if(data.general){
					document.getElementById("serverError").innerText=data.general;
				}
			}
			else{
				alert(`Login Succefull: ${data.message}`);
				location.reload();
			}
		}
		catch(e){
			document.getElementById("serverError").innerText="Catched some exception, please have a look into it";
		}
	});
});