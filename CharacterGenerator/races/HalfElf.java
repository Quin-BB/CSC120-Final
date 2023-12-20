package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class HalfElf extends characterCreator{
    List<String> racialFeats = Arrays.asList("Darkvision","Fey Ancestry","Half-Elf Versaility");
    List<String> racialLangs = Arrays.asList("Common","Elvish","One choice");
    // List<String> racialWeapProfs = Arrays.asList("Battleaxe","Handaxe","Light Hammer","Warhammer");
    // List<String> racialToolProfs = Arrays.asList("Smith's Tools","Brewer's Supplies","Mason's Tools"); //one of 3 options


    String size = "Medium";
    int speed = 30;

    public HalfElf(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Half-Elf Features: "+ racialFeats);
        System.out.println("Half-Elf Languages: "+ racialLangs);
        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,1,1,0,0,2).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
      }

}
