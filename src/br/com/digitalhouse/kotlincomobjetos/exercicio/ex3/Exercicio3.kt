package br.com.digitalhouse.kotlincomobjetos.exercicio.ex3

import java.util.*
import kotlin.random.Random


fun main() {
    var prova1 = Prova(1, 90)
    var prova2 = Prova(2, 100)
    var prova3 = Prova(3, 80)

    var atleta1 = Atleta("João", 1, 90)
    var atleta2 = Atleta("Ana", 2, 100)

    println ("=== Prova 1 ===")
    println("${atleta1.nome} pode fazer a prova 1?: ${prova1.podeRealizar(atleta1)}")
    println("${atleta2.nome} pode fazer a prova 1?: ${prova1.podeRealizar(atleta2)}\n")
    println ("=== Prova 2 ===")
    println("${atleta1.nome} pode fazer a prova 2?: ${prova2.podeRealizar(atleta1)}")
    println("${atleta2.nome} pode fazer a prova 2?: ${prova2.podeRealizar(atleta2)}\n")
    println ("=== Prova 3 ===")
    println("${atleta1.nome} pode fazer a prova 3?: ${prova3.podeRealizar(atleta1)}")
    println("${atleta2.nome} pode fazer a prova 3?: ${prova3.podeRealizar(atleta2)}\n")
}