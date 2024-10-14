package Lesson13

class ContactL13_4(name:String, number: Any){
    var name = name
    var number = number
    var company:String? = null

    fun printContact()
    {
        if (company== null||company=="")
        {
            company = "<Не указано>"
        }
        var margin = """
            
        Имя     : ${name}
        Номер   : ${number}  
        Компания: ${company}
       
        
    """.trimIndent()
        println(margin)
    }
}