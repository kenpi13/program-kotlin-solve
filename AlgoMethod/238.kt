// 二重ループの全探索 3
// https://algo-method.com/tasks/238
fun main() {
    val (L, R) = readLine()!!.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
    var count = 0
    (L..R).forEach {
        if (it.toString() == it.toString().reversed()) {
            count++
        }
    }
    println(count)
}