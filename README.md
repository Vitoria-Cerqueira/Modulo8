## Modulo 8 - Kotlin Orientado a Objetos
<hr>

<h2>Exercicios: </h2>
1- Escreva um programa que simule o funcionamento de um caixa de
supermercado. O seu programa deverá conter uma classe Caixa, que
deverá conter uma lista de produtos, essa classe deverá permitir
cadastrar produtos, exibir os produtos cadastrados e uma função que
irá exibir o valor total da somatória de todos os produtos da lista.
Além disso, seu programa deverá conter uma classe Produto com os
atributos de nome do produto, valor e quantidade.

    a. Crie um arquivo contendo a função principal e crie pelo menos
    5 objetos do tipo Produto, crie um objeto do tipo Caixa e realize
    as ações de cadastrar produtos, exibir produtos cadastrados e
    exibir o valor total dos produtos cadastrados para o cliente.

    Observação: seu programa pode coletar os dados do usuário ou usar
    valores estáticos, além disso faça uso dos conceitos vistos em sala de aula e
    use a criatividade.

    Sugestão: você pode criar um menu para seu programa ser mais
    amigável(isso é opcional, e caso faça use a criatividade)

2- Criar a classe Pessoa com as seguintes características:<br>
- atributos: idade, dia, mês e ano de nascimento e nome da pessoa
    - métodos:<br>
        - o calculaIdade(), que recebe a data atual em dias, mês e anos,
          calcula e armazena no atributo idade a idade atual da pessoa.<br>
        - o informarIdade(), que retorna o valor da idade.<br>
        - o informarNome(), que retorna o nome da pessoa.<br>
        - o ajustaDataDeNascimento(), que recebe dia, mês e ano de
          nascimento como parâmetros e preenche nos atributos
          correspondentes do objeto.<br>

- Fazer um arquivo principal que instancie os objetos, criar dois
  objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/03/1879) e o outro representando Isaac Newton (nascido em
  04/01/1643) mostre quais seriam as idades de Einstein e Newton caso
  estivessem vivos.

        Observações: lembrar de usar o conceito de encapsulamento, além disso
        seu programa pode coletar os dados do usuário ou usar valores estáticos,
        além disso faça uso dos conceitos vistos em sala de aula e use a
        criatividade.

        Sugestão: você pode criar um menu para seu programa ser mais
        amigável(isso é opcional, e caso faça use a criatividade)

3- O calendário escolar está passando bem rápido, devido a isso, os
professores de SimCity estão com dificuldade para calcular as notas dos
alunos. Visando resolver a situação, a diretora da escola contratou você
para desenvolver um programa que leia as notas da primeira, segunda,
terceira e quarta avaliação de um aluno. Calcule e imprima a média
semestral.<br>
O programa só aceitará notas válidas (uma nota válida deve pertencer ao
intervalo [0,10]). Cada nota deve ser validada separadamente.<br>
Seu programa deve imprimir a mensagem “novo cálculo (1-sim 2-nao)”,
solicitando aos professores que informem um código (1 ou 2) indicando se
deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1
ou 2). Se for informado o código 1 deve ser repetida a execução de todo o
programa para permitir um novo cálculo, caso contrário o programa deve
ser encerrado.

    Entrada de dados:

    ● O arquivo de entrada contém vários valores reais, positivos ou
    negativos.
    ● Quando forem lidas 4 notas válidas, deve ser lido um valor inteiro X .
    ● O programa deve parar quando o valor lido para este X for igual a 2.

    Saída de dados: 

    ● Se uma nota inválida for lida, deve ser impressa a mensagem “nota
    inválida”.
    ● Quando 4 notas válidas forem lidas, deve ser impressa a mensagem
    "média = ” seguido do valor do cálculo.
    ● Antes da leitura de X deve ser impressa a mensagem "novo cálculo
    (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se
    o valor da entrada padrão para X for menor do que 1 ou maior do que 2.

Observações: lembrar de usar os conceitos vistos de POO(classes, atriutos,
métodos, objetos e encapsulamento).

Sugestão: você pode criar um menu para seu programa ser mais
amigável(isso é opcional, e caso faça use a criatividade).
