package Ex1

fun main() {
    val livro = Livro("Mais esperto que o diabo", 40.0, 343536, "Napoleon Hill")
    livro.adicionarObjeto(livro)

    val cd = Cd("Calypso", 35.0, 10, 45678)
    cd.adicionarObjeto(cd)

    val dvd = Dvd("Snowden", 50.5, 212324, 134)
    dvd.adicionarObjeto(dvd)

    val cd2 = Cd("Zeze di Camargo e Luciano", 20.0, 556638, 10)
    cd2.adicionarObjeto(cd2)

    val livro2 = Livro("Escravidão", 60.0, 12345, "Laurentino Gomes")
    livro2.adicionarObjeto(livro2)

    val livro3 = Livro("Escravidão", 60.0, 12345, "Laurentino Gomes")
    livro2.adicionarObjeto(livro3)

    println(livro2.codigoBarras.equals(livro3.codigoBarras))

    val vetor = arrayOf(livro, cd, dvd, cd2, livro2, livro3)
    buscarProduto(cd, vetor)


}

fun buscarProduto(objeto: Produto, vetor: Array<Produto>) {
    for (i in 0 until vetor.size) {
        if (vetor.get(i).equals(objeto)) {
            println("Posição: ${i}")
            println("Produto encontrado:")
            objeto.mostrarDetalhes()
            return
        }
    }
    println("Produto não encontrado")
}