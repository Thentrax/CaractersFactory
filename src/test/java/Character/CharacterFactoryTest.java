package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFactoryTest {

    @Test
    void mustReturnExeptUnexistentClass() {
        try{
            ICharacter character = CharacterFactory.getCharacterClass("Sorcerer");
            fail();
        } catch (IllegalArgumentException ex){
            assertEquals("Classe inexistente", ex.getMessage());
        }
    }

    @Test
    void  mustReturnExeptInvalidClass(){
        try{
            ICharacter character = CharacterFactory.getCharacterClass("Rogue");
            fail();
        } catch (IllegalArgumentException ex){
            assertEquals("Classe inválida", ex.getMessage());
        }
    }
}