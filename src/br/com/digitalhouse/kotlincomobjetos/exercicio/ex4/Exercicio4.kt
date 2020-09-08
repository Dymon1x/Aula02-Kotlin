package br.com.digitalhouse.kotlincomobjetos.exercicio.ex4

import java.util.*

fun main(){
    var tripe1 = Tripe(true,0,10,0)
    var tripe2 = Tripe(false,0,8,0)
/*

    // o tripe começa dobrado
    println("O tripe está  dobrado ?: ${tripe1.dobrado}")
    tripe1.usar()
    println(tripe1.definirAltura(8))
    tripe1.prontoParaUsar()
    println(tripe1.definirAltura(0))
    tripe1.prontoParaGuardar()
*/

    //o tripe começa desdobrado
    println("O tripe está  dobrado ?: ${tripe2.dobrado}")
    println(tripe2.definirAltura(2))
    tripe2.prontoParaUsar()
    println(tripe2.definirAltura(6))
    tripe2.prontoParaUsar()
    println(tripe2.definirAltura(0))
    tripe2.prontoParaGuardar()
}
