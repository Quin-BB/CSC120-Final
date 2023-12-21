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

    /**
     * choose random enum background value
     * @return random background value
     */
    public static Background getRandom(){
    return values()[(int)(Math.random()*values().length)];
}
}