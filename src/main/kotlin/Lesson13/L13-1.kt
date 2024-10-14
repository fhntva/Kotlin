package Lesson13

  fun main ()
  {
      var humanContact = Contact(
          name = null.toString(),
          number = null,
          company = null.toString(),  //not fully correct
      )
        humanContact.name = "Andrey"
      humanContact.number = 89993332211

      println(humanContact.name)
      println(humanContact.number)
      println(humanContact.company)


  }
