package Lesson15

fun main ()
{
    var piano = Instrumental(
        id = 5,
        name = "piano",
        quantity = 3,

    )
    var buttons = RepairKit(
        id = 51,
        name = "pianoButtons",
        quantity = 35,

        )


         piano.find(piano.id)

}