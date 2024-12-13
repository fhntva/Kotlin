package Lesson21

fun main()
{
    var a = "tested"
    println((a.vovelCount(a)))
}


fun String.vovelCount(sentence: String): Pair<Int, Int> {
    val VOWELS = "aAeEiIoOuU"
    var vowelCount = 0
    var consonantCount = 0

    for (char in sentence) {
        if (char.isLetter()) {
            if (char in VOWELS) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }
    return vowelCount to consonantCount // первые гласные / согласные
}