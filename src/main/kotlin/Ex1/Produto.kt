package Ex1

class Produto {
    fun produtoMaisBarato(precoArray: Array<Double>): Double{
        val produto = precoArray.min()
        return produto
    }
}