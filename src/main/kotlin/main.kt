// this is main function
fun main()
{
    val values = listOf("Kotlin", "Java", "Js", "HTML")

    for (i in values){
        println(i)
    }

    println ("=====================")
    values.forEach {println(it)}
}