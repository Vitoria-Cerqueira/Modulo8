package Ex1

fun main() {

    val caixa = Caixa()

    println("Bem-vendo ao mercado!!")
    do {
        println("\n1- Cadastrar produto \n2- Listar Produtos \n3- Exibir valor total \n4- Sair")
        val opcao = readln().toInt()
        when (opcao) {
            1 -> {
                println("Digite o nome do produto: ")
                val nome = readln()

                println("Digite o valor do produto: ")
                val valor = readln().toDouble()

                println("Digite a quantidade do produto: ")
                val qta = readln().toInt()

                val produto = Produto(nome, valor, qta)
                caixa.cadastrarProduto(produto)
                println("Produto cadastrado")
            }

            2 -> caixa.exibirProdutosCadastrados()
            3 -> caixa.exibirValorTotal()
            4 -> println("Obrigado, volte sempre")
            else -> println("Opção inválida")
        }
    } while (opcao != 4)

}