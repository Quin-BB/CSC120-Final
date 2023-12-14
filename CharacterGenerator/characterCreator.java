package CharacterGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
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
    static int armorClass;
    
    String name;
    static ALGN alignment = ALGN.getRandom();
    static Background background = Background.getRandom();
    static charClass randclass = charClass.getRandom();
    static race randrace = race.getRandom();


    ArrayList<String> allFeatures = new ArrayList<>();
    ArrayList<String> allProficiencies = new ArrayList<>();
    static List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");


// WRITE A CONSTRUCTOR!!!
// add a regenerate character option 

    /**
     * Allows the user to set the name of their generated character
     * @return name of character
     */
    public static String setName(){

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter Character Name: ");

        String name = nameInput.nextLine();
        System.out.println("________________________________________________________________________________________\nCharacter Name: "
        + name);
        return name;
    }

    /**
     * This is a method that rolls a dice (with sides = numSides) a number of times equal to numRolls 
     * if rerolling is the true the method will reroll ones rolled on the die
     * @param numRolls
     * @param numSides
     * @param rerolling 
     * @return total of all dice rolled
     */
     public static int dice(int numRolls, int numSides, boolean rerolling){
        int min = 1;
        int max = numSides;
        
        int individualRoll = 0; 
        int roll = 0;

        if (rerolling == true){
            // System.out.println("im here");
            for (int i = 1; i <= numRolls+1; i++){
                if (individualRoll == 1){
                    i --;
                    // System.out.println("rerolling...");
                    individualRoll = (int)Math.floor(Math.random()* (max-min+1)+min);
                    // System.out.println("individual roll reroll: "+ individualRoll);
                
                } else{
                    individualRoll = (int)Math.floor(Math.random()* (max-min+1)+min);
                    roll += individualRoll;
                    /*
                    * current issue is that if on the last loop and this section rolls a 1 it will not be rerolled since the loop is done and it will not go back to check
                    */
                    // System.out.println("individual roll 'first roll': "+ individualRoll);

                }
            }
        } else {
            for (int i = 1; i <= numRolls; i++){
                individualRoll = (int)Math.floor(Math.random()* (max-min+1)+min);
                roll += individualRoll;
                // System.out.println("individual roll: "+ individualRoll);
            }
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
        // System.out.println("str");
        strength = dice(3,6,true);
        
        return strength;
    }
   
    public static int setDex(){
        // System.out.println("dex");
        dexterity = dice(3,6,true);
        
        return dexterity;
    }

    public static int setCon(){
        // System.out.println("con");
        constitution = dice(3,6,true);
        
        return constitution;
    }

    public static int setInt(){
        // System.out.println("int");
        intelligence = dice(3,6,true);
        
        return intelligence;
    }

    public static int setWis(){
        // System.out.println("wis");
        wisdom = dice(3,6,true);
        return wisdom;
    }

    public static int setChar(){
        // System.out.println("char");
        charisma = dice(3,6,true);
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

    //testing and temporary character info output
    public static void main(String[] args) {
        setName();
        System.out.println("\nRace: "+ randrace);
        System.out.println("Class: "+ randclass);
        System.out.println("Background: "+background);
        System.out.println("Alignment: "+ alignment);        
        System.out.println("Level: "+ level);
        System.out.println("Proficiency Bonus: +"+ proficiencyBonus);
        for (int i=0;i<6;i++){
            System.out.println("____________\n"+statNames.get(i) +": "+ setStats().get(i));
            System.out.println("Modifier: "+ setMods().get(i)+"\n____________");

        } 
        System.out.println("\nInitiative Modifier: "+ setMods().get(1));
        armorClass = 10 + setMods().get(1);
        System.out.println("Armor Class: "+ armorClass+"\n________________________________________________________________________________________\n");
    }
}
