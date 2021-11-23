// 数字の全探索 3
// https://algo-method.com/tasks/222

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    if (isPrimeNumber(n)) println("Yes") else println("No")
}

fun isPrimeNumber(value: Int): Boolean {
    if (value == 1) return false
    for (i in 2..sqrt(value.toDouble()).toInt()) {
        if (value % i == 0) {
            return false
        }
    }
    return true
}