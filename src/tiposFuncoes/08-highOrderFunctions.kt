package tiposFuncoes

// https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions

//Higher-Order Functions
/*
    Uma função de ordem superior é uma função que recebe outra função como parâmetro e/ou retorna uma função.
 */

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}