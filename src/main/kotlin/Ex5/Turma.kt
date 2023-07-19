package Ex5

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Aluno(
    var matricula: Int,
    var nome: String,
    var sobrenome: String,
    var sexo: String,
    var dataNascimento: LocalDate
)

class Turma {
    val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val alunos = mutableListOf<Aluno>()


    fun cadastrarAluno() {
//        alunos.add(Aluno(123, "Vitoria", "Cerqueira", "Fem", LocalDate.parse("21/02/2003", formato)))
        println("Digite a matrícula do aluno:")
        var matricula = readln().toInt()
        while (verificarMatricula(matricula)) {
            println("Matrícula já existente, tente novamente!")
            matricula = readln().toInt()
        }

        println("Digite o nome: ")
        var nome = readln()

        println("Digite o sobrenome: ")
        var sobrenome = readln()

        println("Sexo: ")
        var sexo = readln()

        println("Data de nascimento: ")
        var dataNascimento = LocalDate.parse(readln(), formato)

        var aluno = Aluno(matricula, nome, sobrenome, sexo, dataNascimento)
        alunos.add(aluno)
        println("Aluno cadastrado com sucesso")
    }

    fun verificarMatricula(entrada: Int): Boolean {

        for (aluno in alunos) {
            if (aluno.matricula.equals(entrada)) {
                return true
            }
        }
        return false
    }

    fun listarAlunos() {
        var numero = 1
        println("--------- Alunos --------")
        for (i in alunos) {
            println("${numero}º aluno: ${i.nome}")
            numero++
        }
    }

    fun mostrarAlunosComSobrenome() {
        var numero = 1
        println("--------- Alunos ---------")
        for (i in alunos) {
            println("${numero}º aluno: ${i.nome} ${i.sobrenome}")
            numero++
        }
    }

    fun mostrarAlunoMaisIdoso() {
        val alunoMaisVelho = alunos.minByOrNull { alunos -> alunos.dataNascimento }

        if (alunoMaisVelho != null) {
            println("aluno mais velho é: ${alunoMaisVelho.nome}")
        } else {
            println("LISTA VAZIA")
        }
    }

    fun mediaIdades() {
        var idades = arrayOf<Int>()
        for (i in alunos) {
            var idade = 2023 - i.dataNascimento.year
            idades = idades.plus(idade)

        }
        val media = idades.sum() / idades.size
        println("Media: $media")
    }

    fun atualizarAlunoMatricula() {
        println("Digite a matrícula do aluno:")
        var matriculaUsuario = readln().toInt()
        for (aluno in alunos) {
            if (aluno.matricula == matriculaUsuario) {
                println("Digite o nome para qual deseja atualizar:")
                val nomeNovo = readln()
                aluno.nome = nomeNovo
            }
        }
        println("Matrícula não encontrada!")
    }

    fun removerAluno() {
        println("Informe a matrícula: ")
        var matricula = readln().toInt()
        for (aluno in alunos) {
            if (aluno.matricula.equals(matricula)) {
                alunos.remove(aluno)
                println("Aluno removido com sucesso!")
                return
            }
        }
        println("Não foi encontrado matrícula para o aluno informado. ")

    }
}



