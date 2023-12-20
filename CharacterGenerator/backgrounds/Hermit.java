package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Hermit extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Medicine","Religion");
    List<String> bgToolsProf =  Arrays.asList("Herbalism Kit");
    List<String> bgLanguages = Arrays.asList("One of your choice");
    List<String> Equipment = Arrays.asList("Scroll case full of notes from your studies or prayers","Winter Blanket",
    "Common clothes","Herbalism kit","5 gp");

    String Seclusion;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("Now that I've returned to the world, I enjoy its delights a little too much.",
    "I harbor dark, bloodthirsty thoughts that my isolation and meditation failed to quell.",
    "I am dogmatic in my thoughts and philosophy.",
    "I let my need to win arguments overshadow friendships and harmony.",
    "I'd risk too much to uncover a lost bit of knowledge.",
    "I like keeping secrets and won't share them with anyone.");

    List<String> bondsChoice = Arrays.asList("Nothing is more important than the other members of my hermitage, order, or association.",
    "I entered seclusion to hide from the ones who might still be hunting me. I must someday confront them.",
    "I'm still seeking the enlightenment I pursued in my seclusion, and it still eludes me.",
    "I entered seclusion because I loved someone I could not have.",
    "Should my discovery come to light, it could bring ruin to the world.",
    "My isolation gave me great insight into a great evil that only I can destroy.");

    List<String> idealsChoice = Arrays.asList("	Greater Good. My gifts are meant to be shared with all, not used for my own benefit. (Good)",
    "Logic. Emotions must not cloud our sense of what is right and true, or our logical thinking. (Lawful)",
    "Free Thinking. Inquiry and curiosity are the pillars of progress. (Chaotic)",
    "Power. Solitude and contemplation are paths toward mystical or magical power. (Evil)",
    "Live and Let Live. Meddling in the affairs of others only causes trouble. (Neutral)",
    "Self-Knowledge. If you know yourself, there's nothing left to know. (Any)");

    List<String> traitsChoice = Arrays.asList("I've been isolated for so long that I rarely speak, preferring gestures and the occasional grunt.",
    "I am utterly serene, even in the face of disaster.",
    "The leader of my community had something wise to say on every topic, and I am eager to share that wisdom.",
    "I feel tremendous empathy for all who suffer.",
    "I'm oblivious to etiquette and social expectations.",
    "I connect everything that happens to me to a grand, cosmic plan.",
    "I often get lost in my own thoughts and contemplation, becoming oblivious to my surroundings.",
    "I am working on a grand philosophical theory and love sharing my ideas.");

    List<String> seclusionChoice = Arrays.asList("I was searching for spiritual enlightenment.",
    "I was partaking of communal living in accordance with the dictates of a religious order.",
    "I was exiled for a crime I didn't commit.",
    "I retreated from society after a life-altering event.",
    "I needed a quiet place to work on my art, literature, music, or manifesto.",
    "I needed to commune with nature, far from civilization.",
    "I was the caretaker of an ancient ruin or relic.",
    "I was a pilgrim in search of a person, place, or relic of spiritual significance.");

    public Hermit(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background: "+ bgLanguages);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nHermit Seclusion Reason: "+ setSeclusion());
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setSeclusion(){
            int choice = super.dice(1, 8, false);
            
            for (int i=0; i<8;i++){
                    if (seclusionChoice.get(i) == seclusionChoice.get(choice-1)){
                            Seclusion =  seclusionChoice.get(choice-1);
                    }   
            }
            return Seclusion;
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
