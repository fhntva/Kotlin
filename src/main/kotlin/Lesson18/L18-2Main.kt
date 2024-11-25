package Lesson18

fun main() {

    val dice = FourSideDice()
    dice.rand()
    val dice2 = SixSideDice()
    dice2.rand()
    val dice3 = EightSideDice()
    dice3.rand()
    println("_______")
    val arrayofDice = arrayOf<Dice>(dice, dice2, dice3)
    for (element in arrayofDice) {
        element.rand()
    }
}