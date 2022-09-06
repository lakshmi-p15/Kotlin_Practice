
fun main(){
    val maxValue = 13
    val stepCount = 3
    val numbers = mutableListOf<Int>()

    for ( i in stepCount..maxValue step stepCount)
        numbers.add(i)

    println(numbers)
}