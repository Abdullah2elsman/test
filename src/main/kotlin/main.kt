// this is main function
fun main() {
    val message = """
        Hello,
        My Name is Mohammed.
        How are you?
    """.trimIndent()
val message2 = """
        Hello,
        My Name is Ahmed.
        How are you?
    """.replaceIndent("- ")

    println(message)
    println("==========================")
    println(message2)


    val name = "Tamer"
    val age = 25

    println("Hello $name Your age is $age")
    println("Hello $name your age is $age and your name is has ${name.length} Characters long")

    println(name.length)
}