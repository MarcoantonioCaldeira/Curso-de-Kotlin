package Variaveis

class VariaveisConstantes {
    //Kotlin trabalha com dois paradigmas de programação: Orientação a Objetos e Funcional.
    //kotlin é uma linguagem fortemente tipada, ou seja, o tipo da variável é definido no momento da declaração.
    //O tipo da variável pode ser definido implicitamente ou explicitamente.


    fun main() {
        // Constantes
        val PI = 3.14159
        val NOME = "João"
        val IDADE = 25
        val SEXO = 'M'
        val CASADO = false

        // Variáveis
        var x = 10
        var y = 20
        var z = x + y

        println("PI: $PI") // O $ é utilizado para concatenar variáveis com strings
        println("NOME: $NOME")
        println("IDADE: $IDADE")
        println("SEXO: $SEXO")
        println("CASADO: $CASADO")
        println("Soma de x + y = $z")
    }
}