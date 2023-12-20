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

    public static Class getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }
}
