package Character;

public class CharacterFactory {

    public static ICharacter getCharacterClass(String className){
        Class characterClass = null;
        Object object = null;
        try {
            characterClass = Class.forName("Character." + className);
            object = characterClass.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Classe inexistente");
        }
        if (!(object instanceof ICharacter)){
            throw new IllegalArgumentException("Classe inválida");
        }
        return (ICharacter) object;
    }
}
