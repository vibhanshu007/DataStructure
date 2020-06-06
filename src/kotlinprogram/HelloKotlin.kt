package kotlinprogram

import java.util.*


fun main(args: Array<String>) {

    print("Hello Kotlin.. ")
    val country = "India.."
    val name = "Vibhanshu Shukla"
    var age = 29
    println(age++)
    println("My name is $name and my age is $age and I live in $country")
    //++age
    println("After one year my age will be $age")
    val reader = Scanner(System.`in`)
    println("Give me first Number ")
    val a: Int? = reader.nextInt()
    println("Give me second Number ")
    val b = reader.nextInt()
    val c = a?.plus(b)
    println("Addition of $a and $b is ${c}")

    // for loop

    for(item in 1..20){
        println(item)
    }
}