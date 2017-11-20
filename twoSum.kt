
class SolutionTwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
      val needs :MutableMap<Int, Int> = HashMap()
      for (index in nums.indices) {
        val current = nums[index]
        needs.get(current)?.let {
          return intArrayOf(it, index)
        }
        needs[target - current] = index
      }
      return null
    }
}

fun main(args: Array<String>) {
    println(SolutionTwoSum().twoSum(intArrayOf(1,7,3,4,5,2), 7)?.toList())
}
