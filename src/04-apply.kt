// https://play.kotlinlang.org/byExample/06_scope_functions/04_apply

// apply
/*
    apply executa um bloco de código em um objeto e retorna o próprio objeto. Dentro do bloco,
    o objeto é referenciado por this. Esta função é útil para inicializar objetos.
 */

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription)
}