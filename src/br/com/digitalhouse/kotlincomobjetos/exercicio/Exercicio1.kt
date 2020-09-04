package br.com.digitalhouse.kotlincomobjetos.exercicio

fun main() {
    var cliente1 = Cliente("Jão", "Silva")
    var cliente2 = Cliente("Maria", "Lurdes")
    var conta1 = Conta(1, 200.00, cliente1)
    var conta2 = Conta(2, 200.00, cliente2)

    conta1.deposito(100.00)
    conta2.saque(100.00)
}