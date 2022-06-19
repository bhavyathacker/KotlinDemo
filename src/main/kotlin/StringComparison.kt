fun main() {
    var str1: String = "Groot"
    var str2: String = "groot"

    /*Java way of comparing strings*/
    if (str1.equals(str2)) {
        println("Same")
    } else {
        println("Not Same")
    }

    /*Kotlin way of comparing strings*/
    /*1*/
    if (str1.equals(str2, true)) {//true ignore case
        println("Same")
    } else {
        println("Not Same")
    }

    /*2*/
    if (str1 == str2) {
        println("Same")
    } else {
        println("Not Same")
    }

}