import java.lang.NumberFormatException

// Example no: 20 String to Integer
fun main() {
    var str: String = "4"

    var num: Int = str.toInt() //kotlin will internally call Integer.parseInt()

    num++

    println(num)

    /*****************************************************************/
    // Example no: 21 Try Expression
    val str1: String = "4a"

    var num2: Int = try {
        str1.toInt()
    } catch (e: NumberFormatException) {
        -1
    }

    num2++
    println(num2)

}