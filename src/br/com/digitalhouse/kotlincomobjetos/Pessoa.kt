package br.com.digitalhouse.kotlincomobjetos

class Pessoa(var nome: String, sobrenome: String){

    private fun criarRG(nome: String, numero: Int) : String{
        return nome + numero
    }

    fun passearComDog(cachorro: Cachorro){
        println("Estou passeando com meu cachorro o ${cachorro.nome}")
    }
}