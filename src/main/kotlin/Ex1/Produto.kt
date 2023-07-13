package Ex1

import kotlin.time.Duration.Companion.minutes

abstract class Produto (var nome: String, var preco: Double, var codigoBarras: Int){
     var vetor = arrayOf<Any>()
    abstract fun mostrarDetalhes()

    open fun adicionarObjeto(objeto : Any){
        vetor = vetor.plus(objeto)
        for (i in vetor){
            mostrarDetalhes()
            println()
        }
    }

}

class Livro(nome: String, preco: Double, codigoBarras: Int, var autor: String) : Produto(nome, preco, codigoBarras){
    override fun mostrarDetalhes() {
        println("Titulo: $nome\nPreço: $preco\nCodigo de barras: $codigoBarras\nAutor: $autor")// aqui estou usando o get das variaveis de forma implicita
    }
}
class Cd(nome: String, preco: Double, codigoBarras: Int, var numeroFaixa: Int): Produto(nome, preco, codigoBarras){
    override fun mostrarDetalhes() {
        println("Titulo: $nome\nPreço: $preco\nCodigo de barras: $codigoBarras\nNumero de faixas: $numeroFaixa")

    }
}
class Dvd(nome: String, preco: Double, codigoBarras: Int, var duracao: Int): Produto(nome, preco, codigoBarras){
    override fun mostrarDetalhes() {
        var duracaoHoras = duracao.minutes
        println("Titulo: $nome\nPreço: $preco\nCodigo de barras: $codigoBarras\nDuração $duracaoHoras")
    }
}

