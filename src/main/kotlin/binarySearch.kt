fun main(){
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val target = 1
    println(binarySearch(numList, target))
    println(recursiveBinarySearch(numList, target))
}

fun binarySearch(numList: List<Int>, target: Int): Int {

    var first = 0
    var last = numList.size - 1
    while (first <= last){
        val middle = (first + last) / 2

        if (numList[middle] == target)
            return middle
        else if (numList[middle] < target)
            first = middle + 1
        else
            last = middle - 1
    }
    return -1
}

fun recursiveBinarySearch(numList: List<Int>, target: Int): Boolean {
    return if (numList.isEmpty()) false
    else{
        val middleIndex = numList.size / 2
        if (numList[middleIndex] == target) true
        else if (numList[middleIndex] > target)
            recursiveBinarySearch(numList.subList(0,middleIndex), target)
        else
            recursiveBinarySearch(numList.subList(middleIndex+1,numList.size), target)
    }
}