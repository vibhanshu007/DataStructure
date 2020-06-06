package kotlinprogram

fun main(args: Array<String>) {
    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }

    fun multiply(a:Int,b:Int):Int{
        return a*b
    }

    print(multiply(787,9))
}