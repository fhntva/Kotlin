package Lesson19

fun main()
{

    Category.CLOTHES.printCategory()
    val wearingPants = Clothes(3,"штаны", Category = Category.CLOTHES)
    wearingPants.printMe()
}