package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Rogue extends characterCreator{
   String hitDice = "1d8";

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 

    // String sneakAtkDmg = "1d6";
    
    List<String> classSkillProf = Arrays.asList("Arcobatics", "Athletics","Deception", 
    "Insight","Intimidation","Investigation","Perception","Performance","Persusation","Sleight of Hand","Stealth");//chose 4
    List<String> classWeapProf =  Arrays.asList("Simple Weapons","Hand Crossbows","Longswords","Rapiers","Shortswords");
    List<String> classArmorProf =  Arrays.asList("Light Armor");
    List<String> classToolProf = Arrays.asList("Thieves' Tools");
    List<String> classLanguages = Arrays.asList("Thieves' Cant");
    List<String> classFeats = Arrays.asList("Expertise","Sneak Attack (1d6)");
    List<String> savingThrows = Arrays.asList("Dexterity","Intelligence");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
   
    List<String> equipChoice1 = Arrays.asList("Rapier","Shortsword");
    List<String> equipChoice2 = Arrays.asList("Shortbow and quiver of 20 arrows","Shortsword");
    List<String> equipChoice3 = Arrays.asList("Burglar's Pack","Explorer's Pack","Dungeoneer's Pack");
   
    /*
     * output all information for rogue class
     */
    public Rogue(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);

        setStartEquip();
        
        armorClass = 11+dexMod;
        hitPoints = conMod + 8;
    
        System.out.println("Armor Class: "+ armorClass );
        System.out.println("Hit Points: "+ hitPoints);
        System.out.println("Hit Dice: "+ hitDice);
        System.out.println("\nChoose Four Class Skills: "+ classSkillProf);
        System.out.println("Saving Throws: "+ savingThrows);
        System.out.println("Class Features: "+ classFeats);
        System.out.println("Class Languages: "+ classLanguages);
        System.out.println("\nClass Weapon Proficiencies: "+classWeapProf);
        System.out.println("Class Armor Proficienceis: "+ classArmorProf);
        System.out.println("Class Tool Proficiencies: "+ classToolProf);
        System.out.println("\nStarting Equipment: "+ allStartEquipment);
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
         int choice = super.dice(1, 3, false);
            
        for (int i=0; i<3;i++){
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
        allStartEquipment.add("Leather Armor");
        allStartEquipment.add("Two Daggers");
        allStartEquipment.add("Thieves' Tools");
        return allStartEquipment;
    }  
}
