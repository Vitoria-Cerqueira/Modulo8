import Ex1.Produto
import org.junit.Test
import kotlin.test.assertEquals

class TestarProduto {
    @Test
    fun retornarProdutoMaisBarato(){
        val array = arrayOf(12.5,14.6,3.5)
        val produto = Produto()

       val produtoBarato = produto.produtoMaisBarato(array)
        assertEquals(3.5,produtoBarato)
    }
}