/*Example no: 17 Function Expression*/
fun main() {
//    val result = add(5, 7)

    val result = max(15, 7)

    println(result)
}

/*fun add(a: Int, b: Int): Int {
    return a + b
}*/

fun add(a: Int, b: Int): Int = a + b    //inline function

fun max(a: Int, b: Int): Int = if (a > b) a else b  //we can use this a Ternary operator