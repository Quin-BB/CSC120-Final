package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Paladin extends characterCreator{
    String hitDice = "1d10";

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 

    List<String> classSkillProf = Arrays.asList("Athletics", "Insight","Intimidation", 
    "Medicine","Persuasion","Religion");//choose 2
    List<String> classWeapProf =  Arrays.asList("Simple Weapons","Martial Weapons");
    List<String> classArmorProf =  Arrays.asList("All Armor","Shields");
    List<String> classToolProf = Arrays.asList("None");
    List<String> classFeats = Arrays.asList("Divine Sense","Lay on Hands");
    List<String> savingThrows = Arrays.asList("Charisma","Wisdom");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
    List<String> equipChoice1 = Arrays.asList("Martial Weapon and a Shield","Two Martial Weapons");
    List<String> equipChoice2 = Arrays.asList("Five Javelins","Any Simple Melee Weapon");
    List<String> equipChoice3 = Arrays.asList("Priest's Pack","Explorer's Pack");
  

    public Paladin(){
        mods = super.setMods();

        int conMod = mods.get(2);

        setStartEquip();
        armorClass = 16;
        hitPoints = conMod + 10;
      
        System.out.println("Armor Class: "+ armorClass);
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

    public String setEquip1(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice1.get(i) == equipChoice1.get(choice-1)){
                       equip1 = equipChoice1.get(choice-1);
                }   
        }       
        return equip1;
    }

    public String setEquip2(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice2.get(i) == equipChoice2.get(choice-1)){
                       equip2 = equipChoice2.get(choice-1);
                }   
        }       
        return equip2;
    }


    public String setEquip3(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice3.get(i) == equipChoice3.get(choice-1)){
                       equip3 = equipChoice3.get(choice-1);
                }   
        }       
        return equip3;
    }

    // public String setEquip4(){
    //      int choice = super.dice(1, 2, false);
            
    //     for (int i=0; i<10;i++){
    //             if (equipChoice4.get(i) == equipChoice4.get(choice-1)){
    //                    equip4 = equipChoice4.get(choice-1);
    //             }   
    //     }       
    //     return equip4;
    // }

    public ArrayList<String> setStartEquip(){
        allStartEquipment.add(setEquip1());
        allStartEquipment.add(setEquip2());
        allStartEquipment.add(setEquip3());
        // allStartEquipment.add(setEquip4());       
        allStartEquipment.add("Chain mail");
        allStartEquipment.add("Holy Symbol");
        return allStartEquipment;
    } 
}
