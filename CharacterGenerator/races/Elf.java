package CharacterGenerator.races;

import CharacterGenerator.characterCreator;
import java.util.Arrays;
import java.util.List;

public class Elf extends characterCreator{
    
    List<String> racialFeats = Arrays.asList("Darkvision","Fey Ancestry","Trance","Keen Senses");
    List<String> racialLangs = Arrays.asList("Common","Elven");

    String size = "Medium";
    int speed = 30;

    /**
     * Prints out all related variables and information to Elfs
     */
    public Elf(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Elf Features: "+ racialFeats);
        System.out.println("Elf Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,2,0,0,0,0).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
       
    }

}
