package CharacterGenerator;
/*
 * L = lawful
 * G = good
 * E = evil
 * C = chaotic
 * N = neutral
 */


public enum ALGN {
    LAWFUL_GOOD,
    LAWFUL_NEUTRAL,
    LAWFUL_EVIL,
    NEUTRAL_GOOD,
    NEUTRAL,
    NEUTRAL_EVIL,
    CHAOTIC_GOOD,
    CHAOTIC_NEUTRAL,
    CHAOTIC_EVIL;



    public static ALGN getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }
}

