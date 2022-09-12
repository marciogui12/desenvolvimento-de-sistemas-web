import java.util.Scanner

fun main(){
     val ler = Scanner(System.`in`)
     var alturas: ArrayList<Double> = ArrayList()

     for (i in 1..15){
         print("Digite a altura da $i º pessoa : ")
         val altura:Double = ler.nextDouble()
         alturas.add(altura)
     }
     val max = alturas.maxOrNull() ?: 0
     val min = alturas.minOrNull() ?: 0
     println("A menor altura é : %.2f".format(min))
     println("A maior altura é : %.2f".format(max))
 }
