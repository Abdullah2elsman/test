package Collection

fun main(){
	val fruits1 = listOf("Apple","Orange", "Banana", "Avocado")
	val fruits2 = listOf("Blueberries","Lemon", "Mango")
	val fruits3 = listOf("Passion Fruit","Watermelon")

	val allFruits = listOf(fruits1,fruits2,fruits3)
	println(allFruits)
	println("================================")
	println(allFruits.flatten())
	println("================================")

//	val fruits4 = arrayOf("Apple","Orange", "Banana", "Avocado")
//	val fruits5 = arrayOf("Blueberries","Lemon", "Mango")
//	val fruits6 = arrayOf("Passion Fruit","Watermelon")
//
//	val allFruits2 = arrayOf(fruits4,fruits5,fruits6)
//	println(allFruits2)
//	println("================================")
//	println(allFruits2.flatten())
//	println("================================")

	println("How to combine Multiple Immutable Lists in Kotlin")
	println()
	val result = fruits1.plus(fruits2).plus(fruits3)

	println(result)
	println("================================")
	println(result.minus(fruits3))
	println("================================")
	println(result.minus("Lemon"))
	println("================================")

}