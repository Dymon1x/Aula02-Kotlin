package br.com.digitalhouse.kotlincomobjetos.exercicio.ex2

class SessaoDeTreinamento() {
    fun treinarA(j: JogadorDeFutebol) {

        println("A experiência inicial é ${j.exp}")
        j.correr()
        j.energia -=10
        j.fazerGol()
        j.energia -= 5
        j.alegria += 10
        j.gols ++
        j.correr()
        j.energia -=10
        j.exp += 1

        println("A experiência final é ${j.exp}")


    }
}