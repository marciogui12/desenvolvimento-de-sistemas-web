import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val x:Float = ler.nextFloat()
    var y:Float = ler.nextFloat()

    if (x==0F && y==0F){
        print("Origem")
    }
    else if(x==0F){
        print("Eixo Y")
    }
    else if(y==0F){
        print("Eixo X")
    }
    else if(x>0F && y>0F){
        print("Q1")
    }
    else if(x<0 && y>0){
        print("Q2")
    }
    else if (x<0 && y<0){
        print("Q3")
    }
    else if(x>0 && y<0){
        print("Q4")
    }

}
