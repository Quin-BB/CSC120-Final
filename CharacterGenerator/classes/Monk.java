package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Monk extends characterCreator{
     String hitDice = "1d8";
    // String subClass;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 
    

    // String martialArts = "1d4";

    List<String> classSkillProf = Arrays.asList("Acrobatics", "Althetics","History","Insight",
    "Stealth","Religion");//chose 2
    List<String> classWeapProf =  Arrays.asList("All Simple Weapons","Shortswords");
    List<String> classArmorProf =  Arrays.asList("None");
    List<String> classToolProf = Arrays.asList("One type of artisan's tools or one musical instrument");
    List<String> classFeats = Arrays.asList("Unarmored Defense","Martial Arts (1d4)");
    List<String> savingThrows = Arrays.asList("Strength","Dexterity");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2; 
    List<String> equipChoice1 = Arrays.asList("Shortsword","Any Simple Weapon");
    List<String> equipChoice2 = Arrays.asList("Dungeoneer's Pack","Explorer's Pack");
    
    public Monk(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        int wisMod = mods.get(4);

        setStartEquip();
        armorClass = 10+dexMod+wisMod;
        hitPoints = conMod + 8;
      
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
        allStartEquipment.add("10 darts");
        return allStartEquipment;
    }
}
