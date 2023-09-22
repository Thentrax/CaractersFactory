package Character;

public class Fighter implements  ICharacter{
    public String attack(){
        return "Causa 15 de dano";
    }

    public  String heal(){
        return "Não sabe curar";
    }

    public  String magic(){
        return "Não sabe usar magia";
    }
}
