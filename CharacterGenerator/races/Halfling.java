package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Halfling extends characterCreator{
    List<String> racialFeats = Arrays.asList("Brave","Nimble","Lucky");
    List<String> racialLangs = Arrays.asList("Common","Halfling");
    // List<String> racialWeapProfs = Arrays.asList("Battleaxe","Handaxe","Light Hammer","Warhammer");
    // List<String> racialToolProfs = Arrays.asList("Smith's Tools","Brewer's Supplies","Mason's Tools"); //one of 3 options


    String size = "Small";
    int speed = 25;

    /**
     * Prints out all related variables and information to Halflings
     */
    public Halfling(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Hlafling Features: "+ racialFeats);
        System.out.println("Halfing Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,2,0,0,0,0).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
       
    }

}
