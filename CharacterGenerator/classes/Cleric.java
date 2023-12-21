package CharacterGenerator.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Cleric extends characterCreator{
    String hitDice = "1d8";
    String subClass;

    int armorClass; // calcualte in main loop? based on dex? -- call set stats?? but racial bonuses?
    int hitPoints; //calculate this in the main loop where enums are checked? - based on con 
    int spellSaveDC; //8+2+ wisdom mod
    int spellAtkMod; //wisdom mod +2 

    String spellSlots = "2 1st Level Slot";
    int cantripsKnown = 3;
    int spellsKnown;// CALCULATE IN LOOP Wisdom mod + cleric level

    List<String> classSkillProf = Arrays.asList("History", "Insight","Persuasion", 
    "Medicine","Religion");//chose 2
    List<String> classWeapProf =  Arrays.asList("All Simple Weapons");
    List<String> classArmorProf =  Arrays.asList("Light Armor","Medium Armor","Shields");
    List<String> classToolProf = Arrays.asList("None");
    // List<String> classLanguages = Arrays.asList("Druidic");
    List<String> divineDomain = Arrays.asList("Arcana","Death","Forge","Grave","Knowledge","Life","Light","Nature",
    "Order","Peace","Tempest","Trickery","Twilight","War");
    List<String> savingThrows = Arrays.asList("Charisma","Wisdom");

    ArrayList<String> allStartEquipment = new ArrayList<>();


    String equip1;
    String equip2;
    String equip3;
    String equip4;
    List<String> equipChoice1 = Arrays.asList("Mace","Warhammer");
    List<String> equipChoice2 = Arrays.asList("Scale Mail","Leather Armor","Chain Mail");
    List<String> equipChoice3 = Arrays.asList("Light Crossbow","Any Simple Weapon");
    List<String> equipChoice4 = Arrays.asList("Priest's Pack","Explorer's pack");

    public Cleric(){
        mods = super.setMods();

        int dexMod = mods.get(1);
        int conMod = mods.get(2);
        int wisMod = mods.get(4);

        setStartEquip();
        if (equip2 == equipChoice2.get(0)){
                armorClass = 14+dexMod+2;
        }if(equip2 == equipChoice2.get(1)){
                armorClass = 11+ dexMod+2;
        } else{
                armorClass = 16+2;
        }        
        hitPoints = conMod + 8;
        spellSaveDC = 10 + wisMod;
        spellAtkMod = wisMod+2;
        System.out.println("Divine Domain: "+ subClass);
        System.out.println("Armor Class: "+ armorClass);
        System.out.println("Hit Points: "+ hitPoints);
        System.out.println("Hit Dice: "+ hitDice);
        System.out.println("\nChoose Two Class Skills: "+ classSkillProf);
        System.out.println("Saving Throws: "+ savingThrows);
        // System.out.println("Class Features: "+ classFeats);
        System.out.println("\nClass Weapon Proficiencies: "+classWeapProf);
        System.out.println("Class Armor Proficienceis: "+ classArmorProf);
        System.out.println("Class Tool Proficiencies: "+ classToolProf);
        System.out.println("\nStarting Equipment: "+ allStartEquipment);
        System.out.println("\nSPELL INFORMATION");
        System.out.println("Spell Save DC: "+ spellSaveDC + "       Spell Attack Modifier: +"+spellAtkMod);
        System.out.println("Spell Slots: "+ spellSlots + "      Cantrips Known: "+ cantripsKnown+"      Spells Known: "+spellsKnown);

    }
        /**
         * Pick the cleric's divine domain from list
         * @return subclass chosen
         */
        public String setSubClass(){
                int choice = super.dice(1, 14, false);
                
                for (int i=0; i<14;i++){
                        if (divineDomain.get(i) == divineDomain.get(choice-1)){
                                subClass =  divineDomain.get(choice-1);
                        }   
                }        
                return subClass;
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
         int choice = super.dice(1, 3, false);
            
        for (int i=0; i<3;i++){
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
            
        for (int i=0; i<10;i++){
                if (equipChoice3.get(i) == equipChoice3.get(choice-1)){
                       equip3 = equipChoice3.get(choice-1);
                }   
        }       
        return equip3;
    }

     /**
     * make the 4th equipment choice
     * @return the choice made for equipment choice
     */
    public String setEquip4(){
         int choice = super.dice(1, 2, false);
            
        for (int i=0; i<2;i++){
                if (equipChoice4.get(i) == equipChoice4.get(choice-1)){
                       equip4 = equipChoice4.get(choice-1);
                }   
        }       
        return equip4;
    }

    /**
     * Using the all starting equipment including choices made to output one ArrayList of class starting Equipment
     * @return ArrayList of class starting equipment
     */
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
