import java.util.*

fun main() {
    val inputList = mutableListOf<Int>(3,2,3,1,2,4,5,5,6)
    val result = smallestInteger( 4, inputList)
    println(result)
}
fun smallestInteger(k : Int, inputList : MutableList<Int> ): Int{

    var queue = PriorityQueue<Int>()
    for (num in inputList) {
        queue.add(num)
    }
    while (queue.size > k) {
        queue.poll()
    }
    return queue.peek()
}