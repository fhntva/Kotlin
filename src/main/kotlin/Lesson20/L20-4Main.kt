package Lesson20

fun main()
{
    var list = listOf("sad","pig","more","zxc","vip","6",)
    run {
       list.mapIndexed { index, it -> if (index%2 == 1 ) println(it) ; }
    }
}