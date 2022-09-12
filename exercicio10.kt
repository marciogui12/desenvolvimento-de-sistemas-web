import java.util.Scanner

fun main(){
    val ler = Scanner(System.`in`)
    print("Digite o numero para calcular o fatorial: ")
    val numeroFatorial = ler.nextInt()
    var fatorial = 1
    var i = 1

    while(i <= numeroFatorial){
        fatorial = fatorial * i
        i++
    }
    println("o fatorial de $numeroFatorial é: $fatorial")




}
