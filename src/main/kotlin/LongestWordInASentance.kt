fun main() {
    val sentance = readln().split(" ")
    var maxLength = 0
    var maxLengthItem = 0
    sentance.forEachIndexed{index, word ->
        if ( word.length > maxLength){
            maxLength = word.length
            maxLengthItem = index
        }
    }
    val longestWord = sentance[maxLengthItem]
    println("word: $longestWord , length = $maxLength")
}