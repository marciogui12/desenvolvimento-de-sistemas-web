import java.util.Scanner

fun main(args: Array<String>) {

    val ler = Scanner(System.`in`)

    val a = ler.nextLine()
    val b = ler.nextLine()
    val c = ler.nextLine()

    when {
        a == "vertebrado" && b == "ave" && c == "carnivoro" -> println("aguia")
        a == "vertebrado" && b == "ave" && c == "onivoro" -> println("pomba")
        a == "vertebrado" && b == "mamifero" && c == "onivoro" -> println("homem")
        a == "vertebrado" && b == "mamifero" && c == "herbivoro" -> println("vaca")
        a == "invertebrado" && b == "inseto" && c == "hematofago" -> println("pulga")
        a == "invertebrado" && b == "inseto" && c == "herbivoro" -> println("lagarta")
        a == "invertebrado" && b == "anelideo" && c == "hematofago" -> println("sanguessuga")
        a == "invertebrado" && b == "anelideo" && c == "onivoro" -> println("minhoca")
    }
}
