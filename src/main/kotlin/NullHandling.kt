fun main() {

    var str: String? = null // by placing question mark besides (type) we are allowing variable to assign null value

    println(str)


    var groot1 = Person()
    println(groot1.name?.length)

    var groot: Person? = Person()
    groot = null

    println(groot)

    println(groot?.name?.length)

    /*by using ? we are handling the null value */

    println(groot1.name?.length)

    println(groot1.name!!.length) //this will give java.lang.NullPointerException


}
