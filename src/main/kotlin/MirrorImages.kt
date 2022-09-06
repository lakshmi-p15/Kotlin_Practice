fun main() {
    val inputArray = intArrayOf()
    println(mirrorImagesTwo(inputArray))
}
//fun mirrorImages(inputArray: IntArray) : Int{
//
//    val m = inputArray.size
//    val n = m
//    val resultsArray = Array(m+1) {IntArray(n+1)}
//    var result = 0
//
//    for (i in 0..m){
//        for (j in 0..n){
//            if (i == 0 || j == 0)
//                resultsArray[i][j] = 0;
//            else if (inputArray[i-1] == inputArray[ n-j]){
//                resultsArray[i][j] = resultsArray[i-1][j-1]+1
//                result = Math.max(result, resultsArray[i][j])
//            }else
//                resultsArray[i][j] = 0
//        }
//    }
//    for (row in resultsArray) {
//        println(row.contentToString())
//    }
//    return result
//
//}
fun mirrorImagesTwo(inputArray: IntArray) : Int{
    var maxCount = 0
    var count = 0
    val n = inputArray.size

    for (i in inputArray.indices){
        count =0
        for (j in i until n){
                if (inputArray[j] == inputArray[n-1-j+i]){
                    count += 1
                }else {
                    if (maxCount < count)
                        maxCount = count
                    count = 0
                }
            }
        if (maxCount < count)
            maxCount = count
        }

    return maxCount
}

