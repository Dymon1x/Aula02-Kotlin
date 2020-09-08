package br.com.digitalhouse.kotlincomobjetos.exercicio.ex4

class Tripe(var dobrado: Boolean, var altMin: Int, var altMax: Int,var altAtual: Int){
    fun definirAltura(novaAltura: Int): Int {
        this.altAtual = novaAltura
        var x = this.altAtual
        return x
    }

    fun dobrar(){
        println("Está dobrado")
    }

    fun desdobrar(){
        println("Está desdobrado")
    }

    fun guardar(){
        dobrar()
    }

    fun prontoParaGuardar(){
        guardar()
        if(altAtual == altMin){
            println("Está pronto para ser guardado")
        }else{
            println("Deve diminuir a altura")
        }
    }

    fun usar(){
        desdobrar()
    }

    fun prontoParaUsar(){
        if(altAtual >= (altMax/2)){
            println("Pode ser usado")
        }else{
            println("Não pode ser usado")
        }
    }
}