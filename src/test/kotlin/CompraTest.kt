import org.junit.jupiter.api.Test

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals





class CompraTest {
    val carrinho = mutableListOf<Frutas>()
    val compra = Compra()
    @Test
    fun testarSeAFrutaEstaSendoAdicionada(){
        val maca = Maca("Maça", 0.60)
        carrinho.add(maca)

        assertTrue(carrinho.contains(maca))
    }
    @Test
    fun removerItemDaLista(){
        val laranja = Laranja("Laranja", 0.25)
        carrinho.remove(laranja)

        assertFalse(carrinho.contains(laranja))
    }
    @Test
    fun testarCalculoTotal(){
        carrinho.add(Maca("Maça", 0.60))
        carrinho.add(Maca("Maça", 0.60))
        carrinho.add(Maca("Maça", 0.60))
        carrinho.add(Laranja("Laranja", 0.25))

        val valorRetornado = compra.calcularTotal(carrinho)
        assertEquals(2.05,valorRetornado)
    }
//    @Test
//    fun deveCairEMExcessao(){
//        val novaLista = mutableListOf<Frutas>()
//        assertThrows<IllegalArgumentException> {compra.calcularTotal(novaLista)}
//
//    }

    // Etapa 2

    @Test
    fun testarOpcaoInvalida(){
        assertThrows<IllegalArgumentException> {compra.comprarComOferta(0,carrinho)  }
    }
    @Test
    fun testarEstaSendoAdicionada(){
      assertFalse(compra.comprarComOferta(2,carrinho).isEmpty())
    }
    @Test
    fun testarListaSendoAlterada(){
        carrinho.add(Maca("Maçã",0.60))
        compra.comprarComOferta(2, carrinho)
        assertTrue(carrinho.size == 4)
    }
    // Etapa 3
    @Test
    fun testarSeOStatusFuncionando(){
        val laranja = Laranja("Laranja", 0.25)
        carrinho.add(laranja)
        val resul = compra.statusPedido(carrinho)
        assertEquals(true,resul)
    }
    @Test
    fun testarStatusCasoListaEstejaVazia(){
        val resul = compra.statusPedido(carrinho)
        assertFalse(resul)
    }
    @Test
    fun testarCompraAtravesDoEstoque(){
        val resultadoEsperado = compra.verificarEstoque(1,2,carrinho)
        assertTrue(resultadoEsperado)
    }
    @Test
    fun testarQtaValida(){
        val resultadoEsperado = compra.verificarEstoque(1,10,carrinho )
        assertFalse(resultadoEsperado)
    }
    @Test
    fun testarException(){
        assertThrows<IllegalArgumentException> { compra.verificarEstoque(0,2,carrinho) }
    }





}