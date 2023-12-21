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
    static Class randClass = Class.getRandom();
    static Race randRace = Race.getRandom();

    /**
     * Allows the user to set the name of their generated character
     * @return name of character
     */
    public static String setName(){

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter Character Name: ");

        String name = nameInput.nextLine();
        nameInput.close();
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

    /**
     * Sets the strength of the character while rerolling 1s
     * @return the total of 3 rolls of a 6 sided dice + bonus
     */
    public int setStr(int bonus){
        // System.out.println("str");
        strength = dice(3,6,true)+bonus;
        
        return strength;
    }
   
    /**
     * Sets the dexterity of the character while rerolling 1s
     * @return the total of 3 rolls of a 6 sided dice +bonus
     */
    public int setDex(int bonus){
        // System.out.println("dex");
        dexterity = dice(3,6,true)+bonus;
        
        return dexterity;
    }

    /**
     * Sets the constitution of the character while rerolling 1s
     * @return the total of 3 rolls of a 6 sided dice +bonus
     */
    public int setCon(int bonus){
        // System.out.println("con");
        constitution = dice(3,6,true)+bonus;
        
        return constitution;
    }

    /**
     * Sets the intelligence of the character while rerolling 1s
     * @return the total of 3 rolls of a 6 sided dice +bonus
     */
    public int setInt(int bonus){
        // System.out.println("int");
        intelligence = dice(3,6,true)+bonus;
        
        return intelligence;
    }

    /**
     * Sets the wisdom of the character while rerolling 1s
     * @return the total of 3 rolls of a 6 sided dice +bonus
     */
    public int setWis(int bonus){
        // System.out.println("wis");
        wisdom = dice(3,6,true)+bonus;
        return wisdom;
    }

    /**
     * Sets the charisma of the character while rerolling 1s
     * @return the total of 3 rolls of a 6 sided dice + the bonus
     */
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
        System.out.println("\nRace: "+ randRace);
        
        if (randRace == Race.CENTAUR){
            Centaur charRace = new Centaur();
            System.out.println(charRace);
        }
        if (randRace == Race.DRAGONBORN){
            Dragonborn charRace = new Dragonborn();
            System.out.println(charRace);

        }
        if (randRace == Race.DWARF){
            Dwarf charRace = new Dwarf();
            System.out.println(charRace);
        }
        if (randRace == Race.ELF){
            Elf charRace = new Elf();
            System.out.println(charRace);

        }
        if (randRace == Race.GNOME){
            Gnome charRace = new Gnome();
            System.out.println(charRace);
        }
        if (randRace == Race.HALF_ELF){
            HalfElf charRace = new HalfElf();
            System.out.println(charRace);

        }
        if (randRace == Race.HALF_ORC){
            HalfOrc charRace = new HalfOrc();
            System.out.println(charRace);

        }
        if (randRace == Race.HUMAN){
            Human charRace = new Human();
            System.out.println(charRace);

        }
        if (randRace == Race.KENKU){
            Kenku charRace = new Kenku();
            System.out.println(charRace);
        }

        if (randRace == Race.SATYR){
            Satyr charRace = new Satyr();
            System.out.println(charRace);

        }
        if (randRace == Race.TIEFLING){
            Tiefling charRace = new Tiefling();
            System.out.println(charRace);

        }
        if (randRace == Race.YUAN_TI){
            YuanTi charRace = new YuanTi();
            System.out.println(charRace);
        }

    }

    /**
     * Creates an instance of the class subclasses that corresponds to the random enum class value
     */
    public static void getCharacterClass(){
        System.out.println("\nClass: "+ randClass);


        if (randClass == Class.ARTIFICER){
            Artificer charClass = new Artificer();
            System.out.println(charClass);
           
        }
        if (randClass == Class.BARBARIAN){
            Barbarian charClass = new Barbarian();
            System.out.println(charClass);

        }
        if (randClass == Class.BARD){
            Bard charClass = new Bard();
            System.out.println(charClass);
        }
        if (randClass == Class.CLERIC){
            Cleric charClass = new Cleric();
            System.out.println(charClass);

        }
        if (randClass == Class.DRUID){
            Druid charClass = new Druid();
            System.out.println(charClass);
        }
        if (randClass == Class.FIGHTER){
            Fighter charClass = new Fighter();
            System.out.println(charClass);

        }
        if (randClass == Class.MONK){
            Monk charClass = new Monk();
            System.out.println(charClass);

        }
        if (randClass == Class.PALADIN){
            Paladin charClass = new Paladin();
            System.out.println(charClass);

        }
        if (randClass == Class.RANGER){
            Ranger charClass = new Ranger();
            System.out.println(charClass);
        }

        if (randClass == Class.ROGUE){
            Rogue charClass = new Rogue();
            System.out.println(charClass);

        }
        if (randClass == Class.SORCERER){
            Sorcerer charClass = new Sorcerer();
            System.out.println(charClass);

        }
        if (randClass == Class.WARLOCK){
            Warlock charClass = new Warlock();
            System.out.println(charClass);
        }
        if (randClass == Class.WIZARD){
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
