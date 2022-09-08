fun main(args: Array<String>) {
    var soma = 0
    var numero = 1

    for (  numero in  1..500) {
        if(numero %2 != 0) if(numero % 3==0){
            soma = soma + numero
            println("O resultado da soma é $soma")
        }
    }
