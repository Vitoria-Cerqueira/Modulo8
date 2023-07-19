package Ex3

class Menu {
    val conversao = Conversao()

    fun mostrarDados() {
        try {
            println("Bem vindo ao conversor de moedas!")
            println("O que você deseja \n 1- Dólar \n 2- Dólar Canadense \n 3- Euro \n 4- Libra Esterlina")
            when (readln().toInt()) {
                1 -> conversao.converterDolar()
                2 -> conversao.converterDolarCanadense()
                3 -> conversao.converterEuro()
                4 -> conversao.converterLibra()
                else -> throw IllegalArgumentException()
            }
        } catch (erroDois: IllegalArgumentException) {
            erroDois.printStackTrace()
            println("Causa: ${erroDois.cause}")
            println("Mensagem: ${erroDois.message}")
            mostrarDados()
        } finally {
            println("Deseja fazer uma nova conversão? \n 1- Sim \n 2- Não")
            when (readln().toInt()) {
                1 -> mostrarDados()
                2 -> {
                    println("Programa encerrado")
                }

                else -> {
                    println("Inválido")
                }
            }
        }
    }
}