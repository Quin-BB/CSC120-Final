package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Human extends characterCreator{
    List<String> racialLangs = Arrays.asList("Common","One Choice");
    
    String size = "Medium";
    int speed = 30;

    public Human(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Human Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(1,1,1,1,1,1).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
        
    }

    public void statBonus(){
        super.setStats(1,1,1,1,1,1);
    }
}
