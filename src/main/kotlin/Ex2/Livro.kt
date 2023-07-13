open class Livro(var nome: String, var autor: String) {
    open fun cadastrar(){
        print("Digite o nome do livro: ")
        nome = readln()
        print("Digite o autor do livro: ")
        autor = readln()
    }
    open fun exibir(){
        println("------------------------LIVROS------------------------")
    }
}
class Romance(nome: String, autor: String):Livro(nome,autor){
    var livrosRomance = ArrayList<Romance>()

    override fun cadastrar() {
        super.cadastrar()
        livrosRomance.add(Romance(nome, autor))
    }

    override fun exibir() {
        super.exibir()
        for (i in livrosRomance){
            println("Título: ${i.nome} \t ${i.autor}")
        }
    }
}

class AutoAjuda(nome: String,  autor: String): Livro(nome, autor){
    var livrosAutoAjuda = ArrayList<AutoAjuda>()

    override fun cadastrar() {
        super.cadastrar()
        livrosAutoAjuda.add(AutoAjuda(nome, autor))
    }
    override fun exibir() {
        super.exibir()
        for (i in livrosAutoAjuda){
            println("Título: ${i.nome} \t ${i.autor}")
        }
    }
}

class Ficcao(nome: String,  autor: String): Livro(nome, autor){
    var livrosFicao = ArrayList<Ficcao>()

    override fun cadastrar() {
        super.cadastrar()
        livrosFicao.add(Ficcao(nome, autor))
    }
    override fun exibir() {
        super.exibir()
        for (i in livrosFicao){
            println("Título: ${i.nome} \t ${i.autor}")
        }
    }

}