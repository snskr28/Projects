const container=document.querySelector(".container")
const registerBtn=document.querySelector("#register");
const loginBtn=document.querySelector("#login");

registerBtn.onclick=()=>container.classList.add("active");
loginBtn.onclick=()=>container.classList.remove("active");