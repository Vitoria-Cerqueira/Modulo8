package Ex1

class Lista {
    var lista = mutableListOf<Int>()
    fun adicionarElemento(){
        lista.addAll(listOf(1,5,5,6,7,8,8,8))
        println(lista)
    }
}