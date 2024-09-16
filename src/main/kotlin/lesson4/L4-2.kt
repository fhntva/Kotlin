package lesson4


fun main ()
{
    val weightLowLimit = 35; val weightHighLimit = 100 ; val  litersLimit = 100


    var cargo1 = 20 // kg
    var cargo2 = 80 // liters

    for (i in 1..2)
    {
        val averageLowT = cargo1 > weightLowLimit
        val averageHighT = cargo1 <= weightHighLimit
        val averageLitersT = cargo2 < litersLimit

        val сargoResult = true == averageLowT && averageHighT && averageLitersT

        println("Груз с весом $cargo1 кг и объемом $cargo2 литров соответствует категории 'average': "+сargoResult)

        cargo1 = 50 // kg
        cargo2 = 100 // liters
    }





}