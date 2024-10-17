package Lesson14




fun main() {
    //test generation

    val circle1 = Circle(color = "White", range = 13) //40.82
    val circle2 = Circle(color = "Black", range = 18) //56.52
    val circle3 = Circle(color = "White", range = 4) //12.56

    val rectangle1 = RectangleSad(color = "Black", length = 13, width = 25) //325
    val rectangle2 = RectangleSad(color = "White", length = 25, width = 31) //775
    val rectangle3 = RectangleSad(color = "Black", length = 13, width = 31) //403

    var figureList: MutableList<Figure> = mutableListOf(circle1, circle2, circle3, rectangle1, rectangle2, rectangle3)

// end test gen


    var whiteSummary: Double = 0.0;
    var blackSummary: Double = 0.0

    val whiteList = figureList.filter { it.color.equals("White") } as MutableList<Figure>
    val blackList = figureList.filter { it.color.equals("Black") } as MutableList<Figure>


    var size = whiteList.size
    --size

    for (i in 0..size) {


        if (whiteList[i] is Circle) {
            var a = whiteList[i]
            a as Circle
            var sum = whiteList[i].circleSum(a.range)

            whiteSummary += sum

        }

        if (whiteList[i] is RectangleSad) {
            var a = whiteList[i]

            a as RectangleSad

            var sum = whiteList[i].rectangleSum(a.length, a.width)

            whiteSummary += sum


        }


    }


    size = blackList.size
    --size

    for (i in 0..size) {


        if (blackList[i] is Circle) {
            var a = blackList[i]
            a as Circle
            var sum = blackList[i].circleSum(a.range)

            blackSummary += sum

        }

        if (blackList[i] is RectangleSad) {
            var a = blackList[i]

            a as RectangleSad

            var sum = blackList[i].rectangleSum(a.length, a.width)

            blackSummary += sum


        }


    }
    println("Сумма белых фигур $whiteSummary")
    println("Сумма черных фигур $blackSummary")
}





