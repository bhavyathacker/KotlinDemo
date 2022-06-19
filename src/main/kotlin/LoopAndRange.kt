fun main(args: Array<String>) {

    /*while and do while loops are same in kotlin */

    /******************************************************************************************************************/

    val nums = 1..16 // this is a Range

    for (num in nums) {  //this is the same syntax we use enhanced for loop/for each loop in java and here we don't have to specify the type
        println(num)
    }
    println("**************************")

    /******************************************************************************************************************/
    /*step*/

    for (num in nums step 2) {
        println(num)                //if we use step 2 then o/p will be as: 1 3 5 ...
    }
    println("**************************")

    /******************************************************************************************************************/
    /*print value in reverse order*/
    val numbers = 16 downTo 1   // we can not do via 16..1, we have to use the keyword downTo
    // val numbers = 16.downTo(1) above syntax is the same thing as we write this statement in java
    // downTo is a method belongs to an Int class, that's why we can use downTo between two Operands

    for (num in numbers) {
        println(num)
    }

    /******************************************************************************************************************/
    val numbs = 1 until 16  // this is the same thing as we specify limit in for loop

    for (num in numbs) {
        println(num)              // this will print the value from 1 to 15 because we have used until keyword
    }

    /*reverse*/
    for (num in numbs.reversed()) { //reversed is a method which belongs to class Ranges
        println(num)              // this will print the value from 15 to 1
    }

    println("the count is ${numbs.count()}")  // count method is also from Range class

    /******************************************************************************************************************/
    /*Range can be also work with characters*/

    val char = 'A'..'z'
    for (c in char) {
        println(c)          //we will get value from ASCII value 65 to 122 , A B C .. Z some special char and a b c ..z
    }

    println("the count is ${char.count()}")

}
