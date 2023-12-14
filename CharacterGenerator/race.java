package CharacterGenerator;

public enum race {
    DRAGONBORN,
    DWARF,
    ELF,
    HALF_ELF,
    HALF_ORC,
    HALFING,
    HUMAN,
    TIEFLING,
    YUAN_TI,
    KOBOLD,
    SATYR,
    KENKU;

    public static race getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }

}
