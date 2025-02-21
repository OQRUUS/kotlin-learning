package org.example




    var uids: Int = 1

    class Todo(val name: String) {
        val uid: Int = uids++
        var isCompleted: Boolean = false
        fun displayInfo() {
            val isCompletedText = if (isCompleted) "[+]" else "[ ]"
            println("$uid. $isCompletedText $name")
        }
    }

    class TodoList {

        private val todos = mutableListOf<Todo>()

        fun addTodo(todo: Todo) {
            todos.add(todo)
            println("Todo добавлен.")
        }

        fun delTodo(uid: Int) {
            todos.removeIf { it.uid == uid }
            println("Todo с ID $uid удалено.")
        }

        fun listAll() {
            if (todos.isEmpty()) {
                println("У тебя пока нет Todo.")
            }
            else
            println("--- Твои Todo ---")
            todos.sortedBy { it.isCompleted }.forEach { it.displayInfo() }
        }

        fun getTodoById(uid: Int): Todo? {
            return todos.find { it.uid == uid }
        }

        fun getTodosByName(name: String): List<Todo> {
            return todos.filter { it.name.contains(name, ignoreCase = true) }
        }

        fun completeTodo(uid: Int) {
            val target = todos.find { it.uid == uid }
            if (target == null) {
                println("Todo с ID $uid не найдено.")
                return
            }
            if (target.isCompleted) {
                println("Это Todo уже выполнено.")
                return
            }
            target.isCompleted = true
            println("Todo с ID $uid выполнено!")
        }

    }

    fun showHelp() {
        println("add `название` - Добавить Todo")
        println("del `id задания` - Удалить Todo")
        println("list - Показать все")
        println("get `часть названия или id задания` - Показать Todo")
        println("complete `id задания` - Отметить Todo как выполненное")
    }

    fun main() {
        println("--- Todo-nator ---")
        println("Напиши help для просмотра всех доступных команд")
        val todos = TodoList()
        while (true) {
            print(">> ")
            val input = readln().trim()
            // Если ввели пустую строку — пропускаем
            if (input.isEmpty()) continue
            val command = input.split(" ", limit = 2)

            when {
                command.size == 1 -> {
                    when (command[0]) {
                        "help" -> showHelp()
                        "list", "ls" -> todos.listAll()
                        "quit", "exit", "q" -> break
                        "add" -> println("Использование: add `название`")
                        "del", "delete", "rm", "remove" -> println("Использование: del `id задания`")
                        "get" -> println("Использование: get `часть названия или id задания`")
                        "complete" -> println("Использование: complete `id задания`")

                        else -> println("Ошибка: неизвестная команда")
                    }
                }

                command.size > 1 -> {
                    when (command[0]) {
                        "add" -> {
                            val name = command.drop(1).joinToString(" ")  // Берем всё после "add"
                            if (name.isBlank()) {
                                println("Ошибка: название задачи не может быть пустым.")
                            } else {
                                todos.addTodo(Todo(name = name))
                            }
                        }

                        "del", "delete", "rm", "remove" -> {
                            todos.delTodo(command[1].toInt())
                        }

                        "get" -> {
                            val query = command[1]
                            val id = query.toIntOrNull()




                            if (id != null) {
                                // Если ввели число — ищем по ID
                                val todo = todos.getTodoById(id)
                                todo?.displayInfo()
                            } else {
                                // Иначе ищем по имени
                                val result = todos.getTodosByName(query)
                                if (result != null) {
                                    for (todo in result) {
                                        todo.displayInfo()
                                    }
                                }
                            }
                        }

                        "complete" -> {
                            val id = command[1].toIntOrNull()
                            if (id == null) {
                                println("Ошибка: ID должен быть числом")
                            } else {
                                todos.completeTodo(id)
                            }
                        }
                    }
                }
            }
        }
    }
