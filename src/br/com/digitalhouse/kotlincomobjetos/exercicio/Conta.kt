package br.com.digitalhouse.kotlincomobjetos.exercicio

class Conta (val numConta : Int = 0, var saldo : Double = 0.0,val titular : Cliente) {

    fun deposito(dinheiro: Double) {
        println("Transação : Depósito")
        saldo += dinheiro
        println("Novo Saldo: $saldo .")
    }

    fun saque(dinheiro: Double) {
        println("Transição: Saque")
        if(dinheiro > saldo) {
            println("Saldo Insuficiente.")
        }
        else {
            saldo -= dinheiro
            println("Novo Saldo: $saldo .")
        }
    }

}