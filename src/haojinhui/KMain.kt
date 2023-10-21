package haojinhui


data class TreeNode(var value: Int, var left: TreeNode? = null, var right: TreeNode? = null)


fun maxValue(root: TreeNode): Int {
    val sumList = mutableListOf<Int>()
    var deque = ArrayDeque<TreeNode>()
    deque.addLast(root)
    while (deque.isNotEmpty()) {
        val size = deque.size
        var sum = 0
        repeat(size) {
            val node = deque.removeFirst()
            sum += node.value
            node.left?.let {
                deque.addLast(it)
            }
            node.right?.let {
                deque.addLast(it)
            }
        }
        sumList += sum
    }

    var max = 0
    var index = 0
    deque = ArrayDeque<TreeNode>()
    deque.addLast(root)
    while (deque.isNotEmpty()) {
        val size = deque.size
        var max2 = 0
        repeat(size) {
            val node = deque.removeFirst()
            node.left?.let {
                max2 = Math.max(max2, node.value - it.value)
                deque.addLast(it)
            }
            node.right?.let {
                max2 = Math.max(max2, node.value - it.value)
                deque.addLast(it)
            }
        }
        max = Math.max(max, sumList[index])
        sumList += max
        index++
    }
    return max

}