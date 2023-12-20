package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Charlatan extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Deception","Sleight of Hand");
    List<String> bgToolsProf =  Arrays.asList("Disguise Kit","Forgery Kit");
    List<String> Equipment = Arrays.asList("Fine clothes, Disguise Kit",
    "tools of the con of your choice (10 bottles filled with colored liquid, weighted dice, marked cards, imaginary signet of a duke)",
    "15gp");

    String Scam;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I can't resist a pretty face.",
    "I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in.",
    "I'm convinced that no one could ever fool me the way I fool others.",
    "I'm too greedy for my own good. I can't resist taking a risk if there's money involved.",
    "I can't resist swindling people who are more powerful than me.",
    "I hate to admit it and will hate myself for it, but I'll run and preserve my own hide if the going gets tough.");

    List<String> bondsChoice = Arrays.asList("I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about.",
    "I owe everything to my mentor – a horrible person who's probably rotting in jail somewhere.",
    "Somewhere out there, I have a child who doesn't know me. I'm making the world better for him or her.",
    "I come from a noble family, and one day I'll reclaim my lands and title from those who stole them from me.",
    "A powerful person killed someone I love. Some day soon, I'll have my revenge.",
    "I swindled and ruined a person who didn't deserve it. I seek to atone for my misdeeds but might never be able to forgive myself.");

    List<String> idealsChoice = Arrays.asList("Independence. I am a free spirit - no one tells me what to do. (Chaotic)",
    "Fairness. I never target people who can't afford to lose a few coins. (Lawful)",
    "Charity. I distribute the money I acquire to the people who really need it. (Good)",
    "Creativity. I never run the same con twice. (Chaotic)",
    "Friendship. Material goods come and go. Bonds of friendship last forever. (Good)",
    "Aspiration. I'm determined to make something of myself. (Any)");

    List<String> traitsChoice = Arrays.asList("	I fall in and out of love easily, and am always pursuing someone.",
    "I have a joke for every occasion, especially occasions where humor is inappropriate.",
    "Flattery is my preferred trick for getting what I want.",
    "I'm a born gambler who can't resist taking a risk for a potential payoff.",
    "I lie about almost everything, even when there's no good reason to.",
    "Sarcasm and insults are my weapons of choice.",
    "I keep multiple holy symbols on me and invoke whatever deity might come in useful at any given moment.",
    "I pocket anything I see that might have some value.");

    List<String> scamChoice = Arrays.asList("I cheat at games of chance.",
    "I shave coins or forge documents.",
    "I insinuate myself into people's lives to prey on their weakness and secure their fortunes.",
    "I put on new identities like clothes.",
    "I run sleight-of-hand cons on street corners.",
    "I convince people that worthless junk is worth their hard-earned money.");

    public Charlatan(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nCharlatan Scam: "+ setScam());
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setScam(){
            int choice = super.dice(1, 6, false);
            
            for (int i=0; i<6;i++){
                    if (scamChoice.get(i) == scamChoice.get(choice-1)){
                            Scam =  scamChoice.get(choice-1);
                    }   
            }
            return Scam;
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
