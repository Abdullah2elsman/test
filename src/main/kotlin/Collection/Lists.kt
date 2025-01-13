package Collection

fun main(){
	val item = listOf(1,2,3,4,5)
	item.forEach{ print("$it ") }
	println()
	println("==============================")

	val users = listOf(
		User("Mohammed", "Tamer"),
		User("Abdullah", "Elsman")
	)
	users.forEach { println(it) }
	println("==============================")

	println(users.first())
	println(users.last())
	println("==============================")

	val name:String? = null
	val stuff = if (name == null) emptyList() else  listOf(name)
	println(stuff)
	println("==============================")
//	item.add(50) don't add because this immutable list

	val item2 = mutableListOf(1,2,3,4,5)

	item2.forEach { print("$it ") }
	println();
	println("==============================")
	item2.add(6)
	item2.forEach { print("$it ") }
	println()
	println("==============================")
	item2.add(0,50)
	item2.forEach { print("$it ") }
	println()
	println("==============================")
	item2.remove(50)
	item2.forEach { print("$it ") }
	println()
	println("==============================")
	item2.removeAt(3)
	item2.forEach { print("$it ") }
	println()
	println("==============================")
	val item3 = mutableListOf(
		User("Mohammed", "Tamer"),
		User("Abdullah", "Elsman")
	)
	item3.forEach { println(it) }
	println("==============================")
	item3.removeAt(0)
	item3.forEach { println(it) }
	println("==============================")
	item3[0] = User("Mohammed", "Tamer")
//	item3[1] = User("Mohammed", "Tamer") give error
	item3.forEach { println(it) }
	println("==============================")

}