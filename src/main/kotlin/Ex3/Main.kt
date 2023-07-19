package Ex3

fun main(){
    val dicionario = Dicionario()
    dicionario.adicionarTermo("Adjetivo")
    dicionario.adicionarTermo("Flor")
    dicionario.adicionarTermo("Corinthians")
    dicionario.adicionarTermo("Livro")

    dicionario.listarTermos()

    dicionario.procurarTermo("livro")



}