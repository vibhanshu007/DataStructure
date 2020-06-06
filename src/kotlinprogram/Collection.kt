package kotlinprogram

fun main(args: Array<String>) {

    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    val word = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    word.getShortWordsTo(shortWords, 3)
    println(shortWords)

    val bob = Person("Bob", 31)
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)


    val doubled = List(3, { it * 2 })  // or MutableList if you want to change its content later
    println(doubled)

    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    //convert the List to a Sequence
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
            .map { println("length: ${it.length}"); it.length }
            .take(4)

    println("Lengths of first 4 words longer than 3 chars")
    // terminal operation: obtaining the result as a List
    println(lengthsSequence.toList())

    val number = listOf("one", "two", "three", "four")
    val filterResults = mutableListOf<String>()  //destination object
    number.filterTo(filterResults) { it.length > 3 }
    number.filterIndexedTo(filterResults) { index, _ -> index == 0 }
    println(filterResults)

    val number2 = listOf("one", "two", "three", "four")
    println(number2.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))

    val number3 = (1..100).toList()
    println(number3.joinToString(limit = 10, truncated = "<...>"))

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)

    val empty = emptyList<String>()

    println(numbers.any())
    println(empty.any())

    println(numbers.none())
    println(empty.none())

    /*val plusList = numbers + "five"
    val minusList = numbers - listOf("three", "four")
    println(plusList)
    println(minusList)*/

    val number4 = listOf("one", "two", "three", "four", "five")

    println(number4.groupBy { it.first().toUpperCase() })
    println(number4.groupBy(keySelector = { it.first() }, valueTransform = { it.toUpperCase() }))
}
fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()

}


data class Person(var name: String, var age: Int)

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}