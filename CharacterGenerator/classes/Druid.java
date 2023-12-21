package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Druid extends characterCreator{
    String hitDice = "1d8";

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 
    int spellSaveDC; //8+2+ wisdom mod
    int spellAtkMod; //wisdom mod +2 

    String spellSlots = "2 1st Level Slot";
    int cantripsKnown = 2;
    int spellsKnown;// CALCULATE IN LOOP Wisdom mod + Druid level

    List<String> classSkillProf = Arrays.asList("Arcana", "Insight", "Animal Handling", "Nature","Perception","Survival", 
    "Medicine","Religion");//chose 2
    List<String> classWeapProf =  Arrays.asList("Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears");
    List<String> classArmorProf =  Arrays.asList("Light Armor","Medium Armor","Shields");
    List<String> classToolProf = Arrays.asList("Herbalism Kit");
    List<String> classLanguages = Arrays.asList("Druidic");
   
    List<String> savingThrows = Arrays.asList("Intelligence","Wisdom");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    List<String> equipChoice1 = Arrays.asList("Wooden Shield","Any Simple Weapon");
    List<String> equipChoice2 = Arrays.asList("Scimitar","Any Simple Melee Weapon");
    
    /*
     * Prints all Druid information
     */
    public Druid(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        int wisMod = mods.get(4);

        setStartEquip();

        armorClass = 11+dexMod;
        hitPoints = conMod + 8;
        spellSaveDC = 10 + wisMod;
        spellAtkMod = wisMod+2;
        spellsKnown = wisMod+1;

        System.out.println("Armor Class: "+ armorClass );
        System.out.println("Hit Points: "+ hitPoints);
        System.out.println("Hit Dice: "+ hitDice);
        System.out.println("\nChoose Two Class Skills: "+ classSkillProf);
        System.out.println("Saving Throws: "+ savingThrows);
        // System.out.println("Class Features: "+ classFeats);
        System.out.println("\nClass Weapon Proficiencies: "+classWeapProf);
        System.out.println("Class Armor Proficienceis: "+ classArmorProf);
        System.out.println("Class Tool Proficiencies: "+ classToolProf);
        System.out.println("Class Languages: "+ classLanguages);
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
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
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
     * set all starting equipment using choices made
     * @return ArrayList of all class starting Equipment
     */
    public ArrayList<String> setStartEquip(){
        allStartEquipment.add(setEquip1());
        allStartEquipment.add(setEquip2());
        allStartEquipment.add("Leather Armor");
        allStartEquipment.add("Explorer's Pack");
        allStartEquipment.add("Druidic Focus");
        return allStartEquipment;
    }
 
}
