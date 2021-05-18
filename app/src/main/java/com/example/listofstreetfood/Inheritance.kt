package com.example.listofstreetfood

//Child class and Parent class
open class Vehicle( val name: String, val brand:String) {    // open to be used for inheritance
   open var range = 0.0

    open fun extendRange (amount: Double){
        if (amount> 0 )
            range += amount
        println("Range is $range \n")
    }

   open fun drive(distance:Double){
        println("Drove $distance km")
    }


    // Method

}

class Electricalcar(name: String,brand: String,batteryLife:Double) : Vehicle(name,brand){

   override var range = batteryLife * 5.0
    override fun drive(distance: Double) {
     println("Overiding in ElectricCar $distance")
    }

    fun drive(){
        println("Overiding in ElectricCar $range")
    }


}

fun main() {
    var myCar = Vehicle("A8","Audi")
    var myEcar = Electricalcar("Ts","tesla",86.0)

    myCar.drive(220.0)
    myCar.extendRange(10.0)

    myEcar.drive(300.0)
    myEcar.extendRange(4.0)

    // Polymorphism ------------------------------------------------------------
    myEcar.drive(60.0)
    myEcar.drive(5.0)
}

//-------------------------------- INTERFACE -------------------------------------------------
interface  Drivable { // to  extend the functionality
    val maSpeed : Double
    fun dive():String
    fun brake(){
        println("The drivable is Breaking")
    }
}
// IF class use the  Interface then it is obliged to uses its Properties and the FUnction