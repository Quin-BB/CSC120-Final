//I added centaur since Jordan mentioned his first character was a centaur :D
package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Centaur extends characterCreator{
    List<String> racialFeats = Arrays.asList("Creature Type: Fey","Charge","Equine Build","Hooves","Natural Affinity");
    List<String> racialLangs = Arrays.asList("Common","One choice");


    String size = "Medium";
    int speed = 40;

    public Centaur(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Centaur Features: "+ racialFeats);
        System.out.println("Centaur Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,1,2,0,0,0).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
    }

    // public void statBonus(){ //when given a choice in stat bonuses I just went with dex and con 
    //     super.setStats(0,1,2,0,0,0);
    // }
}
