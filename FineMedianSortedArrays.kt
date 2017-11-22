class FindMedianSortedArraysSolution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
      var i1 = 0
      var i2 = 0
      var length1 = nums1.size
      var length2 = nums2.size
      var sortedSize = length1 + length2
      var sortedArray = IntArray(sortedSize)
      var k = 0
      while (i1 < length1 || i2 < length2) {
        var e1 = if (i1 < length1)nums1[i1] else null
        var e2 = if (i2 < length2)nums2[i2] else null
        if (e2 == null || (e1 != null && e1 < e2)) {
          sortedArray[k] = e1!!
          i1++
        } else {
          sortedArray[k] = e2
          i2++
        }
        k++
      }

      if (sortedSize > 1 && sortedSize % 2 == 0) {
        return (sortedArray[sortedSize / 2] + sortedArray[sortedSize / 2 - 1]) / 2.0
      } else {
        return sortedArray[sortedSize / 2].toDouble()
      }

    }
}

fun main(args: Array<String>) {
  println(FindMedianSortedArraysSolution().findMedianSortedArrays(intArrayOf(), intArrayOf(2,3)))
}
