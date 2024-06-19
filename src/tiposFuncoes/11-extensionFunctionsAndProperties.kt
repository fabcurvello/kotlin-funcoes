package tiposFuncoes

// https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions

// Extension Functions and Properties
/*
    Kotlin permite adicionar novos membros a qualquer classe com o mecanismo de extensões.
    Ou seja, existem dois tipos de extensões: funções de extensão e propriedades de extensão.
    Eles se parecem muito com funções e propriedades normais, mas com uma diferença importante:
    você precisa especificar o tipo que deseja estender.
 */

data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5

}