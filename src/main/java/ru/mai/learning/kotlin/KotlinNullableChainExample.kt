package ru.mai.learning.kotlin

class Recipient(
        val address: Address?
)

class Address(
        val street: Street?
)

class Street(
        val name: String?
)

fun main(args: Array<String>) {
    val recipient: Recipient? = null
    val streetName = recipient?.address?.street?.name ?: "undefined"
}