package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Gnome extends characterCreator{
    List<String> racialFeats = Arrays.asList("Darkvision","Gnome Cunning");
    List<String> racialLangs = Arrays.asList("Common","Gnomish");
    

    String size = "Small";
    int speed = 25;
   
    /**
     * Prints out all related variables and information to Gnomes
     */
    public Gnome(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Gnome Features: "+ racialFeats);
        System.out.println("Gnome Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,0,0,2,0,0).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
        
    }

}
