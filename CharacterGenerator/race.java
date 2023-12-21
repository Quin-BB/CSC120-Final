package CharacterGenerator;

public enum Race {
    CENTAUR,
    DRAGONBORN,
    DWARF,
    ELF,
    GNOME,
    HALF_ELF,
    HALFLING,
    HALF_ORC,
    HUMAN,
    KENKU,
    SATYR,
    TIEFLING,
    YUAN_TI;

    /**
     * get random race enum value
     * @return race enum value
     */
    public static Race getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }

}
