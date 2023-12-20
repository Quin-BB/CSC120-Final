package CharacterGenerator;

// import CharacterGenerator.races.*;

public enum race {
    Centaur,
    Dragonborn,
    Dwarf,
    Elf,
    Gnome,
    HalfElf,
    Halfling,
    HalfOrc,
    Human,
    Kenku,
    Satyr,
    Tiefling,
    YuanTi;

    public static race getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }

}
