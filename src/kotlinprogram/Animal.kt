package kotlinprogram

class Animal (name: String,type : String){

    var name:String? = null
    var type:String? = null

    init{
        this.name = name
        this.type = type
    }

}
class MyClass {
    companion object { }  // will be called "Companion"
}

fun MyClass.Companion.printCompanion() { println("companion") }

open class A {
    open fun foo(i: Int = 10) { println("A value $i") }
}

class B : A() {
    override fun foo(i: Int) { println("B value $i")}  // no default value allowed
}

fun main(args: Array<String>) {
    println(Animal("Tomy","Dog").type)

    var str : String = "Modi"
    println(str.substring(1,str.length-1))

    MyClass.printCompanion()
    var b = B()
    b.foo(12)

    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call

}

