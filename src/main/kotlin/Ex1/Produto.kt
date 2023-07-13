package Ex1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Produto(var nome: String, var codigoBarras: String, var dataValidade: LocalDate) {
    open fun cadastrar() {
        println("Digite o nome do produto: ")
        nome = readln()

        println("Digite o codigo: ")
        codigoBarras = readln()

        println("Informe a data de validade")
        var data = readln()
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        dataValidade = LocalDate.parse(data, formatter)

    }

    open fun exibirDetalhes() {
        println("------------------- Lista de produtos --------------------")
    }
}

class Alimenticio(nome: String, codigoBarras: String, dataValidade: LocalDate) :
    Produto(nome, codigoBarras, dataValidade) {
    private var alimenticio = ArrayList<Produto>()

    override fun cadastrar() {
        super.cadastrar()
        alimenticio.add(Alimenticio(nome, codigoBarras, dataValidade))
        exibirDetalhes()
    }

    override fun exibirDetalhes() {
        super.exibirDetalhes()
        for (i in alimenticio) {
            println("Nome: $nome\nCodigo de Barras: $codigoBarras\nData de Validade: $dataValidade")
        }
    }
}

class Limpeza(nome: String, codigoBarras: String, dataValidade: LocalDate) : Produto(nome, codigoBarras, dataValidade) {
    private var limpeza = ArrayList<Produto>()
    override fun cadastrar() {
        super.cadastrar()
        limpeza.add(Limpeza(nome, codigoBarras, dataValidade))
        exibirDetalhes()
    }

    override fun exibirDetalhes() {
        super.exibirDetalhes()
        for (i in limpeza) {
            println("Nome: $nome\nCodigo de Barras: $codigoBarras\nData de Validade: $dataValidade")
        }
    }
}

class Higiene(nome: String, codigoBarras: String, dataValidade: LocalDate) : Produto(nome, codigoBarras, dataValidade) {
    private var higiene = ArrayList<Produto>()
    override fun cadastrar() {
        super.cadastrar()
        higiene.add(Limpeza(nome, codigoBarras, dataValidade))
        exibirDetalhes()
    }
    override fun exibirDetalhes() {
        super.exibirDetalhes()
        for (i in higiene) {
            println("Nome: $nome\nCodigo de Barras: $codigoBarras\n Data de Validade: $dataValidade")
        }
    }
}


