fun main(){
    val numList = listOf(10, 5, 6, 7, 2, 3, 1, 4, 8, 9)
    val target = 4
    println(linearSearch(numList, target))
}

fun linearSearch(numList: List<Int>, target: Int): Any? {

    for ((i, n) in numList.withIndex()){
        if (n == target)
            return i
    }
    return -1
}
