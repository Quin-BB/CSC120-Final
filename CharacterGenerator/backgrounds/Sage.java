package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Sage extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Arcana","History");
    List<String> bgLanguages =  Arrays.asList("Two of your choice");
    List<String> Equipment = Arrays.asList("A bottle of black ink","A quill","Small knife","letter from dead colleague with a currently unanswered question",
    "Common clothes","10 gp");

    String Specialty;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I am easily distracted by the promise of information.",
    "Most people scream and run when they see a demon. I stop and take notes on its anatomy.",
    "Unlocking an ancient mystery is worth the price of a civilization.",
    "I overlook obvious solutions in favor of complicated ones.",
    "I speak without really thinking through my words, invariably insulting others.",
    "I can't keep a secret to save my life, or anyone else's.");

    List<String> bondsChoice = Arrays.asList("It is my duty to protect my students.",
    "I have an ancient text that holds terrible secrets that must not fall into the wrong hands.",
    "I work to preserve a library, university, scriptorium, or monastery.",
    "My life's work is a series of tomes related to a specific field of lore.",
    "I've been searching my whole life for the answer to a certain question.",
    "I sold my soul for knowledge. I hope to do great deeds and win it back.");

    List<String> idealsChoice = Arrays.asList("Knowledge. The path to power and self-improvement is through knowledge. (Neutral)",
    "Beauty. What is beautiful points us beyond itself toward what is true. (Good)",
    "Logic. Emotions must not cloud our logical thinking. (Lawful)",
    "No Limits. Nothing should fetter the infinite possibility inherent in all existence. (Chaotic)",
    "Power. Knowledge is the path to power and domination. (Evil)",
    "Self-Improvement. The goal of a life of study is the betterment of oneself. (Any)");

    List<String> traitsChoice = Arrays.asList("I use polysyllabic words that convey the impression of great erudition.",
    "I've read every book in the world's greatest libraries—or I like to boast that I have.",
    "I'm used to helping out those who aren't as smart as I am, and I patiently explain anything and everything to others.",
    "There's nothing I like more than a good mystery.",
    "I'm willing to listen to every side of an argument before I make my own judgment.",
    "I … speak … slowly … when talking … to idiots, … which … almost … everyone … is … compared … to me.",
    "I am horribly, horribly awkward in social situations.",
    "I'm convinced that people are always trying to steal my secrets.");

    List<String> specialtyChoice = Arrays.asList("Alchemist","Astronomer",
    "Discredited academic",
    "Librarian",
    "Professor",
    "Researcher",
    "Wizard’s apprentice",
    "Scribe");

    public Sage(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nSage Specialty: "+ setSpecialty());
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setSpecialty(){
            int choice = super.dice(1, 8, false);
            
            for (int i=0; i<8;i++){
                    if (specialtyChoice.get(i) == specialtyChoice.get(choice-1)){
                            Specialty =  specialtyChoice.get(choice-1);
                    }   
            }
            return Specialty;
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
