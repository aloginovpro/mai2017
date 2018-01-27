package ru.mai.learning.kotlin

class User(
    val name: String
) {
    fun sayHello() {
        print("hello!")
    }

    fun getAge2() = 20 + 10

    fun representYourself() = "Hello, I'm $name, I'm ${getAge()} years old"
    //return String.format("Hello, I'm %s, I'm %s years old", name, getAge());

    fun getAge(): Int {
        print("my age ...")
        return 35
    }

}