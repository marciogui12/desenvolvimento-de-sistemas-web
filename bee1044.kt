import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val a = ler.nextInt()
    val b = ler.nextInt()
    val resto = b%a

    if(resto == 0){
        print("Sao Multiplos")
    }else{
        print("Nao sao Multiplos")
    }
