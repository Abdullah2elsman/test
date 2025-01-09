// this is main function
fun main()
{
    val age:Any = 1.0
    val obj:Any = Person("Tamer")
    if (obj is String) {
        println("It Is!")
        println(obj.javaClass.name)
    } else {
        println("It is Not!")
        println(obj.javaClass.name)
    }

}
    class Person(name:String)
