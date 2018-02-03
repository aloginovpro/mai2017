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

        val list = listOf(1, 5, 8, 4, 2, 6)
                .filter { number -> number % 2 == 0 }
                .sorted()
                //.forEach { number -> print(number) }
        val list2 = list.plus(10)
        mutableListOf(1).add(2)

        Fruit("red", 100, "apple")
        Fruit(weightGr = 100, name = "apple")
        Fruit(name = "banana", weightGr = 150)

        listOf(1, 5, 8, 4, 2, 6)
                .filter { it % 2 == 0 }
                .sorted()
                .forEach { print(it) } //System.out::print

    }

    fun smt(myJavaClass: MyJavaClass) {
        val prop: String = myJavaClass.prop!!
    }

}
