package Ex2

class ListaConjunto {
    var numeros = mutableSetOf<Int>()
    fun mostrarElementos(){
        numeros.addAll(setOf(1,5,5,6,7,8,8,8))
        println(numeros)
    }
}