package Ex1

import java.time.LocalDate
import kotlin.system.exitProcess

fun main(){
    val supermercado = Supermercado()
    supermercado.sistemaRegistro()
}
class Supermercado{
    var alimentos = Alimenticio("","", LocalDate.now())
    var limpeza = Limpeza("","", LocalDate.now())
    var higiene = Higiene("","", LocalDate.now())

    fun sistemaRegistro(){
    var continuar = true
        do {
            println("Digite o tipo de produto que deseja: \n1- Alimentício \n2- Limpeza \n3- Higiene\n4- Sair")
            var opcao = readln().toInt()
            when(opcao){
                1-> {
                    alimentos.cadastrar()

                }
                2-> {
                    limpeza.cadastrar()
                }
                3-> {
                    higiene.cadastrar()
                }
                4-> {
                    continuar = false
                    exitProcess(0)
                }
                else-> {
                    println("Opção invalida")
                }
            }


        }while (!continuar)

    }


}