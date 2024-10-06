package Lesson11


class UserInf
    (
    val uidUser: Int,
    val logIn: String,
    val Password: String,
    val mail: String
) {
    fun printUserInf(): String {
        var margin = """
            
        User ID     : ${uidUser}
        Login       : ${logIn}  
        Password    : ${Password}
        AccountMail : ${mail}
        
    """.trimIndent()
        return margin
    }


}


class UserInf2
    (
    val uidUser: Int,
    val logIn: String,
    var Password: String,
    val mail: String,
    var bio: String = ""
) {
    fun printUserInf(): String {
        var margin = """
            
        User ID     : ${uidUser}
        Login       : ${logIn}  
        Password    : ${Password}
        AccountMail : ${mail}
        Biography   : ${bio}
        
    """.trimIndent()
        return margin
    }


}


//Lesson 11-3


class talkingRoom(
    val title: String = "",
    val name: String,
    val numbers: String,
) {}


class roomTape(
    val listofRooms: MutableList<talkingRoom>,
) {}

class userSocial
    (
    val nickname: String,
    var status: String = "",        //// 3 переменных со статусом
    val avatar: String = "",
) {


    fun statusTalk() {
        var statusTalk = "“Разговаривает”, ";
        status = statusTalk
    }

    fun statusMute() {
        var statusMute = "Замьючен";
        status = statusMute

    }

    fun statusOff() {
        var statusOff = "Выключен микрофон"
        status = statusOff

    }

    fun printUserInfo(): String {
        var margin = """
            
        Никнейм     : ${nickname}
        Статус      : ${status}  
        Аватар      : ${avatar}
       
        
    """.trimIndent()
        return margin
    }


}

//lesson 11-4
class FoodCategory
    (
    var item: MutableList<Subcategory>,

    ) {}

class Subcategory(
    var item: String

) {}

class CookingList
    (
    var cookforWhat:Subcategory,
    var ingridient: String,
    var quant: Int
) {}

class FavoriteList (
    var favorite: MutableList<Subcategory> ,
)