package Lesson16

import java.security.KeyStore.TrustedCertificateEntry

class player(name: String) {
    var punchpower = 1..9
    var hp = 100
    var punchPower = punchpower.random()
    var healMe: Boolean = true

    fun heal() {
        var healingpower = 1..5
        var heal = healingpower.random()
        println("На вас прошел хил $heal")
        hp += heal
        println("Ваше хп $hp")
        if (hp <= 0) {
            healMe = false
        }

    }

    fun playerDamageTaken() {
        var damagePower = 1..9
        var damage = damagePower.random()
        println("Игрока ударили  на  $damage хп")
        hp -= damage
    }

    fun game() {
        do {
            println("игрок ударил на $punchPower")

            playerDamageTaken()
            heal()
            if (healMe == false) {
                println("Игра окончена, ваше хп = $hp")
            }
        } while (healMe)

    }


}