package CharacterGenerator;
public enum Class {
    ARTIFICER,
    BARBARIAN,
    BARD,
    CLERIC,
    DRUID,
    FIGHTER,
    MONK,
    PALADIN,
    RANGER,
    ROGUE,
    SORCERER,
    WARLOCK,
    WIZARD;

    /**
     * get random class 
     * @return random class value
     */
    public static Class getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }
}
