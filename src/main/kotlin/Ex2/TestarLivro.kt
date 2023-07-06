package Ex2

fun main(){
    val livroFavorito = Livro("O Pequeno Príncipe", 98, 20)
    println("O livro '${livroFavorito.titulo}' possui ${livroFavorito.qtaPaginas} páginas")
    livroFavorito.verificarProgresso()
    livroFavorito.paginaLidas = 50
    livroFavorito.verificarProgresso()
    println("--------------------------------------")

    var listaLivro = ArrayList<Livro>()
    listaLivro.add(Livro("É assim que acaba",368,50))
    listaLivro.add(Livro("Mais esperto que o diabo",200,100))
    listaLivro.add(Livro("Como fazer amigos e influenciar pessoas",256,5))
    listaLivro.add(Livro("Diário de um banana - Um romance em quadrinhos",218,10))
    listaLivro.add(Livro("Os segredos da mente milionária",176,50))
    listaLivro.add(Livro("É assim que começa",368,25))
    listaLivro.add(Livro("O poder da autorresponsabilidade",160,14))
    listaLivro.add(Livro("A biblioteca da meia-noite",308,34))
    listaLivro.add(Livro("Mulheres que correm com os lobos (capa dura)",576,80))
    listaLivro.add(Livro("Rita Lee - outra autobiografia",192,32))

    for (livro in listaLivro){
        println("\nO livro '${livro.titulo}' possui ${livro.qtaPaginas} páginas")
        livro.verificarProgresso()
        livro.paginaLidas = 50
        livro.verificarProgresso()
    }




}