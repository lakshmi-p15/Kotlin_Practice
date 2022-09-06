//Accessing collections through function parameters
fun sayHello(greeting: String , hobbiesList: List<String>){
    hobbiesList.forEach{hobby ->
        println("$greeting $hobby")
    }
}

// varargs usage
fun sayHi(greeting : String= "Hello", vararg hobbiesList: String){
    hobbiesList.forEach{hobby ->
        println("$greeting $hobby")
    }
}
fun main()
{
    val hobbiesList = listOf("Kotlin", "Java", "Python")
    val hobbiesArray = arrayOf("Kotlin", "Json", "Java", "Python")

    sayHello("Hello", hobbiesList)
    sayHi("Hi")
    sayHi(greeting = "Hi", "Kotlin", "Python")
    sayHi("Hey", "Json", "Python")

    sayHi("hello", *hobbiesArray)
    sayHi(hobbiesList = *hobbiesArray, greeting = "Hey")
    sayHi(hobbiesList = *hobbiesArray)
}