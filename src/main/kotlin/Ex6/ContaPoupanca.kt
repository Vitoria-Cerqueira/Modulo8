package Ex6

class ContaPoupanca(agencia: Int, conta: Int, nomeCliente: String) :
    Conta(agencia, conta, nomeCliente, 0.0) {

    override fun sacar(valor: Double) {
        if (saldo - valor < 0) {
            println("Saldo insuficiente.")
        } else {
            super.sacar(valor)
            consultarSaldo()
        }
    }

    override fun depositar(valor: Double, empregado: Boolean) {
        if (empregado) {
            super.depositar(valor)
            consultarSaldo()
        } else {
            println("Conta Poupança só pode receber depósito do empregador.")
        }
    }
}