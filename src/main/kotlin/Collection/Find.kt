package Collection
fun main(){

	val names = listOf("Mohammed", "Tamer", "Ali", "Ahmed", "Osama", "Mohammed")
	val find = names.find{ it == "Mohammed"}
	println(find)
	println(find?.length)
	println("================================")
	val find2 = names.find{ it == "Mohab"}
	println(find2)
	println(find2?.length)
	println("================================")
	val find3 = names.first{ it == "Mohammed"}
	println(find3)
	println("================================")
	try
	{
		val find4 = names.first { it == "Mohab" }
		println(find4)
	} catch(ex: Exception){
		println(ex)
	}
	println("================================")
	val find5 = names.firstOrNull{ it == "Mohab"}
	println(find5)
	println("================================")

}
