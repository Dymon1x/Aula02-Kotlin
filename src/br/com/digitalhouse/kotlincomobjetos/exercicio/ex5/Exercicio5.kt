package br.com.digitalhouse.kotlincomobjetos.exercicio.ex5

fun main() {
    var cliente = Cliente("Leonardo", "Carvalho", 123456789)
    var veiculo = Veiculo("CHEVROLET", "ONIX", 2020, "Preta", 0)
    var concessionaria = Concessionaria()

    concessionaria.registrarVenda(veiculo, cliente, 50.000)
}