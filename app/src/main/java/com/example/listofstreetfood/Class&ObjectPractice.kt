package com.example.listofstreetfood
/*
// ------------------------------------- CLASS  -----------------------------------------
fun main() {
   var objPerson =  Person("Prior","Adhikary") // Object of class
var objPerson2 = Person()
}
-----------------------------------------------------------------------------------------
// **** Constructor allows us to give the value while we create object of the class ****
// ------------------------------------- CLASS  -----------------------------------------
//class Person constructor(fName:String,lName:String) {  // OR
    class Person(fName:String= "john",lName:String="Mayer") {

        init {
            println("Person Created $fName $lName") //Person Created Prior Adhikary
                                                    // Person Created john Mayer
        }
}
 */
fun main() {
var objPerson = Person()
    objPerson.hobbies = "Dancing"
    objPerson.age = 25
    objPerson.StateHobbies()
    println("--------------------------------------------------------")
    var obePerson2 = Person("killi","Manjaro")
    obePerson2.hobbies = "Climbing mountain"
    obePerson2.age = 30
    obePerson2.StateHobbies()
    println("--------------------------------------------------------")
    var objPerson3 = Person("Julia","levona",34)
    objPerson3.StateHobbies()
}
// ------------------------------------- CLASS Member or Properties  ---------------------------
class Person (fName:String= "john",lName:String="Mayer"){
    var age: Int? = null
    var hobbies = "Watching  Netflix"
var fName:String? = null
    var lName:String? = null
    // Initializer Block
    init {
        println("Person Created $fName $lName")
    }

    // Secondary Constructor
    constructor(fName:String= "john",lName:String="Mayer", age: Int) : this(fName, lName) {
        this.age = age
        this.fName = fName
        this.lName = lName

    }

    // Member Function  or Method
    fun StateHobbies(){
        println("My hobbies is $hobbies")
        println("$fName age is $age")
    }
}