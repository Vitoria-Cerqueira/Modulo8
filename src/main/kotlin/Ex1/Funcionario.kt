package Ex1

class Funcionario(var nome : String, var sobrenome: String, var horasTrabalhadas: Int, var valorPorHora: Double) {
    fun nomeCompleto(): String{
        return "Nome Completo $nome $sobrenome"
    }
    fun calcularSalario(){
        var salario = horasTrabalhadas * valorPorHora
        println(salario)
    }
    fun incrementarHoras(horasAMais: Int){
        horasTrabalhadas += horasAMais
    }
}