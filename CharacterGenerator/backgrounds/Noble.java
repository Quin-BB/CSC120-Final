package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Noble extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("History","Persuasion");
    List<String> bgToolsProf =  Arrays.asList("One type of gaming set");
    List<String> bgLanguages = Arrays.asList("One of your choice");
    List<String> Equipment = Arrays.asList("Fine Clothes","A Signet ring","Scroll of pedigree","25 gp");

    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I secretly believe that everyone is beneath me.",
    "I hide a truly scandalous secret that could ruin my family forever.",
    "I too often hear veiled insults and threats in every word addressed to me, and I'm quick to anger.",
    "I have an insatiable desire for carnal pleasures.",
    "In fact, the world does revolve around me.",
    "By my words and actions, I often bring shame to my family.");

    List<String> bondsChoice = Arrays.asList("I will face any challenge to win the approval of my family.",
    "My house's alliance with another noble family must be sustained at all costs.",
    "Nothing is more important than the other members of my family.",
    "I am in love with the heir of a family that my family despises.",
    "My loyalty to my sovereign is unwavering.",
    "The common folk must see me as a hero of the people.");

    List<String> idealsChoice = Arrays.asList("Respect. Respect is due to me because of my position, but all people regardless of station deserve to be treated with dignity. (Good)",
    "Responsibility. It is my duty to respect the authority of those above me, just as those below me must respect mine. (Lawful)",
    "Independence. I must prove that I can handle myself without the coddling of my family. (Chaotic)",
    "Power. If I can attain more power, no one will tell me what to do. (Evil)",
    "Family. Blood runs thicker than water. (Any)",
    "Noble Obligation. It is my duty to protect and care for the people beneath me. (Good)");

    List<String> traitsChoice = Arrays.asList("My eloquent flattery makes everyone I talk to feel like the most wonderful and important person in the world.",
    "The common folk love me for my kindness and generosity.",
    "No one could doubt by looking at my regal bearing that I am a cut above the unwashed masses.",
    "I take great pains to always look my best and follow the latest fashions.",
    "I don't like to get my hands dirty, and I won't be caught dead in unsuitable accommodations.",
    "Despite my noble birth, I do not place myself above other folk. We all have the same blood.",
    "My favor, once lost, is lost forever.",
    "If you do me an injury, I will crush you, ruin your name, and salt your fields.");

    public Noble(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Languages: "+ bgLanguages);
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
