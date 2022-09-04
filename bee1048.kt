import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val salarioAntigo:Float = ler.nextFloat()
    var percentual = 0

    if (salarioAntigo <= 400.00){
        percentual = 15
    }
    else if (salarioAntigo <= 800.00){
        percentual = 12
    }
    else if (salarioAntigo <= 1200){
        percentual = 7
    }
    else if (salarioAntigo > 2000){
        percentual = 4
    }
    val reajuste = ((salarioAntigo*percentual)/100)
    val salarioNovo = salarioAntigo+reajuste

    println("Novo salario: "+String.format("%.2f",salarioNovo))
    println("Reajuste ganho: "+String.format("%.2f",reajuste))
    println("Em percentual: $percentual %")




}
