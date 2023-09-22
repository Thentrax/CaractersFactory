package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DruidTest {

    @Test
    void mustReturnAttack(){
        ICharacter character = CharacterFactory.getCharacterClass("Druid");
        assertEquals("Causa 6 de dano", character.attack());
    }

    @Test
    void mustReturnHeal(){
        ICharacter character = CharacterFactory.getCharacterClass("Druid");
        assertEquals("10 de cura por turno", character.heal());
    }
    @Test
    void mustReturnMagic(){
        ICharacter character = CharacterFactory.getCharacterClass("Druid");
        assertEquals("Curar Ferimentos, Bola de Fogo", character.magic());
    }

}