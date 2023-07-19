package Ex3

class Dicionario {
    var dicionario = mutableListOf<String>()

    fun adicionarTermo(termo : String){
        dicionario.add(termo)
    }
    fun procurarTermo(termo: String){

        for (i in dicionario){
            if (i.equals(termo, ignoreCase = true)){
                println(i)
                return
            }
        }
        println("Termo não encontrado")
    }
    fun listarTermos(){
        for (i in dicionario.sorted()){
            println(i)
        }
    }
}