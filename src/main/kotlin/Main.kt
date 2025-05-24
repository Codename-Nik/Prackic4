package org.example

fun Collection<Int>.sumGreaterThan(threshold: Int): Int {
    return this.filter { it > threshold }.sum()
}

fun main(){
    val number = (1..100).map { (0..20).random() }
    val sumGreaterThan10 = number.sumGreaterThan(10)
    println("Сумма чисел больше 10: $sumGreaterThan10")
}
