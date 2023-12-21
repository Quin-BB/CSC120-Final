package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Ranger extends characterCreator{
     String hitDice = "1d10";

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 

    List<String> classSkillProf = Arrays.asList("Animal Handling","Athletics","Insight","Investigation", 
    "Nature","Perception","Stealth","Survival");//chose 2
    List<String> classWeapProf =  Arrays.asList("All Simple Weapons","Martial Weapons");
    List<String> classArmorProf =  Arrays.asList("Light Armor","Medium Armor","Shields");
    List<String> classToolProf = Arrays.asList("None");
    List<String> classFeats = Arrays.asList("Favored Enemy","Natural Explorer");
    
    List<String> savingThrows = Arrays.asList("Strength","Dexterity");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
    List<String> equipChoice1 = Arrays.asList("Scale Mail","Leathor Armor");
    List<String> equipChoice2 = Arrays.asList("Two Shortswords","Two Simple Melee Weapons");
    List<String> equipChoice3 = Arrays.asList("Dungeoneer's Pack","Explorer's Pack");

    /*
     * print all ranger information
     */
    public Ranger(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        
        setStartEquip();
        
        if (equip1 == equipChoice1.get(0)){
            armorClass = 14+dexMod;
        }else{
            armorClass = 11+ dexMod;
        }
        hitPoints = conMod + 10;
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
        allStartEquipment.add("Longbow and a quiver of 20 arrows");
        return allStartEquipment;
    }
}
