fun main() {
    val input = intArrayOf(2,5,5,11)
    val target =10
    twoSum(input,target)
}
fun twoSum(nums: IntArray, target: Int) {
    for ( i in 0..nums.size-2){
        for ( j in 1 until nums.size){
            if(i != j && nums[i] + nums[j] == target) {
                println("$i, $j")

            }
        }
    }
}