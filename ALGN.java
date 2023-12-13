/*
 * L = lawful
 * G = good
 * E = evil
 * C = chaotic
 * N = neutral
 */


public enum ALGN {
    LG,LN,LE,NG,N,NE,CG,CN,CE;



    public static ALGN getRandom(){
        return values()[(int)(Math.random()*values().length)];
    }
}

