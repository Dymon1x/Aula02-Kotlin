package br.com.digitalhouse.kotlincomobjetos.exercicio.ex3

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean {
        return (atleta.nivel >= dificuldade) && (energiaNecessaria >= 1) //return true, if condition is (True && True), else False
    }
}