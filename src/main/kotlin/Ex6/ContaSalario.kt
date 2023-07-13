package Ex6

class ContaSalario(agencia : Int, conta: Int, nomeCliente: String): Conta(agencia, conta, nomeCliente, 1100.0){
    override fun sacar(valor: Double) {
        if (valor>saldo){
            println("Saldo insuficiente")
        }else{
            super.sacar(valor)
        }
    }

    override fun depositar(valor: Double) {
        println("Quem está fazendo o depósito é a pessoa EMPREGADORA? (S/N)")
        val resposta = readln()
        resposta.uppercase()
        if (resposta.equals("S")){
            super.depositar(valor)
            println("Novo saldo: R$%.2f".format(saldo))
        }else{
            println("Conta Salário só pode receber depósito do empregador")
        }

    }

}