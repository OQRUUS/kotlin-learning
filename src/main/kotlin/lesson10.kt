package org.example

//Функции (методы), тип возвращаемого значения, return

fun  getName() : String? = readLine() //как мы видим getName окрашена серым если сейчас выполнить функцию то выполниться только метод main мы его обьявили но нигде не вызвали чтобы вызвать надо его вызвать в нутри main


fun printNameAndAge(userName: String?, userAge: Int?) {             //метод в который вступает 2 параметра все что будет входить из вне надо записать в круглые скобки через запяту название и тип
    println("Данные пользователя: $userName,$userAge лет") //функция для записи после 2 функций их итог
}
fun getAge() : Int? = readLine()?.toInt() //мы уменьшили код в разы, убрав val и println

fun main() {
    printNameAndAge(userName =  getName(), userAge = getAge()) //метод который принимает в себя 2 параметра кол-во может формироваться от условния программы
    //Функция принимает в себя name и age, можно ее просто вызвать функция(name, age) а можно явно указать что мы передаем наш name в name функции, типо функция(name=name, age=age)
 val egor = 1
}
