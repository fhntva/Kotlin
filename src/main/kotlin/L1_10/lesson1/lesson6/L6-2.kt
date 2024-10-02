package L1_10.lesson1.lesson6

import kotlin.time.times


fun main() { // simplest timer
    do {

        print("Вы попали в таймер введите количество секунд или 'стоп' что бы выйти из программы \n")

        val counter = readln().toString()

        if (counter.equals("стоп")) { break }

        var secons:Int = counter.toInt()
        do {


            println("Времени осталось $secons")

           Thread.sleep(1000)

            secons--
            if (secons==0) {break}

        } while (secons >= 0)


    } while (1> 0)


}

