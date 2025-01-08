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
    print("==========================")
    println(message2)
}