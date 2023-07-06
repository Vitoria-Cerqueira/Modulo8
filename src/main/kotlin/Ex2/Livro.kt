package Ex2

class Livro(var titulo: String, var qtaPaginas: Int, var paginaLidas: Int){
    fun verificarProgresso(){
        val porcentagem = (paginaLidas * 100) / qtaPaginas
        println("Você já leu $porcentagem% do livro")
    }

}