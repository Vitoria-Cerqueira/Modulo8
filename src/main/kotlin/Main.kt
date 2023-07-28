fun main(){
    val carrinho = mutableListOf<Frutas>()
    val compra = Compra()

//    carrinho.add(Maca("Maça", 0.60))
//    carrinho.add(Maca("Maça", 0.60))
//    carrinho.add(Maca("Maça", 0.60))
//    carrinho.add(Laranja("Laranja", 0.25))
//    println("TOTAL: R$%.2f".format(compra.calcularTotal(carrinho)))


    // etapa 2
//    println(compra.calcularTotal(compra.comprarComOferta(1, carrinho)))

    // etapa 3
//    compra.statusPedido(carrinho)
//    carrinho.clear()
//    compra.statusPedido(carrinho)

    // etapa 4

    println("Frutas disponíveis:\n1- Maça: 5\n2- Laranja: 3")
    compra.verificarEstoque(2, 4, carrinho)
    for (i in carrinho){
        println("FRUTA: ${i.nome}      PREÇO: ${i.preco}")
    }

}