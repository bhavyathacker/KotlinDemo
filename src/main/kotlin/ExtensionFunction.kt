//Example no:22. Extension Function


fun main() {

    val groot = Developer()
    groot.skill = "Java"
    groot.show()

    val yoda = Developer()
    yoda.skill = "SQL"
    yoda.show()

    val grogu = groot.plus(yoda)    //plus is an extension function
    grogu.show()

}

fun Developer.plus(any: Developer): Developer { //this function belongs to Developer class but externally, so it's called extension function

    val newSkill = Developer()
    newSkill.skill = this.skill + " " + any.skill
    return newSkill
}
