package Lesson18

abstract class animal()
{
    abstract var name: String
    abstract var food: String

    open fun eating()
    {
        println("$name $food")
    }
    open fun sleep()
    {
        println("$name sleeping")
    }
}
class Kitty(override var name: String, override var food: String): animal()
{
    override fun eating()
    {
        println("$name $food")
    }
    override fun sleep()
    {
        println("$name sleeping")
    }
}
class Dog(override var name: String, override var food: String): animal()
{
    override fun eating()
    {
        println("$name $food")
    }
    override fun sleep()
    {
        println("$name sleeping")
    }
}

class Fox(override var name: String, override var food: String): animal()
{
    override fun eating()
    {
        println("$name $food")
    }
    override fun sleep()
    {
        println("$name sleeping")
    }
}

