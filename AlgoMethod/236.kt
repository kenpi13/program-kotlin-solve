// 二重ループの全探索 4
// https://algo-method.com/tasks/236

fun main() {
    val S = readLine()!!.split("").filter { it.isNotEmpty() }
    println(S.distinct().size)
}