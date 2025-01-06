const nome = document.getElementById("nome")
const registarBTN = document.getElementById("registarBTN")
const form = document.querySelector('.form')
registarBTN.disabled = true

function defineActions() {
    // registar
    registarBTN.addEventListener('click', function(e) {
        e.preventDefault();
        console.log(nome.value.trim()) // e.target.value
    })
    // input
    nome.addEventListener('input', function(e) {
        if(nome.value.trim().length > 2) registarBTN.disabled = false
    })

    form.addEventListener('submit', function(e) {
        if(nome.value.trim().length === 0) {
            alert("Campo vazio")
            e.preventDefault();
        }
        else {
            alert(`Nome: ${nome.value.trim()}`)
        }
    })

}

defineActions()
