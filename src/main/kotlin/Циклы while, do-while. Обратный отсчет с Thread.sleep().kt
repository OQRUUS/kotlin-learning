package org.example

import java.time.Duration

fun main () {
    //если хотим сделать что-то например рекламу которая через время бы закрывалась для этго надо будет 5 раз писать принтл это очень долго муторна и некраисво для этого есть while, do while
    var counter = 5
    while (counter > 0) {
        println("реклама закончиться через ${counter--}")      //если прям шяс нажать выполнить то он не будет уменьшаться потому что мы это не написали из-за этого добавляем 2 минуса и засунуть их в {}
    Thread.sleep(Duration.ofMillis(1000))    //я не нашел как иначе написать милисекунду ну там можно и секунду и минуты без разницы
    }
    do {
        println("реклама закончиться через ${counter--}")
        Thread.sleep(Duration.ofMillis(1000))
    } while (counter > 0)    //это тоже самое что и выше просто в этом случае в начале выполниться операция даже если и будет false
}
