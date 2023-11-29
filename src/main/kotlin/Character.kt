sealed class Character(
    val name: String, val weaponType: WeaponType
) {
    class Warrior(val ability: GameSrn) : Character(WARRIOR_NAME, WeaponType.SWORD)
    class Mage(val spell: GameSrn) : Character(MAGE_NAME, WeaponType.STICK)
    class Archer(val ability: GameSrn) : Character(ARCHER_NAME, WeaponType.BOW)

    companion object {
        const val WARRIOR_NAME = "Warrior"
        const val MAGE_NAME = "Mage"
        const val ARCHER_NAME = "Archer"
    }
}