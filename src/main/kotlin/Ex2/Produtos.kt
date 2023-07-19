package Ex2

abstract class ProdutosGramas(var nome: String, var pesoEmGrama: Double){
    abstract fun cadastrarProduto()
    abstract fun mostrarValores(arrayList: ArrayList<ProdutosGramas>)

}
abstract class ProdutosPeso(var nome: String, var pesoEmUnidades: Int){
    abstract fun cadastrarProduto()
    abstract fun mostrarValores(arrayList: ArrayList<ProdutosPeso>)
}

class Verdura(nome: String, pesoEmGrama: Double): ProdutosGramas(nome, pesoEmGrama){
    var listaVerdura = arrayListOf<Verdura>()

    override fun cadastrarProduto() {
        var continuar = true
        do {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    continuar = false
                    throw UnsupportedOperationException()
                }

                if (!grama.contains('.') || grama.contains('-')){
                    continuar = false
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
        }while (!continuar)

    }


    override fun mostrarValores(arrayList: ArrayList<ProdutosGramas>) {
        for (i in listaVerdura){
            println("Nome: ${i.nome}\nPeso em gramas: ${i.pesoEmGrama}")
        }
    }

}
class Graos(nome: String, pesoEmGrama: Double): ProdutosGramas(nome, pesoEmGrama){
    var listaGraos = arrayListOf<Graos>()
    override fun cadastrarProduto() {
        var continuar = true
        do {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (!grama.contains('.') || grama.contains('-')){
                    continuar = false
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
                println("Mensagem: Para verdura, a quantidade deve ser informada com ponto")

            }
        }while (!continuar)
    }

    override fun mostrarValores(arrayList: ArrayList<ProdutosGramas>) {
        for (i in listaGraos){
            println("Nome: ${i.nome}\nPeso em gramas: ${i.pesoEmGrama}")
        }
    }

}
class Legumes(nome: String, pesoEmUnidades: Int): ProdutosPeso(nome, pesoEmUnidades){
    override fun cadastrarProduto() {

    }

    override fun mostrarValores(arrayList: ArrayList<ProdutosPeso>) {

    }

}
class Outros(nome: String, pesoEmUnidades: Int): ProdutosPeso(nome, pesoEmUnidades){
    override fun cadastrarProduto() {

    }

    override fun mostrarValores(arrayList: ArrayList<ProdutosPeso>) {

    }

}