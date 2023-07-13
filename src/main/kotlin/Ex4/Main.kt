package Ex4

fun main() {
    val funcionario = Funcionario("Vitoria Cerqueira Santos","T.I.",1200.00,"02/01/2023")
    val funcionario2 = Funcionario("Gustavo Henrique","Financeiro",3000.00,"15/01/2021")
    val funcionario3 = Funcionario("Larissa Machado","Marketing",5000.00,"15/01/2021")

    funcionario.exibirFuncionario()
    funcionario2.exibirFuncionario()
    funcionario3.exibirFuncionario()
}