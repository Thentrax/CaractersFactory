package Character;

public class Wizard implements  ICharacter{
    public String attack(){
        return "Causa 4 de dano";
    }

    public  String heal(){
        return "Não sabe curar";
    }

    public  String magic(){
        return "Bola de Fogo, Ilusão menor";
    }
}
