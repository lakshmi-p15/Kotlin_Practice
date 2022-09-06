
val name: String = "Naga"
var greeting: String? = null

fun main() {

    // Regular if else statement
    if(greeting!= null){
        println(greeting)
    }else{
        println("Hi")
    }
    println(name)

    // if else assignment statement
    var greetingToPrint = if (greeting == null) "Hello" else greeting
    println(greetingToPrint)
    println(name)

    // when function declaration
    when (greeting){
        null -> greeting
        else -> "Hi"
    }
    println(greeting)
    println(name)

    // When assignment statement
    greetingToPrint = when(greeting) {
        null -> "Hello"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}