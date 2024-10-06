package Lesson11

fun main() {

    val andrey = userSocial(
        nickname = "Андрей",
        avatar = "┬─┬ノ(ಠ_ಠノ)",
    )
    andrey.statusTalk()          //статус участника:?

    val undead = userSocial(
        nickname = "Undead",
        avatar = "┻━┻ミ＼（≧ロ≦＼）",

        )
    undead.statusMute()
    val root = userSocial(
        nickname = "RootUser",
        avatar = "(ノಠ益ಠ)ノ彡┻━┻",

        )
    root.statusOff()

    var talkingAboutNoting = talkingRoom(
        name = "Разговоры ниочем",
        title = "Разговорные разговоры?",
        numbers = andrey.nickname,                     //добавление участника
    )
    val tape = roomTape(
        listofRooms = mutableListOf(talkingAboutNoting)
    )

    println("Cписок доступных комнат")
    println(tape.listofRooms[0].name)
    println("Cписок людей")
    println(andrey.printUserInfo())
    println(undead.printUserInfo())
    println(root.printUserInfo())

}


