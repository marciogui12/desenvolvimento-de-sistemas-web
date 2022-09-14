class Medicamento(val formula: String, val posologia: String) {

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
    fun hora(posologia: String) = this.posologia.contains(posologia, ignoreCase = true)

}

fun main() {
    val medicamento = Medicamento("C8H9NO2", "...")


    if (medicamento.contem("C8H9NO2")) {
        println("Este medicamento contém paracetamol")
    }
    val medicamento1 = Medicamento("C8H9NO2", "6 em 6 horas")


    if(medicamento1.hora("6 em 6 horas")) {
        println("Este medicamento é controlado")
    }

}
