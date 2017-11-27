class ReverseIntegerSolution {
    fun reverse(x: Int): Int {
      return try {if (x < 0) -(-x).toString().reversed().toInt() else x.toString().reversed().toInt()} catch (e: Exception) {0}
    }
}


fun main(args: Array<String>) {
  println(ReverseIntegerSolution().reverse(1534236469))
}
