package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    void mustReturnAttack(){
        ICharacter character = CharacterFactory.getCharacterClass("Wizard");
        assertEquals("Causa 4 de dano", character.attack());
    }

    @Test
    void mustReturnHeal(){
        ICharacter character = CharacterFactory.getCharacterClass("Wizard");
        assertEquals("Não sabe curar", character.heal());
    }
    @Test
    void mustReturnMagic(){
        ICharacter character = CharacterFactory.getCharacterClass("Wizard");
        assertEquals("Bola de Fogo, Ilusão menor", character.magic());
    }

}