package CharacterGenerator;
public enum charClass {
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

    public static charClass getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }
}
