class ArrayPivotIndex {

        fun pivotIndex(nums: IntArray): Int {
            var sumOfNums = 0
            nums.forEach{num -> sumOfNums += num}

            var leftSum = 0
            nums.forEachIndexed{index, num ->
                sumOfNums -= num

                if(leftSum == sumOfNums)
                    return index

                leftSum += num
            }

            return -1
        }

   // You are given an integer array nums where the largest integer is unique.

   // Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
    fun dominantIndex(nums: IntArray): Int {
        var largestElement : Int = Integer.MIN_VALUE
        var maxIndex : Int = -1
        nums.forEachIndexed{ index,num ->
             if( largestElement < num){
                largestElement = num
                maxIndex = index
            }
        }

        for((index,num) in nums.withIndex()){
            if ( index == maxIndex)
                continue

            if( largestElement < 2*num)
                    return -1
        }

        return maxIndex
    }
    fun plusOne1(digits: IntArray): IntArray {
        var i = digits.size -1
        for((index,num ) in digits.withIndex()) {
            if(num == 9) {
                i = index
                break
            }
        }

        if(i == -1){
            val result = IntArray(digits.size+1)
            result[0] = 1
            return result
        }
        val result = IntArray(digits.size)
        result[i] = digits[i]+1
        println(result[i])
        for (j in 0..i){
            result[j] = digits[j]
        }
        return result
    }
//    fun plusOne(digits: IntArray): IntArray {
//        val builder = StringBuilder()
//        digits.forEach { digit ->
//            builder.append(digit)
//        }
//        val number = builder.toString().toInt() + 1
//
//        val temp = number.toString()
//        val stringArray = temp.toCharArray()
//        val result =stringArray.sliceArray(stringArray.indices)
//        println(result)
//        return digits
//
//    }

}
fun main()
{
    val arrayPivotIndex = ArrayPivotIndex()
    var numArray : IntArray= intArrayOf(1,7,3,8,4,6)
    val index = arrayPivotIndex.pivotIndex(numArray)
    //println(if(index == -1) "no index found" else index)
    //println(arrayPivotIndex.dominantIndex(numArray))
    //println(arrayPivotIndex.plusOne(numArray).contentToString())
}