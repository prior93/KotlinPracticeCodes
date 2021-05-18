package com.example.listofstreetfood

import java.security.acl.Owner

fun main() {
    var objCar = Car()
    objCar.myBrand
    println("My Brand is ${objCar.myBrand}")
objCar.maxSpeed = 300
    println("My car speed is ${objCar.maxSpeed}")
}

class Car(){
    lateinit var owner :String

    var myBrand = "BMW"
    get() {
        return field.toLowerCase()
    }
var maxSpeed = 250


    init {
        this.owner = "Frank"
    }
}