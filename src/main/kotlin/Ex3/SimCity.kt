package Ex3

class SimCity {
    private var notas = arrayOf<Double>()
    fun notasRecebidos(){
        var nota1: Double?
        for (i in 1..4){
            println("Informe a notas: $i ")
            nota1 = readln().toDoubleOrNull()

            while (nota1 == null || !(nota1 >=0 && nota1 <=10)) {
                println("Nota inválida, digite novamente")
                nota1 = readln().toDoubleOrNull()
            }
            notas = notas.plus(nota1)

        }

        val media = calcularMedia()
        println("A media é: $media")
    }
    private fun calcularMedia(): Double{
        var soma = notas.sum()
        var media = soma/notas.size
        return media
    }
    fun menu(){
        var opcao: Int
        do {
            println("Deseja um novo calculo \n1-SIM \n2-NÃO")
            opcao = readln().toInt()
            if (opcao == 1) {
                notas = arrayOf()
                notasRecebidos()
            }
        }while (opcao !=2)
    }
}