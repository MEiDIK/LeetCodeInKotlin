
 // Definition for singly-linked list.
  class ListNode(var `val`: Int = 0) {
      var next: ListNode? = null
  }

class SolutionAddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
      var result = ListNode(0)
      var index : ListNode? = null
      var more = 0
      var curL1 = l1
      var curL2 = l2
      while (curL1 != null || curL2 != null || more != 0) {
        index = index?.let{
            it.next = ListNode(0)
            it.next
          } ?: result
        index.`val` += (curL1?.`val` ?: 0) + (curL2?.`val` ?: 0) + more
        more = index.`val` / 10
        index.`val` %= 10
        curL1 = curL1?.next
        curL2 = curL2?.next
      }
      return result
    }
}

fun main(args: Array<String>) {
}
