package Ex2

fun main() {

    val pessoa1 = Pessoa(0, 0, 0, 0, "Albert Einsten")
    pessoa1.ajustarDataDenascimento(14, 3, 1879)
    pessoa1.calcularIdade()
    println("Se ${pessoa1.informarNome()} estivesse vivo, teria ${pessoa1.informarIdade()} anos. ")

    val pessoa2 = Pessoa(0, 0, 0, 0, "Isaac Newton")
    pessoa2.ajustarDataDenascimento(4, 1, 1643)
    pessoa2.calcularIdade()
    println("Se ${pessoa2.informarNome()} estivesse vivo, teria ${pessoa2.informarIdade()} anos. ")


}
