class Compra {
    fun calcularTotal(carrinho: MutableList<Frutas>): Double {
        var totalCompras = 0.0

        for (i in carrinho) {
//                println(i.nome)
            totalCompras += i.preco
        }

        return totalCompras
    }

    fun comprarComOferta(opcao: Int, carrinho: MutableList<Frutas>): MutableList<Frutas> {
        when (opcao) {
            1 -> {
                carrinho.add(Maca("Maçã", 0.60))
                carrinho.add(Maca("Maçã", 0.0))

            }

            2 -> {
                carrinho.add(Laranja("Laranja", 0.25))
                carrinho.add(Laranja("Laranja", 0.25))
                carrinho.add(Laranja("Laranja", 0.0))
            }

            else -> {
                throw IllegalArgumentException()
            }
        }
        println("------- Lista Pedido ------- ")
        for (i in carrinho) {
            println("${i.nome} | R$ ${i.preco}")
        }
        return carrinho
    }
    // Etapa 3

    fun statusPedido(carrinho: MutableList<Frutas>): Boolean {
        if (carrinho.isNotEmpty()) {
            println("Seu pedido está sendo preparado: ")
            Thread.sleep(3000)
            println("Seu pedido saiu pra entrega\nTempo estimado: 30 minutos")
            Thread.sleep(5000)
            println("Seu pedido foi entregue")
            Thread.sleep(3000)
            return true
        } else {
            println("Não há produtos no carrinho")
            return false
        }
    }

    // Etapa 4
    fun verificarEstoque(codigo:Int, qtd:Int, carrinho:MutableList<Frutas>):Boolean{
        if (codigo==1){
            when{
                qtd in 1..5 -> {
                    for (i in 1..qtd){
                        carrinho.add(Maca("Maça",0.60))
                    }
                    println("Compra efetuada com sucesso!")
                    return true
                }
                else -> {
                    println("A quantidade solicitada não está disponível para esse produto")
                }
            }
        }
        else if(codigo==2){
            when{
                qtd in 1..3 -> {
                    for (i in 1..qtd){
                        carrinho.add(Laranja("Laranja",0.25))
                    }
                    println("Compra efetuada com sucesso!")
                    return true
                }
                else -> {
                    println("A quantidade solicitada não está disponível para esse produto")
                }
            }
        }
        else{
            throw IllegalArgumentException("O cattinho está vazio")
        }
        return false
    }


}