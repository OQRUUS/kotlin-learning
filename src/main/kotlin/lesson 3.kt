package org.example
fun main() {
//логические операторы
    //оператор присваивание
    val a = 1 + 1
    val b = (1 == 1)        //== обозначает присваивание определенных числ
    // <,>,>=,<=, ==, != 2 последних используются в классической математике, другие дают знать равны ли или различаются и насколько разные символы
// ответ бывает только true или false
    val userAge = 43

    val com: Boolean = (userAge >= age_for_game) && !(userAge >= max_age_for_game) //мы сравниваем возраст константный и юзера и добавляем && чтобы выполнить оба условия
    // в скобки не обязательно но код становиться приятнее и удобнее и в некоторых случаях нужен обязательно если написано and или ||
    val result = userAge in age_for_game..max_age_for_game// но если мы хотим быстрее то пишекм in и сокращаем запись в разы
println("resulatat is: $com") // используем приколюхи из прошлого урока для красоты
    // лог операторы    && - и, ||- или, ! - не
    //println(0 < -1)
    //println(0 == 5)
    //println(0 == 3)
    //println(0 != 2)
 val e=true
    val n = !e
    println(n)//! превращает из true в false и наоборот




}
// и еще я не понял почему но const val должен находиться за скобками
const val age_for_game = 22 //мы пишем это для того чтобы задать определьное условие для открытие опр. контента
const val max_age_for_game =44
