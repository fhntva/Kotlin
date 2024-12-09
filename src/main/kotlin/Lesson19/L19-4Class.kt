package Lesson19


enum class DAMAGE() {
    BLUE() {
        override fun damage(): Int {
            return 5
        }
    },
    GREEN() {
        override fun damage(): Int {
            return 10
        }
    },
    RED() {
        override fun damage(): Int {
            return 20
        }
    };

    abstract fun damage(): Int
}
    class Tank(name: String) {
        fun charge() {
            println("Танк заряжен")
        }

        fun Shoot(damage: Any) {
            println("Выстрел на $damage")
        }
    }
