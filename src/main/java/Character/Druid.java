package Character;

public class Druid implements ICharacter{
    public String attack(){
        return "Causa 6 de dano";
    }

    public  String heal(){
        return "10 de cura por turno";
    }

    public  String magic(){
        return "Curar Ferimentos, Bola de Fogo";
    }
}
