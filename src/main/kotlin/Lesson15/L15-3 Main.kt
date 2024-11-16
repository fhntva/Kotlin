package Lesson15

fun main()
{
    var user = User(
        login = "sad",
        password = "loveyou",

    )
    var mod = Moderator(
        login = "Meme",
        password = "loveyou",

        )

    user.talking()
    mod.talking()
    mod.moderation()
}