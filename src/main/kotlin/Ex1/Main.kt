package Ex1

fun main() {
    val novoFuncionario = Funcionario("Luis", "Silva", 10, 25.5)
    println(novoFuncionario.nomeCompleto())
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    var funcionarios = ArrayList<Funcionario>()
    funcionarios.add(Funcionario("Amanda", "Souza", 8, 50.5))
    funcionarios.add(Funcionario("Vitoria", "Cerqueira", 4, 300.5))
    funcionarios.add(Funcionario("Laura", "Xavier", 12, 350.0))
    funcionarios.add(Funcionario("Milena", "Lopes", 24, 500.0))
    funcionarios.add(Funcionario("Carolina", "Queiroz", 12, 30.5))
    funcionarios.add(Funcionario("Sibele", "Cruz", 12, 25.5))
    funcionarios.add(Funcionario("Ronaldo", "Gaucho", 4, 6000.5))
    funcionarios.add(Funcionario("Anitta", "Machado", 4, 500000.0))
    funcionarios.add(Funcionario("Ludmila", "Oliveira", 5, 220000.0))

    for (funcionario in funcionarios) {
        println(
            "\nNome: ${funcionario.nome + " " + funcionario.sobrenome} \nHoras trabalhadas: ${funcionario.horasTrabalhadas}" +
                    "\nValor por hora: ${funcionario.valorPorHora}"
        )
    }


}