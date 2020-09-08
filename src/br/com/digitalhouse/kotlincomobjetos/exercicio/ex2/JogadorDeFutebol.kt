package br.com.digitalhouse.kotlincomobjetos.exercicio.ex2

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var exp: Int){

    fun fazerGol(){
        return println("GOOOOL!")
    }

    fun correr(){
        return println("Cansei")
    }

}