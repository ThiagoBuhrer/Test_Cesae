let num = Number(prompt("Num1: "))
 
document.body.innerHTML += `<h2>Número inserido: ${num}</h2>`
document.body.innerHTML += `<p>Raiz quadrada: ${num ** 0.5} ${Math.pow(num, 0.5)}</p>`
document.body.innerHTML += `<p>${num} é inteiro? ${Number.isInteger(num)}</p>`
document.body.innerHTML += `<p>${num} é NaN? ${isNaN(num)}</p>`
document.body.innerHTML += `<p>Arredondado para baixo: ${Math.floor(num)}</p>`
document.body.innerHTML += `<p>Arredondado para cima: ${Math.ceil(num)}</p>`
document.body.innerHTML += `<p>Com 2 casas decimais: ${num.toFixed(2)}</p>`
 