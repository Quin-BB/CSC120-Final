public enum Background{
 ACOLYTE,
 CHARLATAN,
 CRIMINAL,
 SPY,
 ENTERTAINER,
 FOLK_HERO,
 GLADIATOR,
 GUILD_ARTISAN,
 GUILD_MERCHANT,
 HERMIT,
 KNIGHT,
 NOBLE,
 OUTLANDER,
 PIRATE,
 SAGE,
 SAILOR,
 SOLDIER,
 URCHIN;

    public static Background getRandom(){
    return values()[(int)(Math.random()*values().length)];
}
}