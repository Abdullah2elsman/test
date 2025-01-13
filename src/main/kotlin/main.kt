import kotlin.Exception
import kotlin.IllegalArgumentException
import kotlin.IllegalStateException

fun main(){
    val user = UserInfo("Tamer",9)

    try
    {
        checkAge(user)
        println("Done")
    } catch (ex:IllegalArgumentException){
        println("Catch The Exception")
    }

    println("hello")
}

private fun checkAge(p:UserInfo){
    if(p.age < 18){
        throw IllegalArgumentException  ("Error")
    }
}
data class UserInfo(val name:String, val age:Int)