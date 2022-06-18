fun main(args: Array<String>) {
    println("Hello World!")

    var objPerson = Person()

    objPerson.name = "Tittu"

    println("Name is :${objPerson.name}")

    objPerson = Person()

    println("Name is :${objPerson.name}")


//    calling java class from kotlin
    val telusko = Alien()

    telusko.name = "Navin"

    println("Name is :${telusko.name}")


}