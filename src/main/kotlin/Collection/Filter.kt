package Collection
fun main(){
	val names = listOf("Mohammed", "Tamer", "Ali", "Ahmed", "Osama", "Mohammed")
	val filter = names.filter{ it != "Mohammed"}

	println(filter)

	println("================================")
	val filter2 = names.filter{ it == "Mohammed"}
	println(filter2)
	println("================================")
	val ages = listOf(23,18,85,10,40,11,9,16)
	val filter3 = ages.filter{ it >= 18}
	println(filter3)
	println("================================")
	val filter4 = ages.filter(::isChild)
	println(filter4)
	println("================================")
	val filter5 = names.filterNot{it.contains("a")}
	println(filter5)
	println("================================")
	val filter6 = names.filter{it.contains("a")}
	println(filter6)
}

fun isChild(value:Int):Boolean{
	return value <= 18
}
