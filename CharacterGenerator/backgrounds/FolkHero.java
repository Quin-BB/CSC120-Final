package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class FolkHero extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Animal Handling","Survival");
    List<String> bgToolsProf =  Arrays.asList("One type of artisan's tools","Vehicles(land)");
    List<String> Equipment = Arrays.asList("One set of artisan's tools of your choice","Shovel","Iron Pot","Common clothes","10 gp");

    String DefiningEvent;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("The tyrant who rules my land will stop at nothing to see me killed.",
    "I'm convinced of the significance of my destiny, and blind to my shortcomings and the risk of failure.",
    "The people who knew me when I was young know my shameful secret, so I can never go home again.",
    "I have a weakness for the vices of the city, especially hard drink.",
    "Secretly, I believe that things would be better if I were a tyrant lording over the land.",
    "I have trouble trusting in my allies.");

    List<String> bondsChoice = Arrays.asList("I have a family, but I have no idea where they are. One day, I hope to see them again.",
    "I worked the land, I love the land, and I will protect the land.",
    "A proud noble once gave me a horrible beating, and I will take my revenge on any bully I encounter.",
    "My tools are symbols of my past life, and I carry them so that I will never forget my roots.",
    "I protect those who cannot protect themselves.",
    "I wish my childhood sweetheart had come with me to pursue my destiny.");

    List<String> idealsChoice = Arrays.asList("Respect. People deserve to be treated with dignity and respect. (Good)",
    "Fairness. No one should get preferential treatment before the law, and no one is above the law. (Lawful)",
    "Freedom. Tyrants must not be allowed to oppress the people. (Chaotic)",
    "Might. If I become strong, I can take what I want – what I deserve. (Evil)",
    "Sincerity. There's no good in pretending to be something I'm not. (Neutral)",
    "Destiny. Nothing and no one can steer me away from my higher calling. (Any)");

    List<String> traitsChoice = Arrays.asList("I judge people by their actions, not their words.",
    "If someone is in trouble, I'm always ready to lend help.",
    "When I set my mind to something, I follow through no matter what gets in my way.",
    "I have a strong sense of fair play and always try to find the most equitable solution to arguments.",
    "I'm confident in my own abilities and do what I can to instill confidence in others.",
    "Thinking is for other people. I prefer action.",
    "I misuse long words in an attempt to sound smarter.",
    "I get bored easily. When am I going to get on with my destiny?");

    List<String> definingEventChoice = Arrays.asList("I stood up to a tyrant's agents.",
    "I saved people during a natural disaster.",
    "I stood alone against a terrible monster.",
    "I stole from a corrupt merchant to help the poor.",
    "I led a militia to fight off an invading army.",
    "I broke into a tyrant's castle and stole weapons to arm the people.",
    "I trained the peasantry to use farm implements as weapons against a tyrant's soldiers.",
    "A lord rescinded an unpopular decree after I led a symbolic act of protest against it.",
    "A celestial, fey, or similar creature gave me a blessing or revealed my secret origin.",
    "Recruited into a lord's army, I rose to leadership and was commended for my heroism.");

    public FolkHero(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nFolk Hero Defining Moment: "+ setDefiningEvent());
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setDefiningEvent(){
            int choice = super.dice(1, 10, false);
            
            for (int i=0; i<10;i++){
                    if (definingEventChoice.get(i) == definingEventChoice.get(choice-1)){
                            DefiningEvent =  definingEventChoice.get(choice-1);
                    }   
            }
            return DefiningEvent;
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
