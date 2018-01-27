package ru.mai.learning.kotlin

object MyFirstClass {

    @JvmStatic
    fun main(args: Array<String>) {
        val user = User("alex")
        val name = "abc";
        println("Hello $name")
        println("Hello ${user.name}")
        println("""
                    SELECT *
                    FROM x
        """)

        listOf(1, 5, 8, 4, 2, 6)
                .filter { number -> number % 2 == 0 }
                .sorted()
                .forEach { number -> print(number) }
    }

}
