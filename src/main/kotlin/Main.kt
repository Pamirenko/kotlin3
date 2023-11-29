fun main(args: Array<String>) {
    val OwerScan: GameScan =GameScan (System.`in`)
    println("Напишите цифру чтобы атаковать!")

    when (OwerScan.nextInt()) {
        0 -> {
            val warrior = Character.Warrior("Силовой удар")
            val mage = Character.Mage("Огненный шар")
            val archer = Character.Archer("Точный выстрел")

            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }
        1 -> {
            val warrior = Character.Warrior("Силовой удар")
            val mage = Character.Mage("Огненный шар")
            val archer = Character.Archer("Точный выстрел")

            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)

            val hiller = object {
                val name = "Hiller"
                fun hill() {
                    println("$name вылечил всех!")
                }
            }
            hiller.hill()
        }
    }

}