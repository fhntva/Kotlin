package Lesson21

import java.io.File
import java.util.*

fun main()
{
    val file = File("")
    file.addText("sad")
}
fun File.addText(newText: String) {
    val content = this.readText()
    this.writeText(newText.lowercase(Locale.getDefault()) + "\n" + content)
}