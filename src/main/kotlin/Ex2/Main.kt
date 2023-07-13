package Ex2

fun main(){
    var array = ArrayList<Forma>(5)
    val retangulo = Retangulo(10f, 5f)
    val circulo = Circulo(60f)
    val quadrado = Quadrado(10f,10f)

    array.add(retangulo)
    array.add(circulo)
    array.add(quadrado)

    for (i in array){
        println("Área: ${i.calcularArea()}\nPerímetro: ${i.calcularPerimetro()}")
        println()
    }
}
