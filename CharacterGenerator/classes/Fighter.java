package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Fighter extends characterCreator{
    String hitDice = "1d10";
    String fightingStyle;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 

    List<String> classSkillProf = Arrays.asList("Acrobatics", "Animal Handling","Athletics", 
    "History","Inisgh","Intimidation","Perception","Survival");//chose 2
    List<String> classWeapProf =  Arrays.asList("All Simple Weapons","Martial Weapons");
    List<String> classArmorProf =  Arrays.asList("All Armor","Shields");
    List<String> classToolProf = Arrays.asList("None");
    List<String> classFeats = Arrays.asList("Second Wind");
    List<String> fightingStyles = Arrays.asList("Archery","Blind Fighting","Defense","Dueling","Great Weapon Fighting",
    "Interception","Protection","Superior Technique","Thrown Weapon Fighting","Two-Weapon Fighting","Unarmed Fighting");
    List<String> savingThrows = Arrays.asList("Strength","Constitution");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
    String equip4;
    List<String> equipChoice1 = Arrays.asList("Chain Mail","Leather Armor, Longbow, 20 Arrows");
    List<String> equipChoice2 = Arrays.asList("Martial Weapon and a shield","Two Martial Weapons");
    List<String> equipChoice3 = Arrays.asList("Light Crossbow and 20 bolts","Two Handaxes");
    List<String> equipChoice4 = Arrays.asList("Dungeoneer's Pack","Explorer's pack");

    public Fighter(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);

        setStartEquip();
        if (equip1 == equipChoice1.get(0)){
                armorClass = 14+dexMod+2;
        }if(equip1 == equipChoice2.get(1)){
                armorClass = 16;
        } 
        hitPoints = conMod + 10;
       
        System.out.println("Armor Class: "+ armorClass);
        System.out.println("Hit Points: "+ hitPoints);
        System.out.println("Hit Dice: "+ hitDice);
        System.out.println("\nChoose Two Class Skills: "+ classSkillProf);
        System.out.println("Saving Throws: "+ savingThrows);
        System.out.println("Class Features: "+ classFeats);
        System.out.println("Divine Domain: "+ fightingStyle);
        System.out.println("\nClass Weapon Proficiencies: "+classWeapProf);
        System.out.println("Class Armor Proficienceis: "+ classArmorProf);
        System.out.println("Class Tool Proficiencies: "+ classToolProf);
        System.out.println("\nStarting Equipment: "+ allStartEquipment);
        
    }

    public String setFightingStyle(){
        int choice = super.dice(1, 14, false);
            
        for (int i=0; i<14;i++){
                if (fightingStyles.get(i) == fightingStyles.get(choice-1)){
                        fightingStyle =  fightingStyles.get(choice-1);
                }   
        }        
        return fightingStyle;
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

    public String setEquip4(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice4.get(i) == equipChoice4.get(choice-1)){
                       equip4 = equipChoice4.get(choice-1);
                }   
        }       
        return equip4;
    }

    public ArrayList<String> setStartEquip(){
        allStartEquipment.add(setEquip1());
        allStartEquipment.add(setEquip2());
        allStartEquipment.add(setEquip3());
        allStartEquipment.add(setEquip4());       
        allStartEquipment.add("Shield");
        allStartEquipment.add("Holy Symbol");
        return allStartEquipment;
    }
}
