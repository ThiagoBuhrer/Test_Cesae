
//OBS: começa colocando File > AutoSave aqui no VSCode para não ter que ficar salvando toda hora antes de compilar

console.log("Hello, World!")

// variáveis e constantes
let age = 12
const name = "Pedro"
 
console.log("O " + name + " tem " + age + " anos!")
// Template string
console.log(`O ${name} tem ${age} anos!`)


// programa que calcula o IMC de uma pessoa
console.log()
let peso = 70
let altura = 1.75
const name_2 = "Thiago"
const apelido = "Bührer"
let imc = peso / (altura * altura)
console.log(`O IMC é de ${name_2} ${apelido} é ${imc}.`)


//verificar se uma variável é inteira
console.log()
let num_3 = 1.25
console.log(Number.isInteger(num_3))

if (typeof num_3 == 'number') {
    console.log("Number!")
}

//Math exercise

// todo --> console.log(Math.floor(pi))
// todo --> console.log(Math.ceil(pi))
// todo --> console.log(Math.random())

//Gerar 10 números inteiros entre 1 e 100
console.log()
function generate(number){
    for(let i=0; i < number; i++) {
    console.log(Math.floor(Math.random()*100)+1)
    }
} 
generate(5)


// casting
console.log()
console.log("Casting exercise:")
const b = parseInt("4")
const c = parseFloat("4.56") // 4.56
const d = Number("5.11")
console.log(c.toString())


//crie uma função que retorne um valor numérico válido que esteja entre x e y 

function generateRandomNumbers(min, max){
    let vali = true
    while (vali) {
        let num = ((Math.random()*100)+1).toFixed(0)
        if (num > min && num < max){
            vali = false
            return num;
        }else {
            vali = true
        }
    }
}
console.log() 
console.log() 
let numero = generateRandomNumbers(1, 100)
console.log("Generated number is "+ numero)


//escolher um caractere específico de uma string usando a função chartAt()
console.log() 
texto = "Cesae Digital"
console.log("A letra é "+ texto.charAt(8))
console.log() 

//encontra um index de um caractere específico da sua escolha na string usando a função indexOf()
console.log() 
console.log("O index é "+ texto.indexOf("C"))
console.log() 


//fatiar uma string com slice() -->  cria uma cópia da parte de uma string ou array entre os índices start (inclusivo) e end (exclusivo)
console.log() 
console.log("O index é "+ texto.slice(0,5))
console.log() 


//divide uma string em um array de substrings ao encontrar um caractere específico
console.log() 
const frase = "O Sol brilha no horizonte, enquanto o vento suave acaricia a paisagem."
palavras = frase.split(" ")
console.log(palavras[1].toLowerCase())
console.log(palavras[2].toUpperCase())
console.log()

//Desafio: escreva uma função em JavaScript que recebe uma string como entrada e retorna uma nova string onde todas as vogais (a, e, i, o, u) são convertidas para maiúsculas. Consoantes e outros caracteres devem permanecer inalterados. Text = "Eu gosto de JS" Resultado esperado: EU gOstO DE JS


console.log()
let text_random = "Eu gosto de JS"
let 

let result = convert(text_random);
console.log(result)
console.log()