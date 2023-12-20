package CharacterGenerator;
import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

import CharacterGenerator.races.*;
import CharacterGenerator.backgrounds.*;
import CharacterGenerator.classes.*;

// import java.util.Arrays;
// import java.util.random.*;

public class characterCreator {
    static ArrayList<Integer> stats = new ArrayList<Integer>();
    static int strength = 0;
    static int dexterity = 0;
    static int constitution = 0;
    static int intelligence = 0;
    static int wisdom = 0;
    static int charisma = 0;

    public static ArrayList<Integer> mods = new ArrayList<Integer>();

    //add stat modifiers later perhaps? not vital to what i have planned so far
    
    static int level = 1;
    static int proficiencyBonus = 2;
    // static int armorClass;
    
    String name;
    static ALGN alignment = ALGN.getRandom();
    static Background background = Background.getRandom();
    static Class randclass = Class.getRandom();
    static race randrace = race.getRandom();


    // ArrayList<String> allFeatures = new ArrayList<>();
    // ArrayList<String> allProficiencies = new ArrayList<>();
//    List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");


// WRITE A CONSTRUCTOR!!!
// add a regenerate character option 
//     public characterCreator(){
//     System.out.println(charRace);    
// }
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
     public int dice(int numRolls, int numSides, boolean rerolling){
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
    public int setStr(int bonus){
        // System.out.println("str");
        strength = dice(3,6,true)+bonus;
        
        return strength;
    }
   
    public int setDex(int bonus){
        // System.out.println("dex");
        dexterity = dice(3,6,true)+bonus;
        
        return dexterity;
    }

    public int setCon(int bonus){
        // System.out.println("con");
        constitution = dice(3,6,true)+bonus;
        
        return constitution;
    }

    public int setInt(int bonus){
        // System.out.println("int");
        intelligence = dice(3,6,true)+bonus;
        
        return intelligence;
    }

    public int setWis(int bonus){
        // System.out.println("wis");
        wisdom = dice(3,6,true)+bonus;
        return wisdom;
    }

    public int setChar(int bonus){
        // System.out.println("char");
        charisma = dice(3,6,true)+bonus;
        return charisma;
    }
    /**
     * Combine the individual character stats into an arraylist 
     * @return arraylist of stats in order presented on character sheet
     * (STR,DEX,CON,INT,WIS,CHAR)
     */
    public ArrayList<Integer> setStats(int sb, int db, int conb, int ib,int wb, int charb){
        stats.add(setStr(sb));
        stats.add(setDex(db));
        stats.add(setCon(conb));
        stats.add(setInt(ib));
        stats.add(setWis(wb));
        stats.add(setChar(charb));

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

    /**
     * Creates an instance of the racial subclasses that corresponds to the random enum race value
     */
    public static void getRace(){
        System.out.println("\nRace: "+ randrace);
        
        if (randrace == race.Centaur){
            Centaur charRace = new Centaur();
            System.out.println(charRace);
        }
        if (randrace == race.Dragonborn){
            Dragonborn charRace = new Dragonborn();
            System.out.println(charRace);

        }
        if (randrace == race.Dwarf){
            Dwarf charRace = new Dwarf();
            System.out.println(charRace);
        }
        if (randrace == race.Elf){
            Elf charRace = new Elf();
            System.out.println(charRace);

        }
        if (randrace == race.Gnome){
            Gnome charRace = new Gnome();
            System.out.println(charRace);
        }
        if (randrace == race.HalfElf){
            HalfElf charRace = new HalfElf();
            System.out.println(charRace);

        }
        if (randrace == race.HalfOrc){
            HalfOrc charRace = new HalfOrc();
            System.out.println(charRace);

        }
        if (randrace == race.Human){
            Human charRace = new Human();
            System.out.println(charRace);

        }
        if (randrace == race.Kenku){
            Kenku charRace = new Kenku();
            System.out.println(charRace);
        }

        if (randrace == race.Satyr){
            Satyr charRace = new Satyr();
            System.out.println(charRace);

        }
        if (randrace == race.Tiefling){
            Tiefling charRace = new Tiefling();
            System.out.println(charRace);

        }
        if (randrace == race.YuanTi){
            YuanTi charRace = new YuanTi();
            System.out.println(charRace);
        }

    }

    /**
     * Creates an instance of the class subclasses that corresponds to the random enum class value
     */
    public static void getCharacterClass(){
        System.out.println("\nClass: "+ randclass);


        if (randclass == Class.ARTIFICER){
            Artificer charClass = new Artificer();
            System.out.println(charClass);
           
        }
        if (randclass == Class.BARBARIAN){
            Barbarian charClass = new Barbarian();
            System.out.println(charClass);

        }
        if (randclass == Class.BARD){
            Bard charClass = new Bard();
            System.out.println(charClass);
        }
        if (randclass == Class.CLERIC){
            Cleric charClass = new Cleric();
            System.out.println(charClass);

        }
        if (randclass == Class.DRUID){
            Druid charClass = new Druid();
            System.out.println(charClass);
        }
        if (randclass == Class.FIGHTER){
            Fighter charClass = new Fighter();
            System.out.println(charClass);

        }
        if (randclass == Class.MONK){
            Monk charClass = new Monk();
            System.out.println(charClass);

        }
        if (randclass == Class.PALADIN){
            Paladin charClass = new Paladin();
            System.out.println(charClass);

        }
        if (randclass == Class.RANGER){
            Ranger charClass = new Ranger();
            System.out.println(charClass);
        }

        if (randclass == Class.ROGUE){
            Rogue charClass = new Rogue();
            System.out.println(charClass);

        }
        if (randclass == Class.SORCERER){
            Sorcerer charClass = new Sorcerer();
            System.out.println(charClass);

        }
        if (randclass == Class.WARLOCK){
            Warlock charClass = new Warlock();
            System.out.println(charClass);
        }
        if (randclass == Class.WIZARD){
            Wizard charClass = new Wizard();
            System.out.println(charClass);
        }
    }

    /**
     * Creates an instance of the background subclasses that corresponds to the random enum backgroun value
     */
    public static void getBackground(){
        System.out.println("\nBackground: "+background);

        if (background == Background.ACOLYTE){
            Acolyte charBG = new Acolyte();
            System.out.println(charBG);
        }
        if (background == Background.CHARLATAN){
            Charlatan charBG = new Charlatan();
            System.out.println(charBG);

        }
        if (background == Background.CRIMINAL){
            Criminal charBG = new Criminal();
            System.out.println(charBG);
        }
        if (background == Background.ENTERTAINER){
            Entertainer charBG = new Entertainer();
            System.out.println(charBG);

        }
        if (background == Background.FOLK_HERO){
            FolkHero charBG = new FolkHero();
            System.out.println(charBG);
        }
        if (background == Background.GUILD_ARTISAN){
            GuildArtisan charBG = new GuildArtisan();
            System.out.println(charBG);

        }
        if (background == Background.HERMIT){
            Hermit charBG = new Hermit();
            System.out.println(charBG);

        }
        if (background == Background.NOBLE){
            Noble charBG = new Noble();
            System.out.println(charBG);

        }
        if (background == Background.OUTLANDER){
            Outlander charBG = new Outlander();
            System.out.println(charBG);
        }

        if (background == Background.SAGE){
            Sage charBG = new Sage();
            System.out.println(charBG);

        }
        if (background == Background.SAILOR){
            Sailor charBG = new Sailor();
            System.out.println(charBG);

        }
        if (background == Background.SOLDIER){
            Soldier charBG = new Soldier();
            System.out.println(charBG);
        }
        if (background == Background.URCHIN){
            Urchin charBG = new Urchin();
            System.out.println(charBG);
        }

    }

    //testing and temporary character info output
    public static void main(String[] args) {
        setName();
        System.out.println("\nAlignment: "+ alignment);        
        System.out.println("Level: "+ level);
        System.out.println("Proficiency Bonus: +"+ proficiencyBonus);
        getRace();
        // System.out.println(" ");
        getCharacterClass();
        // System.out.println(" ");
        getBackground();
        System.out.println("\n________________________________________________________________________________________\n");
    }
}
