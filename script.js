//Script
let texto = document.getElementById("texto")

function mudar() {
    texto.innerHTML = "Trocar o texto"
}

//------------------

let texto2 = document.getElementById("texto2")
let botao = document.getElementById("botao")

botao.addEventListener("click", function () {
    texto2.innerHTML = "Mudou com o evento"
})

//------------------

let input = document.getElementById("input")
let mensagem = document.getElementById("mensagem")
input.addEventListener("input", function () {
    mensagem.innerText = input.value
    //.VALUE PODE FICAR EM QUALQUER LUGAR
})

//------------------

let clique = document.getElementById("clique")
let total = document.getElementById("total")
let contador = 0
clique.addEventListener("click", function () {
    alert("Clicou no botão")
})


//-------------------

let texto3 = document.getElementById("texto3")
texto3.addEventListener("mouseover", function() {
if(texto3.innerText == "Você achou o texto secreto") {
    texto3.innerText = "texto incial"
} else {
    texto3.innerText =  "Você achou o texto secreto"
}
})
//------------------------------------------

let imagem = document.getElementById("imagem")
imagem.addEventListener("mouseover", function() {
    imagem.src = "img/caixa2.png"
})

imagem.addEventListener("mouseout", function() {
imagem.src =  "img/caixa1.png"
})


//-----------------------------------