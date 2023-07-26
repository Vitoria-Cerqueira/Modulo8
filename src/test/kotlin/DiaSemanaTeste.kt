import Ex2.Semana
import org.junit.Assert.assertEquals
import org.junit.Test


class DiaSemanaTeste {
    val dia = Semana()
    @Test
    fun testarDiaDaSemana() {
       val semana = dia.receberDia(1)

        assertEquals("Domingo", semana)
    }
    @Test
    fun lernumeroEretornarSegunda(){
        val diaDaSemana = dia.receberDia(2)
        assertEquals("Segunda-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarTerca(){
        val diaDaSemana = dia.receberDia(3)
        assertEquals("Terça-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarQuarta(){
        val diaDaSemana = dia.receberDia(4)
        assertEquals("Quarta-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarQuinta(){
        val diaDaSemana = dia.receberDia(5)
        assertEquals("Quinta-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSexta(){
        val diaDaSemana = dia.receberDia(6)
        assertEquals("Sexta-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSabado(){
        val diaDaSemana = dia.receberDia(7)
        assertEquals("Sábado", diaDaSemana)
    }
    @Test
    fun testarDiaInvalido(){
        val numero = dia.receberDia(0)
        assertEquals("Opção inválida", numero)
    }
}


