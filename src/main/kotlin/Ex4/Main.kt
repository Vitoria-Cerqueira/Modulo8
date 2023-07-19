package Ex4

fun main() {
    val user = Usuario()

    while (true) {
        println("Você deseja:\n1-Se cadastrar | 2-Ver usuarios | 3-Ver calculo de imposto | 4-Sair")
        when (readln().toInt()) {
            1 -> {
                user.cadastrarUsuario()
            }

            2 -> {
                user.mostrarInformacoes()
            }

            3 -> {
                user.cacularImposto()
            }

            4 -> {
                println("Saindo do sistema")
                return
            }

            else -> {
                println("Opção inválida")
            }
        }
    }

}