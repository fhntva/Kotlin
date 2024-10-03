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







