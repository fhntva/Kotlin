package Lesson11

// Главный вопрос как передавать переменные между классами в classfile
fun main() {
    val forumUser = MemberOfForum(
        userID = mutableListOf(),
        userName = mutableListOf(),

        )
    val userMassege = MessegeofForum(
        userID = mutableListOf(),
        messege = mutableListOf(),
    )

    val peaseofCrap = Forum(
        usersID = mutableListOf(),
        massages = mutableListOf(),
        user = mutableListOf(),  // не должно быть тут? как сделать вывод без этой части
    )

    var counter = 0 // костыль ебаный

    for (i in 0..1) {
        println("Давайте создадим пользователя, введите ник")


        val user = readln().toString()
        var userid = forumUser.createNewUser(user)
        peaseofCrap.usersID.add(userid)
        peaseofCrap.user.add(user)

        if (userid.equals(forumUser.userID[counter])) // без понятия как написать проверку исловия  в функциях класса
        {
            println("Введите сообщение")
            var userText = userMassege.createNewMessage(userid)
            peaseofCrap.massages.add(userText) //println(peaseofCrap.massages[0])

        }
        peaseofCrap.printMe(counter)
        counter++
        //if (counter==2)
        //{break}
    }



        // проверочный вывод всей хуйни
        println("forum user")
    println(forumUser.userID[0])
    println(forumUser.userName[0])
        println("userMassege")  //вывод хуйня не работает 1
    println(userMassege.userID[0])
    println(userMassege.messege[0])
        println("peaseofCrap")
    println(peaseofCrap.usersID[0])
    println(peaseofCrap.massages[0])
    println(peaseofCrap.user[0])

}

