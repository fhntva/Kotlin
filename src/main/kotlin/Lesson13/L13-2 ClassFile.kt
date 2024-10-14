package Lesson13

class ContactL13_2(name:String, number: Long){
    var name = name
    var number = number
    var company:String? = null

    fun printContact()
    {
        if (company== null)
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