import java.util.*

/*Example no: 16 List & Map*/
fun main() {

    /*List*/
    /* in java generally we use Collections api like below
    *
    * List < Integer > nums = Arrays.asList ( 1,2,3,4 ) ;
    * for ( int i : nums )
    * {
    *
    * }
    *
    * */

    /*the same thing we can do in kotlin as*/

    var numbs = listOf(1, 2, 3, 4)


    for (numb in numbs) {
        println(numb)       //we are printing values 1 2 3 4
    }

    /*if we want to print values with index number as well */
    for ((i, e) in numbs.withIndex()) {      // i is index number and e is element
        println("on index $i value is : $e")
    }

    /*****************************************************************************************************************/
    /*Map*/
    // Map is creating of a key value pair
//    Java
    /*   Map < String , Integer > aliens = new TreeMap < > ( ) ;
         aliens.put ( " Yoda " , 543 ) ;
         aliens.put ( " Groot " , 409 ) ;
     */

//    Kotlin
    val aliens = TreeMap<String, Int>()
    // to add the values
    aliens["Yoda"] = 543
    aliens["Groot"] = 409

    println(aliens)

    //to fetch values in java we need to use keySet entrySet and all : ref. https://www.geeksforgeeks.org/map-interface-java-examples/
    // but here

    for ((name, age) in aliens) {   // we are using tuples (tuple holds two values )
        println("$name : $age")
    }


}