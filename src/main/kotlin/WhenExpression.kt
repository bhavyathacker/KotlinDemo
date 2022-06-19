fun main() {

    /*
    * var is variable
    * val is constant
    * */
    val num: Int = 2

    when (num) {                                // when is a special keyword in kotlin which is almost same as switch
        1 -> println("One")                     // in switch, we use colon : but in when we use an arrow ->
        2 -> println("Two")                     //we don't have to use break statement in when
        3 -> println("Three")
        else -> println("Give a proper input")  // in switch, we default keyword but in when we use else keyword
    }

    /******************************************************************************************************************/
    /*when as an expression*/

    val str =
        when (num) {                        // when is a special keyword in kotlin which is almost same as switch
            1 -> "One"                      // in switch, we use colon : but in when we use an arrow ->
            2 -> "Two"                      // we don't have to use break statement in when
            3 -> "Three"
            else -> "Give a proper input"   // in switch, we default keyword but in when we use else keyword
        }

    println("str is $str")

    /******************************************************************************************************************/
    /*Kotlin when with multiple values*/
    val str1 =
        when (num) {
            1, 2, 3 -> "One"                //use comma to check for multiple values
            4 -> "Two"
            5 -> "Three"
            else -> "Give a proper input"
        }

    println("str is $str1")
}
