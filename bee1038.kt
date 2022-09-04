import java.util.*

fun main() {
    val ler = Scanner(System.`in`)

    val codigo = ler.nextInt()
    val quantidade = ler.nextInt()
    var total: Double

    if (codigo == 1) {
        total = quantidade * 4.00
        println("Total: R$ " + String.format("%.2f", total))
    }

    if (codigo == 2) {
        total = quantidade * 4.50
        println("Total: R$ " + String.format("%.2f", total))
    }

    if (codigo == 3) {
        total = quantidade * 5.00
        println("Total: R$ " + String.format("%.2f", total))
    }

    if (codigo == 4) {
        total = quantidade * 2.00
        println("Total: R$ " + String.format("%.2f", total))
    }
    if (codigo == 5) {
        total = quantidade * 1.50
        println("Total: R$ " + String.format("%.2f", total))
    }
}
