class LongestPalindromeSolution {
    fun longestPalindrome(s: String): String {
      var chars = s.toCharArray()
      val sourceLength = s.length
      var maxLength = 0
      var maxLeft = 0
      var maxRight = 0
      for (l in 0 until sourceLength) {
        if (maxLength > sourceLength - l) {
          break
        }
        test@ for (r in sourceLength - 1 downTo l) {
          val targetLength = r - l + 1
          for (i in 0 until targetLength / 2) {
            if (chars[l + i] != chars[r - i]) {
              continue@test
            }
          }
          if (maxLength < targetLength) {
            maxLength = targetLength
            maxLeft = l
            maxRight = r
            break
          }
        }
      }
      return s.substring(maxLeft, maxRight + 1)
    }

    fun isPalindrome(chars: CharArray, l : Int, r: Int): Boolean {
      val length = r - l + 1
      for (i in 0 until length / 2) {
        if (chars[l + i] != chars[r - i]) {
          return false
        }
      }
      return true
    }
}

fun main(args: Array<String>) {
  println(LongestPalindromeSolution().longestPalindrome("abbccbbdl"))
}
