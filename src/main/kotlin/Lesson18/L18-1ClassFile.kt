package Lesson18

class Order {
    var id: Int?
    lateinit var packages: String
    var Morepackages: MutableList<String?>

    constructor(
        id: Int? = null ?: 1,
        packages: String = null ?: "Sos",
        Morepackages: MutableList<String?> = mutableListOf(),
    ) {
        this.id = id
        this.packages = packages
        this.Morepackages = Morepackages
    }

    constructor(
        id: Int? = null ?: 1,
        Morepackages: MutableList<String?> = mutableListOf(),
    ) {
        this.id = id
        this.Morepackages = Morepackages
    }

    fun order(packages: String) {
        println("Заказан товар: $packages")
    }

    fun order(Morepackages: MutableList<String?>) {
        println("Заказаны товары: $Morepackages")
    }
}

