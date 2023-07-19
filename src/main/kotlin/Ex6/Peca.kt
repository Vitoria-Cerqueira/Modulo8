package Ex6

abstract class Peca(var marca: String, var modelo: String) {
    abstract fun retirado()
}
class Lojinha( marca: String, modelo: String): Peca(marca, modelo){
    override fun retirado() {

    }


}
