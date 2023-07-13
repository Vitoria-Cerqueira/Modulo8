package Ex5

fun main(){
    val cachorro = Cachorro("Bob", "Golden","Jessica")
    val cachorro2 = Cachorro("Liza", "Pastor Alemão","Vitoria")

    val gato = Gato("Mel", "Persa", "Maria")
    val gato2 = Gato("Fred", "Siamês", "Pedro")

    val peixe = Peixe("Patty", "Colisa", "Cristiano")
    val peixe2 = Peixe("Marie", "Coridora", "Rafael")

    cachorro.movimentar()
    cachorro.comer()
    cachorro.dormir()

    cachorro2.movimentar()
    cachorro2.comer()
    cachorro2.dormir()

    gato.movimentar()
    gato.comer()
    gato.dormir()

    gato2.movimentar()
    gato2.comer()
    gato2.dormir()

    peixe.movimentar()
    peixe.comer()
    peixe.dormir()

    peixe2.movimentar()
    peixe2.comer()
    peixe2.dormir()







}