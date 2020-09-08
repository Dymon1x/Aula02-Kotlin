package br.com.digitalhouse.kotlincomobjetos.exercicio.ex5

class Concessionaria(){
    fun registrarVenda(veiculo:Veiculo, cliente:Cliente, valor:Double) {
        println("O ${cliente.nome} ${cliente.sobrenome} comprou um ${veiculo.marca} ${veiculo.modelo} de cor ${veiculo.cor} pelo valor de %.3f".format(valor))
    }
}