package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Entertainer extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Acrobatics","Performance");
    List<String> bgToolsProf =  Arrays.asList("Disguise kit","One type of musical instrument");
    List<String> Equipment = Arrays.asList("Musical Instrument","Favor of an admirer","Costume","15 gp");

    String Routines;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I'll do anything to win fame and renown.",
    "I'm a sucker for a pretty face.",
    "A scandal prevents me from ever going home again. That kind of trouble seems to follow me around.",
    "I once satirized a noble who still wants my head. It was a mistake that I will likely repeat.",
    "I have trouble keeping my true feelings hidden. My sharp tongue lands me in trouble.",
    "Despite my best efforts, I am unreliable to my friends.");

    List<String> bondsChoice = Arrays.asList("My instrument is my most treasured possession, and it reminds me of someone I love.",
    "Someone stole my precious instrument, and someday I'll get it back.",
    "I want to be famous, whatever it takes.",
    "I idolize a hero of the old tales and measure my deeds against that person's.",
    "I will do anything to prove myself superior to my hated rival.",
    "I would do anything for the other members of my old troupe.");

    List<String> idealsChoice = Arrays.asList("Beauty. When I perform, I make the world better than it was. (Good)",
    "Tradition. The stories, legends, and songs of the past must never be forgotten, for they teach us who we are. (Lawful)",
    "Creativity. The world is in need of new ideas and bold action. (Chaotic)",
    "Greed. I'm only in it for the money and fame. (Evil)",
    "People. I like seeing the smiles on people's faces when I perform. That's all that matters. (Neutral)",
    "Honesty. Art should reflect the soul; it should come from within and reveal who we really are. (Any)");

    List<String> traitsChoice = Arrays.asList("I know a story relevant to almost every situation.",
    "Whenever I come to a new place, I collect local rumors and spread gossip.",
    "I'm a hopeless romantic, always searching for that special someone.",
    "Nobody stays angry at me or around me for long, since I can defuse any amount of tension.",
    "I love a good insult, even one directed at me.",
    "I get bitter if I'm not the center of attention.",
    "I'll settle for nothing less than perfection.",
    "I change my mood or my mind as quickly as I change key in a song.");

    List<String> routineChoice = Arrays.asList("Actor","Dancer","Fire-eater","Jester","Juggler","Instrumentalist",
    "Poet","Singer","Storyteller","Tumbler");

    public Entertainer(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nEntertainer Routine: "+ setRoutine());
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setRoutine(){
            int choice = super.dice(1, 10, false);
            
            for (int i=0; i<10;i++){
                    if (routineChoice.get(i) == routineChoice.get(choice-1)){
                            Routines =  routineChoice.get(choice-1);
                    }   
            }
            return Routines;
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
