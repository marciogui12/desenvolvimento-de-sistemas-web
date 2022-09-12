import java.util.Scanner

fun main(){
    val ler = Scanner(System.`in`)
    print("Digite um numero entre 1 e 10: ")
    val N:Int = ler.nextInt()
    var calculo = 0

    for (i in 1..10){
        calculo = N * i
        println("$i x $N = $calculo")
    }

}
