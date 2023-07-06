package Ex3

fun main(){
    val filme1 = Filme("Os Vingadores", 142)
    filme1.exibirDuracaoEmHoras()
    println("------------------------------------------------------------")
    val filme2 = Filme("Hotel Transsilvânia",93)
    filme2.exibirDuracaoEmHoras()
    println("------------------------------------------------------------")
    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")
    println("------------------------------------------------------------")


    var listaFilme = ArrayList<Filme>()
    listaFilme.add(Filme("Velozes Furiosos 10", 141))
    listaFilme.add(Filme("Belo Desastre", 105))
    listaFilme.add(Filme("Mistério em Paris", 89))
    listaFilme.add(Filme("Fora do mapa", 116))
    listaFilme.add(Filme("O plano imperfeito", 105))

    for (filme in listaFilme){
        filme.exibirDuracaoEmHoras()
        println()
    }
    println("-------Filmes em Cartaz---------")
    for (filmes in listaFilme){
        println("'${filmes.titulo}'")

    }



}