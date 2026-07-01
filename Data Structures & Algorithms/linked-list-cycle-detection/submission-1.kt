/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val seen = HashSet<ListNode>()
        var curr = head
        while(curr != null){
            if(!seen.add(curr)){
                return true
            }
            curr = curr.next
        }
        return false

    }
}
