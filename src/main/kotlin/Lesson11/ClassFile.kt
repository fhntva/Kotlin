package Lesson11

import L1_10.lesson1.lesson10.randMe1to99


class UserInf
    (
    val uidUser: Int,
    val logIn: String,
    val Password: String,
    val mail: String,
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
    var bio: String = "",
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
    var item: String,

    ) {}

class CookingList
    (
    var cookforWhat: Subcategory,
    var ingridient: String,
    var quant: Int,
) {}

class FavoriteList(
    var favorite: MutableList<Subcategory>,
)


// L 11-5

class Forum(
    var usersID: MutableList<String>,             // MutableList<MemberOfForum.userID>,
    var massages: MutableList<String>,
    var user: MutableList<String>,

    ) {
    fun printMe(i: Int) {
        for (sad in 0..i) {
            println("Автор: ${user[sad]} Cообщение: ${massages[sad]} ")
        }

    }
}

class MemberOfForum(
    val userID: MutableList<String>,
    val userName: MutableList<String>,
) {
    fun createNewUser(UserName: String): String {
        userName.add(UserName).toString()
        val UID = randMe1to99().toString()
        userID.add(UID)
        return UID

    }
}

class MessegeofForum(
    val userID: MutableList<String>,
    val messege: MutableList<String>,
) {

    fun createNewMessage(numbers: String): String {
        val mass = readln().toString()
        messege.add(mass)
        return mass.toString()
    }
}