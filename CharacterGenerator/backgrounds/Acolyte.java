package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Acolyte extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Insight","Religion");
    List<String> bgLanguages =  Arrays.asList("Two of your choice");
    List<String> Equipment = Arrays.asList("A holy symbol","Prayer book or prayer wheel","5 sitcks of incense",
    "vestments","common clothes","15gp");

    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I judge others harshly, and myself even more severely.",
    "I put too much trust in those who wield power within my temple's hierarchy.",
    "My piety sometimes leads me to blindly trust those that profess faith in my god.",
    "I am inflexible in my thinking.","I am suspicious of strangers and expect the worst of them.",
    "Once I pick a goal, I become obsessed with it to the detriment of everything else in my life.");

    List<String> bondsChoice = Arrays.asList("I would die to recover an ancient relic of my faith that was lost long ago.",
    "I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.",
    "I owe my life to the priest who took me in when my parents died.",
    "Everything I do is for the common people.","I will do anything to protect the temple where I served.",
    "I seek to preserve a sacred text that my enemies consider heretical and seek to destroy.");

    List<String> idealsChoice = Arrays.asList("Tradition. The ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)",
    "Charity. I always try to help those in need, no matter what the personal cost. (Good)",
    "Change. We must help bring about the changes the gods are constantly working in the world. (Chaotic)",
    "Power. I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)",
    "Faith. I trust that my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)",
    "Aspiration. I seek to prove myself worthy of my god's favor by matching my actions against their teachings. (Any)");

    List<String> traitsChoice = Arrays.asList("I idolize a particular hero of my faith, and constantly refer to that person's deeds and example.",
    "I can find common ground between the fiercest enemies, empathizing with them and always working toward peace.",
    "I see omens in every event and action. The gods try to speak to us, we just need to listen.",
    "Nothing can shake my optimistic attitude.",
    "I quote (or misquote) sacred texts and proverbs in almost every situation.",
    "I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.",
    "I've enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me.",
    "I've spent so long in the temple that I have little practical experience dealing with people in the outside world.");
/**
 * Constructor prints out all relevent background information
 */
    public Acolyte(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Languages: "+ bgLanguages);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    /**
     * Rolls a dice to pick a trait from the Acolyte's trait lists
     * @return the chosen trait from the given list options
     */
        public String setTraits(){
            int choice = super.dice(1, 8, false);
            
            for (int i=0; i<8;i++){
                    if (traitsChoice.get(i) == traitsChoice.get(choice-1)){
                            Traits =  traitsChoice.get(choice-1);
                    }   
            }
            return Traits;
    }
    
    /**
     * Rolls a dice to pick a ideal from the Acolyte's ideal lists
     * @return the chosen ideal from the given list options
     */
        public String setIdeals(){
            int choice = super.dice(1, 6, false);
            
            for (int i=0; i<6;i++){
                    if (idealsChoice.get(i) == idealsChoice.get(choice-1)){
                        Ideals =  idealsChoice.get(choice-1);
                    }   
            }
            return Ideals;
    }
    
    /**
     * Rolls a dice to pick a bonds from the Acolyte's bonds lists
     * @return the chosen bonds from the given list options
     */
        public String setBonds(){
            int choice = super.dice(1, 6, false);
            
            for (int i=0; i<6;i++){
                    if (bondsChoice.get(i) == bondsChoice.get(choice-1)){
                        Bonds =  bondsChoice.get(choice-1);
                    }   
            }
            return Bonds;
    }

    /**
     * Rolls a dice to pick a flaw from the Acolyte's flaw list
     * @return the chosen flaw from the given list options
     */
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
