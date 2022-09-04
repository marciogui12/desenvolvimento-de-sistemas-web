import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n1 = ler.nextFloat()
    val n2 = ler.nextFloat()
    val n3 = ler.nextFloat()
    val n4 = ler.nextFloat()
    val med = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10
    val media = String.format("%.1f", med)

    if (med >= 7) {
        println("Media: " + media)
        println("Aluno aprovado.")
    } else if (med < 5) {
        println("Media: " + media)
        println("Aluno reprovado.")
    } else if (med >= 5 && med <= 6.9) {
        println("Media: " + media)
        println("Aluno em exame.")
        val exam = ler.nextFloat()
        val exame = String.format("%.1f", exam)
        println("Nota do exame: " + exame)
        val mediaFin = (med + exam) / 2
        if (mediaFin >= 5) {
            val mediaFinal = String.format("%.1f", mediaFin)
            println("Aluno aprovado.")
            println("Media final: " + mediaFinal)
        } else if (mediaFin <= 4.9) {
            println("Aluno reprovado.")
        }
    }
}
