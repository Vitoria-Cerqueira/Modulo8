import Ex3.Numero
import org.junit.Assert.assertEquals
import org.junit.Test


class TestarNumeros {
    val numeroArray = arrayOf(8,5,6,7,10)
    val numero = Numero()
    @Test
    fun testarNumeroERetornarOMaior(){
        val numeroMaior = numero.receberNumero(numeroArray)
        assertEquals(10,numeroMaior)
    }
}