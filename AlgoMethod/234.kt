// 二重ループの全探索 1
// https://algo-method.com/tasks/234

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ")
    println(a.filter { isPrimeNumber(it.toInt()) && it.toInt() != 1 }.count())
}

fun isPrimeNumber(value: Int): Boolean {
    for (i in 2..sqrt(value.toDouble()).toInt()) {
        if (value % i == 0) {
            return false
        }
    }
    return true
}