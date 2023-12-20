package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Barbarian extends characterCreator{
    String hitDice = "1d12";
    // String subClass;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 

    int rages = 2;
    int rageDmg = +2;

    List<String> classSkillProf = Arrays.asList("Animal Handling", "Athletics","Intimidation", 
    "Nature","Perception","Survival");//chose 2
    List<String> classWeapProf =  Arrays.asList("All Simple Weapons","Martial Weapons");
    List<String> classArmorProf =  Arrays.asList("Light Armor","Medium Armor","Shields");
    List<String> classToolProf = Arrays.asList("None");
    List<String> classFeats = Arrays.asList("Rage","Unarmored Defense");
   
    List<String> savingThrows = Arrays.asList("Strength","Constitution");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
   
    List<String> equipChoice1 = Arrays.asList("Greataxe","Any Martial Melee Weapon");
    List<String> equipChoice2 = Arrays.asList("Two Handaxes","Any Simple Weapon");


    public Barbarian(){
        mods = super.setMods();
        int dexMod = mods.get(1);
        int conMod = mods.get(2);

        setStartEquip();
        armorClass = 10+dexMod+conMod;
        hitPoints = conMod + 12;
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
        System.out.println("\nRAGE INFORMATION");        
        System.out.println("Number of Rages per Long Rest: "+rages);
        System.out.println("While Raging You Deal: +"+rageDmg+" damage while attacking in melee using strength");
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


    public ArrayList<String> setStartEquip(){
        allStartEquipment.add(setEquip1());
        allStartEquipment.add(setEquip2());   
        allStartEquipment.add("Explorer's Pack");
        allStartEquipment.add("Four Javelins");
        return allStartEquipment;
    }
}
