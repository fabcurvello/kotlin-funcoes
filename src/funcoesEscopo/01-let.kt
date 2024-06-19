package funcoesEscopo// https://play.kotlinlang.org/byExample/06_scope_functions/01_let

// Let
/*
    A função da biblioteca padrão Kotlin let pode ser usada para escopo e
    verificações de nulos. Quando chamado em um objeto, let executa o bloco de
    código fornecido e retorna o resultado de sua última expressão.O objeto é
    acessível dentro do bloco pela referência it (por padrão) ou por um
    nome personalizado.
 */

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty = "text".let {               // 1 - "test" está usando a função de escopo let
        customPrint(it)                    // 2 - chamou customPrint() passando "test"
        it.isEmpty()                       // 3 - Valida se it (que é o "test") é nulo. A última instrução será o retorno.
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) { // recebe uma String que pode ser nula, pois tem -?-
        println("Printing \"$str\":")

        str?.let { // 4 - Executa o let somente se a String não for nula
            print("\t") // tabulação
            customPrint(it)
            println() // pula linha
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null) // -> Printing "null":
    printNonNull("my string") // -> Printing "my string": MY STRING
    printIfBothNonNull("First","Second") // FIRST : SECOND
}
