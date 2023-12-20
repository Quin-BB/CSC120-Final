package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Soldier extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Athletics","Intimidation");
    List<String> bgToolsProf =  Arrays.asList("One type of gaming set","Vehicles (land)");
    List<String> Equipment = Arrays.asList("Insignia of Rank","Trophy from fallen enemy","Set of bone dice or deck of cards",
    "Common clothes","10 gp");

    String Specialty;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("The monstrous enemy we faced in battle still leaves me quivering with fear.",
    "I have little respect for anyone who is not a proven warrior.",
    "I made a terrible mistake in battle that cost many lives – and I would do anything to keep that mistake secret.",
    "My hatred of my enemies is blind and unreasoning.",
    "I obey the law, even if the law causes misery.",
    "I'd rather eat my armor than admit when I'm wrong.");

    List<String> bondsChoice = Arrays.asList("I would still lay down my life for the people I served with.",
    "Someone saved my life on the battlefield. To this day, I will never leave a friend behind.",
    "My honor is my life.",
    "I'll never forget the crushing defeat my company suffered or the enemies who dealt it.",
    "Those who fight beside me are those worth dying for.",
    "I fight for those who cannot fight for themselves.");

    List<String> idealsChoice = Arrays.asList("Greater Good. Our lot is to lay down our lives in defense of others. (Good)",
    "Responsibility. I do what I must and obey just authority. (Lawful)",
    "Independence. When people follow orders blindly, they embrace a kind of tyranny. (Chaotic)",
    "Might. In life as in war, the stronger force wins. (Evil)",
    "Live and Let Live. Ideals aren't worth killing over or going to war for. (Neutral)",
    "Nation. My city, nation, or people are all that matter. (Any)");

    List<String> traitsChoice = Arrays.asList("I'm always polite and respectful.",
    "I'm haunted by memories of war. I can't get the images of violence out of my mind.",
    "I've lost too many friends, and I'm slow to make new ones.",
    "I'm full of inspiring and cautionary tales from my military experience relevant to almost every combat situation.",
    "I can stare down a hell hound without flinching.",
    "I enjoy being strong and like breaking things.",
    "I have a crude sense of humor.",
    "I face problems head-on. A simple, direct solution is the best path to success.");

    List<String> specialtyChoice = Arrays.asList("Officer",
    "Scout",
    "Infantry",
    "Cavalry",
    "Healer",
    "Quartermaster",
    "Standard bearer",
    "Support staff (cook, blacksmith, or the like)");

    public Soldier(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nSoldier Specialty: "+ setSpecialty());
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
