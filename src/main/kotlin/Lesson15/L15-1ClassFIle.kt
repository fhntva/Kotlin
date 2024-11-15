package Lesson15

abstract class Animal:swim,walk,fly

class Crucian():swim
{
    override fun swim() {
        super.swim()
    }
}
class Gull():swim,walk
{
    override fun swim() {
        super.swim()
    }

    override fun walk() {
        super.walk()
    }
}
class Duck():swim,walk
{
    override fun swim() {
        super.swim()
    }

    override fun walk() {
        super.walk()
    }
}