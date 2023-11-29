object CharacterCommon {
    fun attack(character: Character) {
        val charName = character.name
        when (character) {
            is Character.Warrior -> println("$charName с атакой! Способность: ${character.ability}")
            is Character.Mage -> println("$charName с атакой! Заклинание: ${character.spell}")
            is Character.Archer -> println("$charName с атакой! Способность: ${character.ability}")
        }
    }


    fun defend(character: Character) {
        val charName = character.name
        when (character) {
            is Character.Warrior -> println("$charName в защите! Способность: ${character.ability}")
            is Character.Mage -> println("$charName в защите! Заклинание: ${character.spell}")
            is Character.Archer -> println("$charName в защите! Способность: ${character.ability}")
        }
    }
}