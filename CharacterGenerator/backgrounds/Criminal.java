package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Criminal extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Deception","Stealth");
    List<String> bgToolsProf =  Arrays.asList("One type of gaming set","Thieves' tools");
    List<String> Equipment = Arrays.asList("Crowbar","Dark common clothes with a hood","15 gp");

    String Specialty;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("When I see something valuable, I can't think about anything but how to steal it.",
    "When faced with a choice between money and my friends, I usually choose the money.",
    "If there's a plan, I'll forget it. If I don't forget it, I'll ignore it.",
    "I have a tell that reveals when I'm lying.","I turn tail and run when things look bad.",
    "An innocent person is in prison for a crime that I committed. I'm okay with that.");

    List<String> bondsChoice = Arrays.asList("I'm trying to pay off an old debt I owe to a generous benefactor.",
    "My ill-gotten gains go to support my family.",
    "Something important was taken from me, and I aim to steal it back."
    ,"I will become the greatest thief that ever lived.",
    "I'm guilty of a terrible crime. I hope I can redeem myself for it.",
    "Someone I loved died because of I mistake I made. That will never happen again.");

    List<String> idealsChoice = Arrays.asList("Honor. I don't steal from others in the trade. (Lawful)",
    "Freedom. Chains are meant to be broken, as are those who would forge them. (Chaotic)",
    "Charity. I steal from the wealthy so that I can help people in need. (Good)",
    "Greed. I will do whatever it takes to become wealthy. (Evil)",
    "People. I'm loyal to my friends, not to any ideals, and everyone else can take a trip down the Styx for all I care. (Neutral)",
    "Redemption. There's a spark of good in everyone. (Good)");

    List<String> traitsChoice = Arrays.asList("I always have a plan for what to do when things go wrong.",
    "I am always calm, no matter what the situation. I never raise my voice or let my emotions control me.",
    "The first thing I do in a new place is note the locations of everything valuable - or where such things could be hidden.",
    "I would rather make a new friend than a new enemy.", "I am incredibly slow to trust. Those who seem the fairest often have the most to hide.",
    "I don't pay attention to the risks in a situation. Never tell me the odds.",
    "The best way to get me to do something is to tell me I can't do it.",
    "I blow up at the slightest insult.");

    List<String> specialtyChoice = Arrays.asList("Blackmailer","Burglar","Enforcer","Fence","Highway robber",
    "Hired killer","Pickpocket","Smuggler");

    public Criminal(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nCriminal Specialty: "+ setSpecialty());
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
