package Ex6

class GuardaVolumes {
    var dicionario = mutableMapOf<Int, ArrayList<Lojinha>>()
    var contador = 0

    fun guardarPecas(listaDePeca: ArrayList<Lojinha>): Int{
        contador++
        dicionario[contador] = listaDePeca
        return contador
    }
    fun mostrarPecas(){
        for ((id, pecas) in dicionario){
            println("Numero de identificação: $id")
            for (peca in pecas){
                println("Marca: ${peca.marca}\nModelo: ${peca.modelo}")
            }
            println()
        }
    }
    fun mostrarPecas(numeros: Int){
        for (key in dicionario.keys){
            if (key.equals(numeros)){
                println("Para a ID: $numeros Encontrei: ")
                for (peca in  dicionario.getValue(numeros)){
                    println("Marca: ${peca.marca}\nModelo: ${peca.modelo} ")

                }
                return
            }

        }
        println("Infelizmente não encontrei.")
    }
    fun devolverPeca(identificador:Int){
        if (dicionario.containsKey(identificador)){
            dicionario.remove(identificador)
            println("Sua peça foi devolvida")
        }
        else{
            println("Identificador inválido!")
        }
    }


}