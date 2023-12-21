package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Sorcerer extends characterCreator{
    String hitDice = "1d6";
    String subClass;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 
    int spellSaveDC; //8+2+charisma mod
    int spellAtkMod; //charisma mod +2 

    String spellSlots = "2 1st Level Slot";
    int cantripsKnown = 4;
    int spellsKnown = 2;

    List<String> classSkillProf = Arrays.asList("Arcana", "Deception", "Insight", "Intimidation", 
    "Persuasion","Religion");//chose 2
    List<String> classWeapProf =  Arrays.asList("Daggers","Darts","Slings","Quarterstaffs","Light Crossbows");
    List<String> classArmorProf =  Arrays.asList("None");
    List<String> origins = Arrays.asList("Abberant Mind","Clockwork Soul","Draconic Bloodline","Divine Soul","Lunar Sorcery",
    "Shadow Magic","Storm Sorcery","Wild Magic");

    List<String> savingThrows = Arrays.asList("Constitution","Charisma");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
    List<String> equipChoice1 = Arrays.asList("Light Crossbow and 20 bolts","Any simple weapon");
    List<String> equipChoice2 = Arrays.asList("Componenet pouch","Arcane focus");
    List<String> equipChoice3 = Arrays.asList("Explorer's Pack","Dungeoneer's Pack");

    /*
     * outputs all sorcerer class information
     */
    public Sorcerer(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        int charMod = mods.get(5);

        setStartEquip();
        armorClass = 10+dexMod;
        hitPoints = conMod + 6;
        spellSaveDC = 10 + charMod;
        spellAtkMod = charMod+2;

        System.out.println("Armor Class: "+ armorClass );
        System.out.println("Hit Points: "+ hitPoints);
        System.out.println("Hit Dice: "+ hitDice);
        System.out.println("\nChoose Two Class Skills: "+ classSkillProf);
        System.out.println("Saving Throws: "+ savingThrows);
        // System.out.println("Class Features: "+ classFeats);
        System.out.println("\nClass Weapon Proficiencies: "+classWeapProf);
        System.out.println("Class Armor Proficienceis: "+ classArmorProf);
        System.out.println("Class Tool Proficiencies: None");
        System.out.println("\nStarting Equipment: "+ allStartEquipment);
        System.out.println("\nSPELL INFORMATION");
        System.out.println("Spell Save DC: "+ spellSaveDC + "       Spell Attack Modifier: +"+spellAtkMod);
        System.out.println("Spell Slots: "+ spellSlots + "      Cantrips Known: "+ cantripsKnown+"      Spells Known: "+spellsKnown);

    }

    /**
     * make an equipment choice
     * @return the choice made for equipment choice
     */
    public String setSubClass(){
        int choice = super.dice(1, 9, false);
            
        for (int i=0; i<9;i++){
                if (origins.get(i) == origins.get(choice-1)){
                        subClass =  origins.get(choice-1);
                }   
        }        
        return subClass;
    }

    /**
     * make an equipment choice
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
     * make an equipment choice
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
     * make an equipment choice
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
        allStartEquipment.add("Two daggers");


        return allStartEquipment;
    }

}
