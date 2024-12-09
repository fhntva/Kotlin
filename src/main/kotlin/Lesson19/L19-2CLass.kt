package Lesson19


enum class Category() {

    CLOTHES() {
        override fun printCategory() {
            println("Вы в категории Одежды")
        }
    },

    STATIONERY() {
        override fun printCategory() {
            println("Вы в категории Канцелярии")
        }
    },

    ANY() {
        override fun printCategory() {
            println("Вы в категории Разного")
        }
    };


    abstract fun printCategory()
}

class Clothes(ID: Int, Name: String,Category:Any) {
    var id = ID
    var Name = Name
    var Category = Category

    fun printMe() {
        println("$id,$Name,${Category}")
    }
}