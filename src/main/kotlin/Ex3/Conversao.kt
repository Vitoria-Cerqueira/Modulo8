package Ex3

import java.math.BigDecimal
import java.time.LocalDate

class Conversao {
    var dataHoje = LocalDate.now()

    fun mostrarMensagem() {
        println("O conversor só pode converter para Real R$")
    }

    fun converterDolar() {
        mostrarMensagem()
        var continuar = true
        val cotacaoDolar = BigDecimal(4.80)
        do {
            try {
                println("Informe o valor que deseja converter: ")
                val valorUsuario = BigDecimal(readln().toDouble())

                val verificacao = valorUsuario.toInt()

                if (!(verificacao <= 0)) {
                    println("No dia de hoje $dataHoje a cotação do Dolar está em ${cotacaoDolar.toDouble()}\nO valor que será convertido é ${valorUsuario.toDouble()}\nO valor convertido em real é R$ ${valorUsuario.multiply(cotacaoDolar).toDouble()}")

                } else {
                    println("Valor invalido, tente novamente")
                    converterDolar()
                }

            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")


            }

        } while (!continuar)
    }

    fun converterDolarCanadense() {
        mostrarMensagem()
        var continuar1 = true
        val cotacao = BigDecimal(3.65)
        do {
            try {
                println("Informe o valor que deseja converter: ")
                val valorUsuario = BigDecimal(readln().toDouble())

                val verificacaoC = valorUsuario.toInt()
                if (!(verificacaoC <= 0)) {
                    println("No dia de hoje $dataHoje a cotação do Dolar está em ${cotacao.toDouble()}\nO valor que será convertido é ${valorUsuario.toDouble()}\nO valor convertido em real é R$ ${valorUsuario.multiply(cotacao).toDouble()}")
                } else {
                    println("Valor invalido, tente novamente")
                    converterDolar()
                }
            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")


            }
        } while (!continuar1)

    }

    fun converterEuro() {
        mostrarMensagem()
        var continuar2 = true
        val cotacaoEuro = BigDecimal(5.37)
        do {
            try {
                println("Informe o valor que deseja converter: ")
                val valorUsuario = BigDecimal(readln().toDouble())

                val verificacaoE = valorUsuario.toInt()
                if (!(verificacaoE <= 0)) {
                    println("No dia de hoje $dataHoje a cotação do Dolar está em ${cotacaoEuro.toDouble()}\nO valor que será convertido é ${valorUsuario.toDouble()}\nO valor convertido em real é R$ ${valorUsuario.multiply(cotacaoEuro).toDouble()}")
                } else {
                    println("Valor invalido, tente novamente")
                    converterDolar()
                }
            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")


            }
        } while (!continuar2)
    }

    fun converterLibra() {
        mostrarMensagem()
        var continuar3 = true
        val cotacaoLibra = BigDecimal(6.16)
        do {
            try {
                println("Informe o valor que deseja converter: ")
                val valorUsuario = BigDecimal(readln().toDouble())

                val verificacaoL = valorUsuario.toInt()
                if (!(verificacaoL <= 0)) {
                    println("No dia de hoje $dataHoje a cotação do Dolar está em ${cotacaoLibra.toDouble()}\nO valor que será convertido é ${valorUsuario.toDouble()}\nO valor convertido em real é R$ ${valorUsuario.multiply(cotacaoLibra).toDouble()}")
                } else {
                    println("Valor invalido, tente novamente")
                    converterDolar()
                }
            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")


            }
        } while (!continuar3)
    }
}
