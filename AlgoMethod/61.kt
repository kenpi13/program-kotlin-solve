// 標準入力 3-7
// https://algo-method.com/tasks/61

fun main() {
    var ans = 1001
    val N = readLine()!!.toInt()
    val itemList = readLine()!!.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
    itemList.forEach {
        if (it < ans) {
            ans = it
        }
    }
    println(ans)
}