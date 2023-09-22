package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    @Test
    void mustReturnAttack(){
        ICharacter character = CharacterFactory.getCharacterClass("Fighter");
        assertEquals("Causa 15 de dano", character.attack());
    }

    @Test
    void mustReturnHeal(){
        ICharacter character = CharacterFactory.getCharacterClass("Fighter");
        assertEquals("Não sabe curar", character.heal());
    }
    @Test
    void mustReturnMagic(){
        ICharacter character = CharacterFactory.getCharacterClass("Fighter");
        assertEquals("Não sabe usar magia", character.magic());
    }


}