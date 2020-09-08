package br.com.digitalhouse.kotlincomobjetos.exercicio.ex2

fun main() {
    var sessao = SessaoDeTreinamento()
    var jogador1 = JogadorDeFutebol("Leonardo", 100, 0, 0, 0)
    var jogador2 = JogadorDeFutebol("Joao", 90, 0, 0, 0)

    sessao.treinarA(jogador1)
    println("${jogador1.nome} ${jogador1.energia} ${jogador1.alegria} ${jogador1.gols} ${jogador1.exp}")
    println("-----------------------------------------------------------------")
    sessao.treinarA(jogador2)
    println("${jogador2.nome} ${jogador2.energia} ${jogador2.alegria} ${jogador2.gols} ${jogador2.exp}")

}
