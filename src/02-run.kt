// https://play.kotlinlang.org/byExample/06_scope_functions/02_run

// run
/*
    Assim como let, run é outra função de escopo da biblioteca padrão.
    Basicamente, faz a mesma coisa: executa um bloco de código e retorna seu resultado.
    A diferença é que dentro do run o objeto é acessado por this.
    Isso é útil quando você deseja chamar os métodos do objeto em vez de passá-lo como argumento.
 */

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {  // 1 - Só executa o run se ns não for nula
            println("\tis empty? " + isEmpty()) // 2 - Se fosse let, teria que ser it.isEmpty(). O run trabalha como se fosse um this, então não precisa usar it, bastando apenas chamar a função diretamente.
            println("\tlength = $length")
            length  // 3 - esse é o retorno do run (que não está servindo pra nada)
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}