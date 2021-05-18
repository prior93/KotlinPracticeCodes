package com.example.listofstreetfood


//------------------------------------------ LAMBDA EXPRESSION -----------------------------
/*
    //val sum :(Int,Int) -> Int =  {a:Int,b:Int -> a + b}
// Println(sum(10,5))
// OR
    val sum = {a:Int, b: Int -> println(a+b)}
    sum(10,5)

    //--------------------------------VISIBILITY MODIFIER -----------------------------


open class Base() {
    var a = 1 // public by default
    private var b = 2 // private to base calss
    protected  open val c = 3 // Visible to the base and derived class
    internal val d = 4 // visible inside the same module
    protected fun e(){} // visible to the base and the derived class
}

class Derived:Base(){
    //a,c,d and e() // of base class are visible
    // b is nonviable
    override val c = 9 // c is proected

}

fun main() {
    val baseObj = Base()
    // baseObj.a and base.d are visible
// baseObj.b , baseObj.c and baseObj.e() are not visisble
    val deriveObj = Derived()
    // derivedObj.c is not visible
}

 */
//-------------------------------- Class and Nested Class (INNER CLASS)-----------------------------

class OuterClass {
    private var name :String = "Mr Miyagi"

    inner class NestedClass {
        var description :String = "Code inside the Nested class"
        private var id:Int = 101
        fun foo(){
           // println("name is $name")// Cannot access the outer class member
            println("Id is $id")
        }
    }
}

fun main() {
    println(OuterClass().NestedClass().description) //Code inside the Nested class
    var obj = OuterClass()
    obj.NestedClass().foo() //Id is 101
}