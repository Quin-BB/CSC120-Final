package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Artificer extends characterCreator{
    String hitDice = "1d8";
    // String subClass;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 
   
    int spellSaveDC; //8+2+ wisdom mod
    int spellAtkMod; //wisdom mod +2 

    String spellSlots = "2 1st Level Slot";
    int cantripsKnown = 2;
    int spellsKnown; //CALCULATE IN LOOP Intelligence Mod + half artificer level rounded down (0)

    List<String> classSkillProf = Arrays.asList("Arcana","History", "Investigation","Medicine", 
    "Nature","Perception","Sleight of Hand");//chose 2
    List<String> classWeapProf =  Arrays.asList("All Simple Weapons");
    List<String> classArmorProf =  Arrays.asList("Light Armor","Medium Armor","Shields");
    List<String> classToolProf = Arrays.asList("Thieves' Tools","Tinker's Tools","One type of artisan's toos of your choice");
    List<String> classFeats = Arrays.asList("Magical Tinkering");
    List<String> savingThrows = Arrays.asList("Constitution","Intelligence");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    // String equip2;
    // String equip3;
    // String equip4;
    List<String> equipChoice1 = Arrays.asList("Studded Leather Armor","Scale Mail");
    // List<String> equipChoice2 = Arrays.asList("Scimitar","Any Simple Melee Weapon");
    // List<String> equipChoice3 = Arrays.asList("Scholar's Pack","Explorer's Pack");
    // List<String> equipChoice4 = Arrays.asList("Priest's Pack","Explorer's pack");
    // List<String> equipFinal = Arrays.asList("Leather Armor","Any simple weapon","Two daggers");

    /**
     * Sets and prints out all relevant Artificer Informations
     */
    public Artificer(){
        mods = super.setMods();
        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        int intMod = mods.get(3);
        
        setStartEquip();
        if (equip1 == equipChoice1.get(0)){
            armorClass = 12+dexMod;
        }else{
            armorClass = 14+ dexMod;
        }
        hitPoints = conMod + 8;
        spellSaveDC = 10 + intMod;
        spellAtkMod = intMod+2;
        if (intMod < 1){
            spellsKnown = 1;
        }else{
            spellsKnown = intMod;
        }
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
     * make the first equipment choice
     * @return the choice made for equipment choice
     */
    public String setEquip1(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice1.get(i) == equipChoice1.get(choice-1)){
                       equip1 = equipChoice1.get(choice-1);
                }   
        }       
        return equip1;
    }

    /**
     * Using the all starting equipment including choices made to output one ArrayList of class starting Equipment
     * @return ArrayList of class starting equipment
     */
    public ArrayList<String> setStartEquip(){
        allStartEquipment.add(setEquip1());
        allStartEquipment.add("Any Two Simple Weapons");
        allStartEquipment.add("Light Crossbow and 20 bolts");
        allStartEquipment.add("Thieve's Tools");       
        allStartEquipment.add("Dungeoneer's Packs");
        return allStartEquipment;
    } 
}
