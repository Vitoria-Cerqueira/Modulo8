package Ex4

class Usuario() {
    private lateinit var nome: String
    private lateinit var profissao: String

    var salarios = mutableListOf<Double>()
    var listaDeUsuario = mutableListOf<Usuario>()

    constructor(nome: String, profissao: String, listaSalarios: MutableList<Double>) : this() {
        this.nome = nome
        this.profissao = profissao
        this.salarios = listaSalarios
    }

    fun cadastrarUsuario() {
        println("Digite seu nome: ")
        nome = readln()

        println("Digite sua profissao: ")
        profissao = readln()


        var salarioDeste = mutableListOf<Double>()
        for (i in 1..12) {
            println("Digite o salario do mês $i")
            salarioDeste.add(readln().toDouble())

        }
        listaDeUsuario.add(Usuario(nome, profissao, salarioDeste))


    }


    fun cacularImposto() {
        for (usuario in listaDeUsuario) {
            println("-----------Cáculo de Imposto Por Mês do Usuário ${usuario.nome}----------------")
            for (valor in usuario.salarios) {
                when {
                    valor in 0.00..2000.00 -> {
                        println("Isento")
                    }

                    valor in 2001.00..3000.00 -> {
                        println("Imposto do mês: R$%.2f".format(valor * 0.08))
                    }

                    valor in 3001.00..4500.00 -> {
                        println("Imposto do mês: R$%.2f".format(valor * 0.18))
                    }

                    valor > 4500.00 -> {
                        println("Imposto do mês: R$%.2f".format(valor * 0.28))
                    }
                }

            }
        }
    }
        fun mostrarInformacoes() {

            for (objeto in listaDeUsuario) {
                println("Nome: ${objeto.nome}\n Profissão: ${objeto.profissao}\n Todos os Salários do Ano: ${objeto.salarios}")
            }
        }


    }
