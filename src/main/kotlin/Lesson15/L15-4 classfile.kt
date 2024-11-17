package Lesson15




abstract class Things() {
    abstract var id: Int
    abstract var name: String
    abstract var quantity: Int
}

class Instrumental(
    override var id: Int,
    override var name: String,
    override var quantity: Int,
) : Things(), Finder

class RepairKit(
    override var id: Int,
    override var quantity: Int,
    override var name: String,
) : Things(), Finder

