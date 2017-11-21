class LengthOfLongestSubstringSolution {
    fun lengthOfLongestSubstring(s: String): Int {
      var set = hashSetOf<Char>()
      var maxLength = 0
      val size = s.length

      s.forEachIndexed { index, c ->
        set.clear()
        var pos = index + 1
        set.add(c)
        var next : Char? = if (pos < size) s.get(pos) else null
        while (next != null) {
          if (set.contains(next)) {
            break
          }
          set.add(next)
          pos++
          next = if (pos < size) s.get(pos) else null
        }
        if (set.size > maxLength) {
          maxLength = set.size
        }
      }
      return maxLength
    }
}

class LengthOfLongestSubstringSolution2 {
    fun lengthOfLongestSubstring(s: String): Int {
      var maxLength = 0
      var hashMap = hashMapOf<Char, Int>()
      var currentLength = 0
      for (i in 0 until s.length) {
        val c = s.get(i)
        val preIndex = hashMap[c]
        hashMap[c] = i
        currentLength = if (preIndex == null || i - preIndex > currentLength) (currentLength + 1) else (i - preIndex)
        if (currentLength > maxLength) {
          maxLength = currentLength
        }
      }

      return maxLength
    }
}



fun main(args: Array<String>) {
  println(LengthOfLongestSubstringSolution2().lengthOfLongestSubstring("abba"))
}
