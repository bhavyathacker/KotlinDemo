/*Example no: 17 Function Expression*/

@file:JvmName("First")
//by writing this our class name will be changed from FunctionExpressionKt to First

fun main() {
//    val result = add(5, 7)

    val result = max(15, 7)

    println(result)

    val calcAmount = calcAmount(50, 0.04)
    println("calculated amount with interest is : $calcAmount")

    val calcAmount1 = calcAmount(60)
    println("calculated amount with interest is : $calcAmount1")

    /* we can call the same method by passing Named Parameters */
    val calcAmount2 = calcAmount(amt = 70, interest = 0.05)
    println("calculated amount with interest is : $calcAmount2")

    /* Named Parameters can be passed in any sequence this is kotlin feature */
    val calcAmount3 = calcAmount(interest = 0.05, amt = 80)
    println("calculated amount with interest is : $calcAmount3")


}

/*fun add(a: Int, b: Int): Int {
    return a + b
}*/

fun add(a: Int, b: Int): Int = a + b    //inline function

fun max(a: Int, b: Int): Int = if (a > b) a else b  //we can use this a Ternary operator


//Example no:19. Default and Named Parameters

@JvmOverloads   // by this annotation kotlin will create two method with the same name: one with amount param and another with both the params
fun calcAmount(
    amt: Int,
    interest: Double = 0.03 //we have passed default param value as 0.03 so even if we don't pass value for interest it will calc with default interest value
): Int {
    return (amt + amt * interest).toInt()
}