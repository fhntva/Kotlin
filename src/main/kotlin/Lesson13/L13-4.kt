package Lesson13

fun main()
{
    var contactSergei = ContactL13_4(name = "Sergei", number = 89883332211)
    var numberContact: MutableList<ContactL13_4> = mutableListOf(contactSergei)
    numberContact[0].printContact()

    println("Введите имя контакла ")
    val userName = readln()

    var userNumber: Any
    var counter = 0;
    do {

        println("Введите номер контакта")
        userNumber = readln().toLongOrNull() ?: "ЛОЛ"

        if (userNumber == "ЛОЛ") {
            println("Вы не ввели номер телефона")
        }
        if (userNumber != "ЛОЛ") // если указать тип Long нехуя не работает
        {
            ++counter
            println("В рот")

        }


    }while (1>counter)



    println("Введите компанию в который вы работате")
    val userCompany = readln()

    var newContact = ContactL13_4(name = userName, number = userNumber)

    newContact.company = userCompany
    numberContact += newContact

    numberContact[1].printContact()



}