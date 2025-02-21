package org.example

fun main() {
    val ing1 = "перец"
    val ing2 = "система"
    val ing3 = "перец"
    val ing4 = "соль"
    val ing5 = "свекла" //очень много писать легче создать массив
    val arratIng: Array<String> = arrayOf("яйцо", "система", "перец", "соль")
    val IntArray: IntArray = intArrayOf(4, 4, 2)
    val charArray: CharArray = charArrayOf('4', '4', '2')

    var intarray3 = intArrayOf(1, 2, 3, 4, 5)  //на наглядном опыте видно как работает вал и вар
    intarray3 = intArrayOf(1, 2, 3, 4, 5)
    println("размер массива ингредиента ${arratIng.size}") //с помощью команды size мы узнаем размер массива или же кол-во элементов
    println(arratIng.indexOf("помидор")) //проверяет есть ли сам обьект или же индекс и начинается с 0 из-за этого он нам даст -1
    println(arratIng[1])
    println(arratIng[2])  //получаем индекст  массива или же определенный обьект если же его не будет то вылезит ошибка
    //если захотим поменять опр ингридиент то пишем следующее
    arratIng[3] = "паприка"
    println(arratIng[3])
    arratIng.set(1, "капуста")
    arratIng.get(1)
    for (i in arratIng){ //добавляет красивый ответ и вполне мало строк занимает
       //println(i)// или же чтобы было красиво делаем так-
        println("ингридиенты ${arratIng.indexOf(i) + 1}: $i")
    }

}