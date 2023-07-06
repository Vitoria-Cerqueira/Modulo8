package Ex3

import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

class Filme(var titulo: String, var minutos: Int){
    fun exibirDuracaoEmHoras(){
        var horasDuracao = minutos.minutes
        println("O filme '$titulo' possui $horasDuracao de duração")
    }

}