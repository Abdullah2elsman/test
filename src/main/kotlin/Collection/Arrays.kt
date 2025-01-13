package Collection

fun main(){
	val item1 = arrayOf(1,2,3,"Tamer",4)
	item1.forEach{ print("$it ") }

	println()
	println("=============================================")
	val item2 = intArrayOf(1,2,3,4,5);
	item2.forEach { print("$it ") }

	println()
	println("=============================================")
	val item3 = doubleArrayOf(1.0,2.2,3.3,4.4,0.5);
	item3.forEach { print("$it ") }

	println()
	println("=============================================")
	val item4 = arrayOf(
		User("Mohammed", "Tamer"),
		User("Abdullah", "Elsman")
	);
	item4.forEach { println("$it") }

	println("=============================================")
	var updateUser = item4.plus(User("Osama", "Tamer"))
	updateUser.forEach{ println(it) }

	println("=============================================")
	item4[0] = User("Foo", "Bar")
	val index = item4[0]
	item4.forEach{ println(it) }
	println(index)
}

class User(var firstName:String, var lastName:String){
	var fullName = "$firstName $lastName"

	override fun toString():String {
		return fullName
	}
}
