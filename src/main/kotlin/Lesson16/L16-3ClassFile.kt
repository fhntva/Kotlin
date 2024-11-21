package Lesson16

class user()
{
    var userLogin = "USER"
    private  var userPass = "1123"
    fun CheckPassword(password:String)
    {
        if (password == userPass)
        {
            println("Пароль введен коректно")
        }
        else{
            println("Неккоректный ввод")
        }

    }
}