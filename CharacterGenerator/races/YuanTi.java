package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class YuanTi extends characterCreator{
    List<String> racialFeats = Arrays.asList("Darkvision","Innate Spellcasting","Magical Resistance","Poison Immunity");
    List<String> racialLangs = Arrays.asList("Common","Abyssal","Draconic");

    String size = "Medium";
    int speed = 30;

    /**
     * Prints out all related variables and information to YuanTi
     */
    public YuanTi(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Yuan-Ti Features: "+ racialFeats);
        System.out.println("Yuan-Ti Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,0,0,1,0,2).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
       
    }

}
