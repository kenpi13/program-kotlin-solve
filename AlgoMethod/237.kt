// 二重ループの全探索 5
// https://algo-method.com/tasks/237

fun main() {
    val N = readLine()!!.toInt()
    var count = 0
    for (i in 1..N) {
        val word = readLine()!!
        if (word == word.reversed()) {
            count++
        }
    }
    println(count)
}