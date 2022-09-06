fun main() {
    println("Hello Kotlin!")

    val person = Person()
    person.printInfo()
    person.nickName = "Pan"
    println(person.nickName)
    person.printInfo()
}