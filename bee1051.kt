import java.util.Scanner

fun main(args: Array<String>) {

    val ler = Scanner(System.`in`)
    val salario:Float = ler.nextFloat()
    var calculo:Double

    if (salario >=0 && salario <=2000){
        print("Isento")
    }
    else if(salario>2000 && salario<=3000){
        calculo = ((salario - 2000) * 0.08)
        print("R$ "+String.format("%.2f",calculo))
    }
    else if(salario>3000 && salario<=4500){
        calculo = ((salario - 3000)* 0.18) + (1000*0.08)
        print("R$ "+String.format("%.2f",calculo))
    }
    else if(salario>4500){
        calculo = ((salario - 4500)*0.28) + (1500*0.18) + (1000*0.08)
        print("R$ "+String.format("%.2f",calculo))

    }


}
