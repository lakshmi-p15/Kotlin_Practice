fun main() {
   // val stations = listOf("main street", "monastery", "dublin")
    val stations = readln().split(",")

    print("Train is stopping at ")
    stations.forEachIndexed { i,it ->
        if (i > 0 && i == stations.size-1){
            print("and $it.")
        }
        else
            print("$it, ")

    }
}