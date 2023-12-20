package CharacterGenerator.races;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Kenku extends characterCreator{
    List<String> racialFeats = Arrays.asList("Expert Forgery","Mimicry");
    List<String> racialLangs = Arrays.asList("Common","Auran");
    List<String> racialSkillProfs = Arrays.asList("Acrobatics","Deception","Stealth","Slight of Hand");//2 skill out of options

    String size = "Medium";
    int speed = 30;

    public Kenku(){
        List<String> statNames = Arrays.asList("Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma");
        System.out.println("Size: "+ size);
        System.out.println("Speed: "+speed+"ft");
        System.out.println("Kenku Features: "+ racialFeats);
        System.out.println("Kenku Languages: "+ racialLangs);
        System.out.println("Pick 2 Kenku Skill Proficiencies: "+ racialSkillProfs);

        for (int i=0;i<6;i++){
                System.out.println("____________\n"+statNames.get(i) +": "+ super.setStats(0,2,0,0,1,0).get(i));
                System.out.println("Modifier: "+ super.setMods().get(i)+"\n____________");
        
        } 
        System.out.println("\nInitiative Modifier: "+ super.setMods().get(1));
       
    }

    public void statBonus(){
        super.setStats(0,2,0,0,1,0);
    }
}
