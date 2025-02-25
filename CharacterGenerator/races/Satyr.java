package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Satyr extends characterCreator{
    List<String> racialFeats = Arrays.asList("Creature Type: Fey","Ram","Mirthful Leaps","Reveler","Magical Resistance");
    List<String> racialLangs = Arrays.asList("Common","One choice");
    
    String size = "Medium";
    int speed = 35;

    /**
     * Prints out all related variables and information to Satyrs
     */
    public Satyr(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Satyr Features: "+ racialFeats);
        System.out.println("Satyr Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,1,0,0,0,2).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
       
    }

}
