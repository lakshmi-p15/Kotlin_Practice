fun main() {
    val maxValue = 13
    iterativeFibonacci(maxValue)
}
fun iterativeFibonacci(maxValue : Int) {
    val numbers = mutableListOf<Int>()

    for (i in 0..maxValue) {
        if (i == 0 || i == 1)
            numbers.add(1)
        else
            numbers.add(numbers[i - 1] + numbers[i - 2])
    }
    println(numbers)
}

