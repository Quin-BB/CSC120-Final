package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Bard extends characterCreator{
     String hitDice = "1d8";
    String subClass;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 
    int spellSaveDC; //8+2+ wisdom mod
    int spellAtkMod; //wisdom mod +2 

    String spellSlots = "2 1st Level Slot";
    int cantripsKnown = 2;
    int spellsKnown = 4;

    List<String> classSkillProf = Arrays.asList("Choose any three");//chose 2
    List<String> classWeapProf =  Arrays.asList("Simple Weapons","Hand Crossbows","Longswords","Rapiers","Shortswords");
    List<String> classArmorProf =  Arrays.asList("Light Armor");
    List<String> classToolProf = Arrays.asList("Three musical instruments of your choice");
    List<String> classFeats = Arrays.asList("Bardic Inspiration (1d6)");
    List<String> savingThrows = Arrays.asList("Charisma","Dexterity");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
    // String equip4;
    List<String> equipChoice1 = Arrays.asList("Rapier","Longsword","Any Simple Weapon");
    List<String> equipChoice2 = Arrays.asList("Diplomat's Pack","Entertainer's Pack");
    List<String> equipChoice3 = Arrays.asList("Lute","Any other musical instrument (than a lute)");
    // List<String> equipChoice4 = Arrays.asList("Priest's Pack","Explorer's pack");
    // List<String> equipFinal = Arrays.asList("Leather Armor","Any simple weapon","Two daggers");

    /*
     * prints out all bard information
     */
    public Bard(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        int charMod = mods.get(5);

        setStartEquip();
        armorClass = 11+dexMod;
        hitPoints = conMod + 8;
        spellSaveDC = 10 + charMod;
        spellAtkMod = charMod+2;
        System.out.println("Armor Class: "+ armorClass );
        System.out.println("Hit Points: "+ hitPoints);
        System.out.println("Hit Dice: "+ hitDice);
        System.out.println("\nChoose Two Class Skills: "+ classSkillProf);
        System.out.println("Saving Throws: "+ savingThrows);
        System.out.println("Class Features: "+ classFeats);
        System.out.println("\nClass Weapon Proficiencies: "+classWeapProf);
        System.out.println("Class Armor Proficienceis: "+ classArmorProf);
        System.out.println("Class Tool Proficiencies: "+ classToolProf);
        System.out.println("\nStarting Equipment: "+ allStartEquipment);
        System.out.println("\nSPELL INFORMATION");
        System.out.println("Spell Save DC: "+ spellSaveDC + "       Spell Attack Modifier: +"+spellAtkMod);
        System.out.println("Spell Slots: "+ spellSlots + "      Cantrips Known: "+ cantripsKnown+"      Spells Known: "+spellsKnown);

    }

    /**
     * make the 1st equipment choice
     * @return the choice made for equipment choice
     */
    public String setEquip1(){
         int choice = super.dice(1, 3, false);
            
        for (int i=0; i<3;i++){
                if (equipChoice1.get(i) == equipChoice1.get(choice-1)){
                       equip1 = equipChoice1.get(choice-1);
                }   
        }       
        return equip1;
    }

    /**
     * make the 2nd equipment choice
     * @return the choice made for equipment choice
     */
    public String setEquip2(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice2.get(i) == equipChoice2.get(choice-1)){
                       equip2 = equipChoice2.get(choice-1);
                }   
        }       
        return equip2;
    }

    /**
     * make the 3rd equipment choice
     * @return the choice made for equipment choice
     */
    public String setEquip3(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice3.get(i) == equipChoice3.get(choice-1)){
                       equip3 = equipChoice3.get(choice-1);
                }   
        }       
        return equip3;
    }

   /**
     * Using the all starting equipment including choices made to output one ArrayList of class starting Equipment
     * @return ArrayList of class starting equipment
     */
    public ArrayList<String> setStartEquip(){
        allStartEquipment.add(setEquip1());
        allStartEquipment.add(setEquip2());
        allStartEquipment.add(setEquip3());
        // allStartEquipment.add(setEquip4());       
        allStartEquipment.add("Leather Armor");
        allStartEquipment.add("Dagger");
        return allStartEquipment;
    }
}
