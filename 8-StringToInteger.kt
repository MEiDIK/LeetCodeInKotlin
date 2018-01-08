class SolutionStringToInt {
    fun myAtoi(str: String): Int {
      var result = ""
      var positive = true
      forchar@ for (c in str.trim().toCharArray()) {
        when (c) {
          in '0'..'9' -> result += c
          '-', '+' -> {
            if (result.length == 0) {
              result += c
              if (c == '-') {
                positive = false
              }
            } else {
              break@forchar
            }
          }
          else -> break@forchar
        }
      }
      if (result == "") {
        return 0
      }
      return result.toIntOrNull() ?: if (positive) Int.MAX_VALUE else Int.MIN_VALUE
    }
}

fun main(args: Array<String>) {
  println(SolutionStringToInt().myAtoi("9223372036854775809"))
}
