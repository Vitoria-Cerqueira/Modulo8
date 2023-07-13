package Ex2

import AutoAjuda
import Ficcao
import Romance

fun main() {
    val bliblioteca = Bliblioteca()
    bliblioteca.sistemaRegistro()
}

class Bliblioteca {

    var romance = Romance("", "")
    var autoAjuda = AutoAjuda("", "")
    var ficcao = Ficcao("", "")
    var continuar = true

    fun sistemaRegistro() {
        do {
            println("Informe a opção desejada:\n1-Cadastrar livro \n2-Ver livros \n3-Sair")
            val opcao = readln().toIntOrNull()
            when (opcao) {
                1 -> menuEscolha()
                2 -> menuExibir()
                3 -> System.exit(0)
                else -> {
                    continuar = false
                    println("Opção inválida!")
                }
            }
        } while (!continuar)
    }

    fun menuEscolha() {
        do {
            println("Qual gênero você deseja?:\n1-Romance \t 2-Suspense \t 3- Filosofia \t 4-Voltar")
            val escolha = readln().toIntOrNull()
            when (escolha) {
                1 -> {
                    romance.cadastrar()
                    menuEscolha()
                }

                2 -> {
                    autoAjuda.cadastrar()
                    menuEscolha()
                }

                3 -> {
                    ficcao.cadastrar()
                    menuEscolha()
                }

                4 -> sistemaRegistro()
                else -> {
                    continuar = false
                    println("Opção inválida!")
                }
            }
        } while (!continuar)
    }

    fun menuExibir() {
        do {
            println("Qual gênero você deseja?:\n1-Romance \t 2-Suspense \t 3- Filosofia \t 4-Voltar")
            val escolha = readln().toIntOrNull()
            when (escolha) {
                1 -> {
                    romance.exibir()
                    menuExibir()
                }

                2 -> {
                    autoAjuda.exibir()
                    menuExibir()
                }

                3 -> {
                    ficcao.exibir()
                    menuExibir()
                }

                4 -> sistemaRegistro()
                else -> {
                    continuar = false
                    println("Opção inválida!")
                }
            }
        } while (!continuar)
    }
}