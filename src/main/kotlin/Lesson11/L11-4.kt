package Lesson11

fun main()
{
    var classicBurger = Subcategory(
        item = "Классический бургер"
    )
    var cheeseburger = Subcategory(
        item = "Чизбургер"
    )
    var cheeseMushroomsburger = Subcategory(
        item = "Чизбургер с грибами и сыром"
    )
    val Burger = FoodCategory(
        item = mutableListOf(classicBurger,cheeseburger,cheeseMushroomsburger)
    )

}