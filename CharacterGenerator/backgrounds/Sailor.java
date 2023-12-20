package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Sailor extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Althetics","Perception");
    List<String> bgToolsProf =  Arrays.asList("Navigator's tools","Vehicles (water)");
    List<String> Equipment = Arrays.asList("Belaying pin (club)","50ft of Silk Rope","Lucky Charm","Common clothes","10gp");

    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I follow orders, even if I think they're wrong.",
    "I'll say anything to avoid having to do extra work.",
    "Once someone questions my courage, I never back down no matter how dangerous the situation.",
    "Once I start drinking, it's hard for me to stop.",
    "I can't help but pocket loose coins and other trinkets I come across.",
    "My pride will probably lead to my destruction.");

    List<String> bondsChoice = Arrays.asList("I'm loyal to my captain first, everything else second.",
    "The ship is most important – crewmates and captains come and go.",
    "I'll always remember my first ship.",
    "In a harbor town, I have a paramour whose eyes nearly stole me from the sea.",
    "I was cheated out of my fair share of the profits, and I want to get my due.",
    "Ruthless pirates murdered my captain and crewmates, plundered our ship, and left me to die. Vengeance will be mine.");

    List<String> idealsChoice = Arrays.asList("Respect. The thing that keeps a ship together is mutual respect between captain and crew. (Good)",
    "Fairness. We all do the work, so we all share in the rewards. (Lawful)",
    "Freedom. The sea is freedom-the freedom to go anywhere and do anything. (Chaotic)",
    "Mastery. I'm a predator, and the other ships on the sea are my prey. (Evil)",
    "People. I'm committed to my crewmates, not to ideals. (Neutral)",
    "Aspiration. Someday I'll own my own ship and chart my own destiny. (Any)");

    List<String> traitsChoice = Arrays.asList("My friends know they can rely on me, no matter what.",
    "I work hard so that I can play hard when the work is done.",
    "I enjoy sailing into new ports and making new friends over a flagon of ale.",
    "I stretch the truth for the sake of a good story.",
    "To me, a tavern brawl is a nice way to get to know a new city.",
    "I never pass up a friendly wager.",
    "My language is as foul as an otyugh nest.",
    "I like a job well done, especially if I can convince someone else to do it.");

    public Sailor(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setTraits(){
            int choice = super.dice(1, 8, false);
            
            for (int i=0; i<8;i++){
                    if (traitsChoice.get(i) == traitsChoice.get(choice-1)){
                            Traits =  traitsChoice.get(choice-1);
                    }   
            }
            return Traits;
    }
    
    public String setIdeals(){
            int choice = super.dice(1, 6, false);
            
            for (int i=0; i<6;i++){
                    if (idealsChoice.get(i) == idealsChoice.get(choice-1)){
                        Ideals =  idealsChoice.get(choice-1);
                    }   
            }
            return Ideals;
    }
    
    public String setBonds(){
            int choice = super.dice(1, 6, false);
            
            for (int i=0; i<6;i++){
                    if (bondsChoice.get(i) == bondsChoice.get(choice-1)){
                        Bonds =  bondsChoice.get(choice-1);
                    }   
            }
            return Bonds;
    }
    
        public String setFlaws(){
            int choice = super.dice(1, 6, false);
            
            for (int i=0; i<6;i++){
                    if (flawsChoice.get(i) == flawsChoice.get(choice-1)){
                        Flaws =  flawsChoice.get(choice-1);
                    }   
            }
            return Flaws;
    }
}
