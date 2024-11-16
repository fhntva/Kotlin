package Lesson15

interface Talking
{
    fun talking()
    {
        return println("Пользователь написал сообщение")
    }

}

interface Moderation
{
    fun moderation()
    {
        return println("Модератор произвел удаление сообщение или пользователя")
    }

}