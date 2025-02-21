package org.example

fun main()   {
   //диапозон или же интервал
    val range1: IntRange = 42..4277 //диапозон можно создать с помощью 2 точек
    val range2: IntRange = 42 until 427 //или с помощью until разница только в том что не влючитает последние вырожение
    val range3: LongRange = 52..422L
    val range4: ClosedRange<Double> = 123.1..44.2
    val range5: CharRange = 'a'..'z'
    val range6: ClosedRange<Float> = 42.1f..442.1f
    //работает со всеми типами данных
    val range7: IntProgression = 42..442 step 2
    val range8: IntProgression = 442 downTo 42 step 2 //это в обратную сторону
            //in ,!in
    val a =52 in range1  //проверяем принадлежность к определенному интервалу, in вернет true если обьект имеется в диапозоне
    val b =52 !in range1 //in вернет true если обьект имеется в диапозоне с отрицанием
    println(a)
    println(b)
            // когда использорвать while а когда когда for?
    //если известно какое кол-во операций цикла нужно совершить то следует использовать for а если не известно или условаия меняются тогда лучше while или do while
            //break, continue, return
    for(i in 5 downTo 1){
        if (i == 3){
     //       println("ПОЛЬЗОВАТЕЛЬ НАЖАЛ на кнопку \"пропустить\"")
      //      break //прирывает функцию
      //      println("i == 3,i не будет распечатан")
        //    continue //продолжает новый круг
            return //как i будет равен 3 вызовиться return и программа совершит свое выполнение
        }
        println("реклама закончиться через $i")  //теперь используя из прошлого урока for мы написали тоже самое что и на прошлом только это заняло у нас 3 строки
        Thread.sleep(1000)
        //for(i in range2 step 8) {
            //println(i)
        }
    println("продолжить работу")
        }


