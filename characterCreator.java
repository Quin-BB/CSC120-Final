import java.util.ArrayList;
import java.util.Scanner;
// import java.util.random.*;

public class characterCreator {
    static ArrayList<Integer> stats = new ArrayList<Integer>();
    static int strength = 0;
    static int dexterity = 0;
    static int constitution = 0;
    static int intelligence = 0;
    static int wisdom = 0;
    static int charisma = 0;

    static ArrayList<Integer> mods = new ArrayList<Integer>();

    //add stat modifiers later perhaps? not vital to what i have planned so far
    
    static int level = 1;
    static int proficiencyBonus = 2;
    
    String name;
    static ALGN alignment = ALGN.getRandom();
    static Background background = Background.getRandom();
    static charClass randclass = charClass.getRandom();

    ArrayList<String> allFeatures = new ArrayList<>();
    ArrayList<String> allProficiencies = new ArrayList<>();

    /**
     * Allows the user to set the name of their generated character
     * @return name of character
     */
    public static String setName(){

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter Character Name: ");

        String name = nameInput.nextLine();
        System.out.println("Hi! "+ name);
        return name;
    }

    /**
     * This is a method that rolls a dice (with sides = numSides) a number of times equal to numRolls
     * @param numRolls
     * @param numSides
     * @return total of all dice rolled
     */

    //implement rerolling ones if wanted later
     public static int dice(int numRolls, int numSides){
        int min = 1;
        int max = numSides;
         
        int roll = 0;

        for (int i = 1; i <= numRolls; i++){
            int individualRoll = (int)Math.floor(Math.random()* (max-min+1)+min);
            roll += individualRoll;
            // System.out.println("individual roll: "+ individualRoll);
        }
        // System.out.println("total: "+ roll);
        return roll;
    }

    // do i need to put a javadoc comment on every one the stat methods since they all do the same thing?

    /**
     * Sets the strength of the character
     * @return the total of 3 rolls of a 6 sided dice
     */
    public static int setStr(){
        strength = dice(3,6);
        return strength;
    }
   
    public static int setDex(){
        dexterity = dice(3,6);
        return dexterity;
    }

    public static int setCon(){
        constitution = dice(3,6);
        return constitution;
    }

    public static int setInt(){
        intelligence = dice(3,6);
        return intelligence;
    }

    public static int setWis(){
        wisdom = dice(3,6);
        return wisdom;
    }

    public static int setChar(){
        charisma = dice(3,6);
        return charisma;
    }
    /**
     * Combine the individual character stats into an arraylist 
     * @return arraylist of stats in order presented on character sheet
     * (STR,DEX,CON,INT,WIS,CHAR)
     */
    public static ArrayList<Integer> setStats(){
        stats.add(setStr());
        stats.add(setDex());
        stats.add(setCon());
        stats.add(setInt());
        stats.add(setWis());
        stats.add(setChar());

        return stats;
    }

    /**
     * converts stats previously rolled into dnd modifiers
     * equation is the mod = (stat-10)/2 
     * @return arraylist of modifers (same order as stats)
     */
    public static ArrayList<Integer> setMods(){
        for (int i =0; i<6; i++){
            int m = stats.get(i);
            if (m<10){ //for abilitiy scores with negative modifiers
                int n = Math.abs(m-10)+1; // +1 to prevent odd rounding with odd numbers 
                // System.out.println("n = "+n);
                Double s = Math.floor(n/2);
                // System.out.println("s = "+s);
                int mod = (-1 * s.intValue());
                // System.out.println("mod = "+mod);
                mods.add(mod);
            } else {
                Double s = Math.floor((m-10)/2);
                int mod = s.intValue();
                mods.add(mod);

            }
        }

        return mods;
    }

    //testing
    public static void main(String[] args) {
        // setName();
        // System.out.println("\nClass: "+ randclass);
        // System.out.println("Alignment: "+ alignment);        
        // System.out.println("Level: "+ level);
        // System.out.println("Proficiency Bonus: +"+ proficiencyBonus);
        System.out.println("Your stats are: "+ setStats());
        System.out.println("Your stat modifiers are: "+ setMods());

    }
}
