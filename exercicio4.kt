import java.util.Scanner

fun main(){
    val ler = Scanner(System.`in`)
    var numEntre0e25:Int = 0
    var numEntre26e50:Int = 0
    var numEntre51e75:Int = 0
    var numEntre76e100:Int = 0
    var numeroDigitado:Int = 0

    while(numeroDigitado>=0){
        println("Digite um numero: ")
        numeroDigitado = ler.nextInt()
        if(numeroDigitado >=0 && numeroDigitado <= 25){
            numEntre0e25 = numEntre0e25+1
        }else if (numeroDigitado >= 26 && numeroDigitado <=50){
            numEntre26e50 = numEntre26e50+1
        }else if (numeroDigitado >=51 && numeroDigitado <=75){
            numEntre51e75++
        }else if (numeroDigitado >= 76 && numeroDigitado <=100){
            numEntre76e100++
        }
    }
    println("De 0 a 25: $numEntre0e25")
    println("De 26 a 50: $numEntre26e50")
    println("De 51 a 75: $numEntre51e75")
    println("De 76 a 100: $numEntre76e100")




}
