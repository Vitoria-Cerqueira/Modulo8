package Ex5

class Cachorro(nome: String, raca: String, responsavel: String): Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("Andando em 4 patas")

    }

    override fun comer() {
        println("Comendo bife")


    }
    override fun dormir(){
        println("Dormindo na cama da(o) $responsavel")
        println("------------------------------------------")

    }
}