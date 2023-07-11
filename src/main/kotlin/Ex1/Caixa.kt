package Ex1

import java.util.ArrayList

class Caixa() {
    val listaProdutos = ArrayList<Produto>()

    fun cadastrarProduto(produto : Produto) {
        listaProdutos.add(produto)
    }
    fun exibirProdutosCadastrados(){
        println("----------Produtos Cadastrados-------------")
        for (i in listaProdutos){
            println("Nome: ${i.nomeProduto}, Valor: ${i.valor}, Quatidade: ${i.quantidade}")
        }
    }
    fun exibirValorTotal(){
        var total = 0.0
        for(i in listaProdutos){
            total += i.valor * i.quantidade
        }
        println("Valor total dos produtos: $total")
    }



}