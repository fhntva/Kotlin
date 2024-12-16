package Lesson22

fun main(){

    var book1 = RegularBook(
        namebook = "twinlight", author = "Mayer"
    )
    println(book1)
    var book2 = RegularBook(
        namebook = "twinlight", author = "Mayer"
    )
    println(book2)

    var book3 = DataBook(
        nameBook = "GhostData", author = "Mayer"
    )
    println(book3)
    var book4 = DataBook(
        nameBook = "GhostData", author = "Mayer"
    )
    println(book4)
    println(book1.equals(book2))
    println(book2.equals(book3))
    println(book3.equals(book4))
    //Указатели и классовые данные
}
