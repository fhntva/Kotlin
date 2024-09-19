package lesson4

fun main() {


    // часть для генерации данных
    val damageRange = 0..1
    val peopleRange = 55..75
    val supplyRange = 25..100
    val weatherRange = 0..1

    val damage = damageRange.random()
    val peopleQuan = peopleRange.random()
    val supply = supplyRange.random()
    val weather = weatherRange.random()

    val a = 0 // диапазоны для проверки получ данных
    val b = 55
    val c = 70
    val d = 50

    val recommendDamage = damage == a
    val recommendPeople = peopleQuan >= b
    val fullStackPeople = peopleQuan >= c // 70 челов
    val supplyCheck = supply >= d
    val weatherCheck = weather == a

    if (recommendDamage && recommendPeople && supplyCheck)
    {
        println("Проверочный бокс 1 \n"+
                "Дамаг " + recommendDamage+
                "\n Людей" + recommendPeople+
            "\n Провизия " + supplyCheck)

    }
    if(fullStackPeople && weatherCheck && supplyCheck)
    {
        println("Проверочный бокс 2  \n"+
                "Погода в плюсе " + weatherCheck+
                "\n Людей 70 шт "  + fullStackPeople+
                "\n Провизия " + supplyCheck)


    }
        else
            { println( "Увы")   }


}