package org.example
//Коллекции: списки (List). Функции для работы с коллекциями
fun main() {
    //List, Set, Map,
    //массив имеет строго факс размер и не может увеличивается или уменьшаться, изменить можно только создав копию с дополнителями или утрачеными эл-ли в списке же имеют методы add и remove для добавление и удаление
    //массив предоставляется классом Array<T>, List<T> явл интерфейсом и имеет разные реализации со своим функционалом
    //массивы оптимизированны для приметивов и имеют
    //различается процесс сравнения элементов
    val List: List<Int> = listOf(4, 4, 2) //неизменяемый список
    val list2: MutableList<Int> = mutableListOf(1,2,3) //изменяемый список
    val mutableList = mutableListOf(11,15,20,44,55,93)
            //println(mutableList)
    mutableList.add(42) //если хочешь что-то добавить то пользуйся add
    //println(mutableList)
    mutableList.add(0,42)
    println(mutableList)
    println(mutableList.contains(52)) //проверка на наличие элемента в списке true/false
    println(mutableList.isEmpty()) //содержит ли список хоть какой нибудь эллемент или нет
    println(mutableList.isNotEmpty())
println(mutableList.indexOf(42))
    println(mutableList.lastIndexOf(42))  //проверяем есть ли число в таблице или нет
    mutableList.sort() //отсортирует по возрастанию
    mutableList.sortDescending() //отсортирует по убыванию
    mutableList.reverse() //для изменения порядко номеров в обратную
    println(mutableList)
    mutableList.forEach{ number ->  //мы поменяли It на свое любое число для читабельности кода, это стилизация лямбды
        println(number)
    }  //для распечатки
    // интервал -> for
    // используется коллекция/список и тд -> forEach
    // break, continue ->for
    //обязательная функция это фильтрация коллекции так как она не изменяет список можно использовать val
    val mutableList2 = mutableList.filter {
        it == 42
    }
    //mutableList2.forEach{println(it)}
    val mutableList3 = mutableList2.map {
        it *2
    } //с функцией map можно обойти все функции списка и записать их преобразования в новый список
mutableList3.forEach{ println(it)}
}
