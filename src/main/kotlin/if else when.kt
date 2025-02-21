package org.example
fun main() {
    val userAge = readln().toInt()  //мы написали псоле вар readln().toInt() это нам дает ввод с клавиатуры

    val resultText = if(userAge >= age_for_game) {
        "pokazat skritiy content"
    } else if (userAge == 13 || userAge == 17) { //мы можем одобавить else if и дописать доп контент
        "i hate you"
    } //насчет скобок если написано толька 1 строка то можно убрать ее но это ухудшит читабильность и можно все это написать в одну строку
else {    // если не хотм еще раз писать if пишем else и он работает только в паре с if
        "you are so cute"
    }
    //println(resultText)  //на самом деле можно везде написать println но нету смысла если все эти строки можно заменить val
    val sss = when(userAge) {        //println тебе вывод делает а when выполняет указанный код когда то или иное случается пишется через ->
        10 -> {println("not this")
        "watafak"}
        23 -> println("your number is 23")
        44 -> println("your number is 44")
        123 -> println("your number is 123")
        else -> println("another number")
    }
    println(sss)
}

const val Age_of_miror = 13