package Ex5

fun main(){
    val turma = Turma()
    do {
        println("Você deseja:\n1-Cadastrar aluno | 2-Listar alunos | 3-Listar alunos com sobrenome | 4-Ver aluno mais velho\n5-Ver média das idades | 6-Atualizar dados | 7-Remover dados | 8-Sair")
        val opcao = readln().toInt()
        when(opcao){
            1 -> {turma.cadastrarAluno()}
            2 -> {turma.listarAlunos()}
            3 -> {turma.mostrarAlunosComSobrenome()}
            4 -> {turma.mostrarAlunoMaisIdoso()}
            5 -> {turma.mediaIdades()}
            6 -> {turma.atualizarAlunoMatricula()}
            7 -> {turma.removerAluno()}
            8 -> {System.exit(0)}
            else -> {
                println("Opção inválida!")
            }
        }
    }while (opcao != 8)
}