fun main(){
    val obj:Any = getStuff("3")
    val test = obj as? String
    println(test)
}
fun getStuff(value:String):Any {
    return when(value){
        "1" -> 99
        "2" -> "Hello"
        "3" -> true
        "4" -> 16.1
        else -> false
    }
}