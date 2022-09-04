import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val a:Float = ler.nextFloat()
    val b:Float = ler.nextFloat()
    val c:Float = ler.nextFloat()
    val perimetro = (a+b+c)
    val areaTriangulo = (a+b)*c/2

    if((a < (b + c)) && (b < (a + c)) && (c < (b + a))){
        print("Perimetro = "+String.format("%.1f",perimetro))

    }else{
        print("Area = "+String.format("%.1f",areaTriangulo))
    }


}
