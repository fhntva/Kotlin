package Lesson16

class order()
{
    private var orderNumber:Int = 113123
    protected var status:String = "transit"
    fun statusChanger(a:String)
    {
        println("Status changed")
        status=a

    }
    fun manager()
    {
        println("Заявка на смену статуса менеджеру")
        var status ="ready"
        statusChanger(status)
    }
}