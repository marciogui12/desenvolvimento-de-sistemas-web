import java.util.Scanner

fun main(){
    val ler = Scanner(System.`in`)
    println("Digite o valor inicial : ")
    var inicialA:Int = ler.nextInt()
    println("Digite a razão : ")
    val razaoR:Int = ler.nextInt()

    for (i in 1..10){
        println(inicialA)
        inicialA += razaoR
    }
}
