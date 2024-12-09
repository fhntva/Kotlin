package Lesson19

fun main()
{
    var tank = Tank("S")
    tank.Shoot(damage = DAMAGE.BLUE.damage())
    tank.Shoot(damage = DAMAGE.GREEN.damage())
    tank.Shoot(damage = DAMAGE.RED.damage())
}