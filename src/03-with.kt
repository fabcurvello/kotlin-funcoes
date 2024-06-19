// https://play.kotlinlang.org/byExample/06_scope_functions/03_with

// with
/*
    with é uma função sem extensão que pode acessar membros de seu argumento de forma concisa:
    você pode omitir o nome da instância ao se referir a seus membros.
 */

class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port") // o with permite acesso como se fosse um this. É possivel acessar as vals host e port diretamente.
    }

    // instead of:
    println("${configuration.host}:${configuration.port}") // Como deve ser SEM usar host
}