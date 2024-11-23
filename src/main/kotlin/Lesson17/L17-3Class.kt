package Lesson17

class Folders {
    var hidden = true
    var number = 150
        get()
        {
            if (hidden)
            {
                number =0
            }
            else
            {
                number=150
            }
            return field
        }
    var name = "seed"
        get() {
            if (hidden) {
                name = "hidden"
                number = 0
            }
            else{
                name = "seed"

            }
            return field
        }
}