package org.example

fun main()  {
    // конкатинация строк или же сложение
         val greeting ="hello"         // приветствие
         val space =' '                // короткая строка просто пробел тип чар так как 1 символ
         val userName = "oqruus8374"   //добавим строк с именем пользователя всегда разное имя из-за этого вынесем его в отдельную переменую
    println(greeting + ","+ userName +"!" + space + "what is your doing")
    // интерполяция строк мы из этого же кода делаем меньше и понятнее
    println("$greeting,$userName! what is your doing")
            // больше строка val space не нужна котлин делает естественные пробелы и запятые и другие знаки припянания пишутся удобнее
// если же мы хотим что-то сделать в скобках то ну типо добавить выражения то
    println("to which you can respond ${24+2}")
    val skobki ="""             |сейчас узнает 
                      |где был минимальный отступ
         |или его не было?
  
    """.trimMargin()
    println(skobki)
    // так и чтобы сделать экранирование или же замена в тексте управляющих (служебных) символов на соответствующие им последовательности символов таких как " ( ' и тд то надо добавить
    // то надо добавить \ обратный слеш
    val slova ="And he say - \"this is awesome\""
    println(slova)
}