package Variaveis

class VariaveisConstantes {
    //Kotlin trabalha com dois paradigmas de programa��o: Orienta��o a Objetos e Funcional.
    //kotlin � uma linguagem fortemente tipada, ou seja, o tipo da vari�vel � definido no momento da declara��o.
    //O tipo da vari�vel pode ser definido implicitamente ou explicitamente.


    fun main() {
        // Constantes
        val PI = 3.14159
        val NOME = "Jo�o"
        val IDADE = 25
        val SEXO = 'M'
        val CASADO = false

        // Vari�veis
        var x = 10
        var y = 20
        var z = x + y

        println("PI: $PI") // O $ � utilizado para concatenar vari�veis com strings
        println("NOME: $NOME")
        println("IDADE: $IDADE")
        println("SEXO: $SEXO")
        println("CASADO: $CASADO")
        println("Soma de x + y = $z")
    }
}