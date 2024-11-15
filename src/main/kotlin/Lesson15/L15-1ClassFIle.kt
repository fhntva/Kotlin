package Lesson15

abstract class Animal:Swim,Walk,Fly

class Crucian():Swim
{
    override fun swim() {
        super.swim()
    }
}
class Gull():Swim,Walk
{
    override fun swim() {
        super.swim()
    }

    override fun walk() {
        super.walk()
    }
}
class Duck():Swim,Walk
{
    override fun swim() {
        super.swim()
    }

    override fun walk() {
        super.walk()
    }
}