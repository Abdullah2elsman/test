// this is main function
fun main()
{
    val values = listOf(1,2,3,4,5,6)
    for (i in values){
        print("$i ")
    }

    println()

    for(i in 0 until 10 ){
        print("$i ")
    }
    println()

    val start = 0
    val stop = 78
    for (i in start until stop step 3){
        println(i)
    }

    for (i in 100 downTo 0 step 2){
        println(i)
    }
}