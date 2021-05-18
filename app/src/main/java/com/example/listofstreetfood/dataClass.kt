package com.example.listofstreetfood

data class User(var id: Long, var name: String) // Data class should have atleast 1 parameter

fun main() {
    val user1 =User(34,"Sam")
    var name = user1.name
    user1.id = 45
    user1.name = "Mike"
    println("Hi my name is ${user1.name} and  my ID  is ${user1.id}")

    var user2 = User(36,"Rob")
    println(user1 == user2)
    println("user Detail $user1")

    val update = user1.copy(74,"Sergio")
    println(update)

    println(user1.component1())// print the ID
    println(user1.component2()) // Prints the second component Name
}