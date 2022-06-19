// Example no: 20 String to Integer
fun main() {
    var str: String = "4"

    var num: Int = str.toInt() //kotlin will internally call Integer.parseInt()

    num++

    println(num)

}