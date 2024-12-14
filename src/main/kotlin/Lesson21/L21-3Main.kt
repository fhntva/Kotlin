package Lesson21

import Lesson20.MainCharacter
import com.sun.tools.javac.Main

fun main()
{
    var oleg2 = MainCharacter()
    oleg2.hp = 49
    println(oleg2.hp)
    println(oleg2.isHealthy())
}



fun MainCharacter.isHealthy(): Boolean {
    if (hp <= 50)
    {
        return true
    }
    else return false

}