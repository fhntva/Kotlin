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







