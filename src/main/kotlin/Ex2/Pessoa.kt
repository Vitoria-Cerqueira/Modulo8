package Ex2

import java.time.LocalDate

class Pessoa(var idade: Int, var diaNasc: Int, var mesNasc: Int, var anoNasc: Int, var nome: String) {

    fun calcularIdade(){
        val dataDeHoje = LocalDate.now()
        idade = dataDeHoje.year - anoNasc

    }

    fun informarIdade(): Int{
        return idade
    }
    fun informarNome(): String{
        return nome
    }
    fun ajustarDataDenascimento(dia: Int, mes: Int, ano: Int){
        this.diaNasc = dia
        this.mesNasc = mes
        this.anoNasc = ano
    }
}
