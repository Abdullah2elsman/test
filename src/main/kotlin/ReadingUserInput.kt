
fun main(){
//	println("Enter your Name: ")
//	val name = readLine()
//	println("Your name is $name")

//	println("Enter Your Age: ")
//	val age = readLine()!!.toInt()
//	println("Your Age is $age")
//
//	println(age.javaClass.name)

	print("Enter Your Name: ")
	val name = readln()!!.toString()
	val value = name.split(' ')
	val firstChar = value[0].substring(0,1)
	val lastChar = value[1].substring(0,1)

	println(firstChar+lastChar)

}