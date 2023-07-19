package Ex2

abstract class ProdutosGramas(var nome: String, var pesoEmGrama: Double){
    abstract fun cadastrarProduto()
    abstract fun mostrarValores()

}
abstract class ProdutosPeso(var nome: String, var pesoEmUnidades: Int){
    abstract fun cadastrarProduto()
    abstract fun mostrarValores()
}

class Verdura(nome: String, pesoEmGrama: Double): ProdutosGramas(nome, pesoEmGrama){
    var listaVerdura = arrayListOf<Verdura>()

    override fun cadastrarProduto() {


            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }

                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (!grama.contains('.') || grama.contains('-')|| grama == "0"){

                    throw NumberFormatException()
                }

                listaVerdura.add(Verdura(nome, grama.toDouble()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para verdura, a quantidade deve ser informada com ponto")

            }


    }


    override fun mostrarValores() {
        for (i in listaVerdura){
            println("Nome: ${i.nome}\nPeso em gramas: ${i.pesoEmGrama}")
        }
        println("A quantidade de verduras da lista de compras é ${listaVerdura.size}")

    }

}
class Graos(nome: String, pesoEmGrama: Double): ProdutosGramas(nome, pesoEmGrama){
    var listaGraos = arrayListOf<Graos>()
    override fun cadastrarProduto() {


            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (!grama.contains('.') || grama.contains('-')|| grama == "0"){

                    throw NumberFormatException()
                }

                listaGraos.add(Graos(nome, grama.toDouble()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Graos, a quantidade deve ser informada com ponto")

            }

    }

    override fun mostrarValores() {
        for (i in listaGraos){
            println("Nome: ${i.nome}\nPeso em gramas: ${i.pesoEmGrama}")
        }
        println("A quantidade de Graos da lista de compras é ${listaGraos.size}")

    }

}
class Legumes(nome: String, pesoEmUnidades: Int): ProdutosPeso(nome, pesoEmUnidades){
    var listaLegumes = arrayListOf<Legumes>()
    override fun cadastrarProduto() {


            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (grama.contains('.') || grama.contains(",") ||grama.contains('-')|| grama == "0"){

                    throw NumberFormatException()
                }

                listaLegumes.add(Legumes(nome, grama.toInt()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Legumes, a quantidade deve ser informado em inteiro")

            }


    }

    override fun mostrarValores() {
        for (i in listaLegumes){
            println("Nome: ${i.nome}\nPeso em gramas: ${i.pesoEmUnidades}")
        }
        println("A quantidade de legumes da lista de compras é ${listaLegumes.size}")
    }

}
class Outros(nome: String, pesoEmUnidades: Int): ProdutosPeso(nome, pesoEmUnidades){
    var listaOutros = arrayListOf<Outros>()
    override fun cadastrarProduto() {


            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }

                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (grama.contains('.') || grama.contains(",") ||grama.contains('-')|| grama == "0"){

                    throw NumberFormatException()
                }

                listaOutros.add(Outros(nome, grama.toInt()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Outros, a quantidade deve ser informada inteira")

            }

    }

    override fun mostrarValores() {
        for (i in listaOutros){
            println("Nome: ${i.nome}\nPeso em gramas: ${i.pesoEmUnidades}")
        }
        println("A quantidade de outros da lista de compras é ${listaOutros.size}")
    }

}