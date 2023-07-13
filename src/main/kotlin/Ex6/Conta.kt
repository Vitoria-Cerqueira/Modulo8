package Ex6

open class Conta(var agencia: Int, var conta: Int, nomeCliente: String, var saldo :Double) {
    open fun sacar(valor : Double){
        saldo -= valor
    }
    open fun depositar(valor: Double){
        saldo += valor
    }
    open fun consultarSaldo(){
        println("Saldo atual: R$${saldo}")
    }

    open fun depositar(valor: Double, empregado: Boolean) {}
}