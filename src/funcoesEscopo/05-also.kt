package funcoesEscopo// https://play.kotlinlang.org/byExample/06_scope_functions/05_also

// also
/*
    also funciona como apply: executa um determinado bloco e retorna o objeto chamado.
    Dentro do bloco, o objeto é referenciado por it, então é mais fácil passá-lo como argumento.
    Esta função é útil para incorporar ações adicionais, como registrar em cadeias de chamadas.
 */

data class Person2(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person2) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jr = Person2().also { writeCreationLog(it) }
    val jake = Person2("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}