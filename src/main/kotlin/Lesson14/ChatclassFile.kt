package Lesson14
//lesson 14-5


class Chat(
    val author: MutableList<String>,
   // val massages: MutableList<String>,
    val massagesList: MutableList<String>,


) {
fun addMassage(): String {
    var massage:String = readln()
    return massage
}
fun addThreadMassage(massage:String)
{
massagesList+=massage
}


}