package CharacterGenerator;
public enum Background{
 ACOLYTE,
 CHARLATAN,
 CRIMINAL,
 ENTERTAINER,
 FOLK_HERO,
 GUILD_ARTISAN,
 HERMIT,
 NOBLE,
 OUTLANDER,
 SAGE,
 SAILOR,
 SOLDIER,
 URCHIN;

    public static Background getRandom(){
    return values()[(int)(Math.random()*values().length)];
}
}