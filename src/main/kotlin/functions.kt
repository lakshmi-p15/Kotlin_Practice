// General function declaration
//fun sayHello(): String{
//    return "Hello"
//}

// assignment function declaration
//fun sayHello(): String = "hello"

//return type can be inferred based on return value
fun sayHello() = "Hi"

//with parameters
//fun sendHello(itemToGreet: String){
//    println("Hello $itemToGreet")
//}

//inline declaration
fun sendHello(itemToGreet: String) = println("Hello $itemToGreet")

fun helloWorld(greeting: String, itemToGreet: String) = println("$greeting, $itemToGreet")

fun main() {
    println(sayHello())
    sendHello("Kotlin")
    helloWorld("hello", "World")
}