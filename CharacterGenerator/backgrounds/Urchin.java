package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Urchin extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Sleight of Hand","Stealth");
    List<String> bgToolsProf =  Arrays.asList("Disguise Kit","Thieves' tools");
    List<String> Equipment = Arrays.asList("Small knife","Map of city you grew up in","Pet mouse","Token to remember parents",
    "Common clothes","10 gp");

    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("If I'm outnumbered, I will run away from a fight.",
    "Gold seems like a lot of money to me, and I'll do just about anything for more of it.",
    "I will never fully trust anyone other than myself.",
    "I'd rather kill someone in their sleep then fight fair.",
    "It's not stealing if I need it more than someone else.",
    "People who can't take care of themselves get what they deserve.");

    List<String> bondsChoice = Arrays.asList("My town or city is my home, and I'll fight to defend it.",
    "I sponsor an orphanage to keep others from enduring what I was forced to endure.",
    "I owe my survival to another urchin who taught me to live on the streets.",
    "I owe a debt I can never repay to the person who took pity on me.",
    "I escaped my life of poverty by robbing an important person, and I'm wanted for it.",
    "No one else should have to endure the hardships I've been through.");

    List<String> idealsChoice = Arrays.asList("Respect. All people, rich or poor, deserve respect. (Good)",
    "Community. We have to take care of each other, because no one else is going to do it. (Lawful)",
    "Change. The low are lifted up, and the high and mighty are brought down. Change is the nature of things. (Chaotic)",
    "Retribution. The rich need to be shown what life and death are like in the gutters. (Evil)",
    "People. I help the people who help me-that's what keeps us alive. (Neutral)",
    "Aspiration. I'm going to prove that I'm worthy of a better life. (Any)");

    List<String> traitsChoice = Arrays.asList("I hide scraps of food and trinkets away in my pockets.",
    "I ask a lot of questions.",
    "I like to squeeze into small places where no one else can get to me.",
    "I sleep with my back to a wall or tree, with everything I own wrapped in a bundle in my arms.",
    "I eat like a pig and have bad manners.",
    "I think anyone who's nice to me is hiding evil intent.",
    "I don't like to bathe.",
    "I bluntly say what other people are hinting at or hiding.");

    public Urchin(){
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
