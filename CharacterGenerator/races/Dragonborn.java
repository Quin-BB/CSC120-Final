package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Dragonborn extends characterCreator{
    
    List<String> racialFeats = Arrays.asList("Breath Weapon","Damage Resistance");
    List<String> racialLangs = Arrays.asList("Common","Draconic");

    List<String> colors = Arrays.asList("Black | Acid","Blue | Lightning","Brass | Fire","Bronze | Lightning","Copper | Acid",
    "Gold | Fire","Green | Poison","Red | Fire","Silver | Cold","White | Cold");
    String chosenAncestry;

    String size = "Medium";
    int speed = 30;

    /**
     * Prints out all related variables and information to Dragonborns
     */
    public Dragonborn(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");

        System.out.println("Draconic Ancestry: "+ ancestry());
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Dragonborn Features: "+ racialFeats);
        System.out.println("Dragonborn Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(2,0,0,0,0,1).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
       
    }

    /**
     * Pick dragonborn ancestry from list
     * @return chosen dragonborn ancestry color
     */
    public String ancestry(){
       int choice = super.dice(1, 10, false);
       
       for (int i=0; i<10;i++){
            if (colors.get(i) == colors.get(choice-1)){
                chosenAncestry =  colors.get(choice-1);
            }   
       }
       return chosenAncestry;
    }
}
    
