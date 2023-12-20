package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class GuildArtisan extends characterCreator{
    List<String> bgSkillProf = Arrays.asList("Deception","Stealth");
    List<String> bgToolsProf =  Arrays.asList("One type of gaming set","Thieves' tools");
    List<String> Equipment = Arrays.asList("Crowbar","Dark common clothes with a hood","15 gp");

    String Business;
    String Traits;
    String Ideals;
    String Bonds;
    String Flaws;

    List<String> flawsChoice = Arrays.asList("I'll do anything to get my hands on something rare or priceless.",
    "I'm quick to assume that someone is trying to cheat me.",
    "No one must ever learn that I once stole money from guild coffers.",
    "I'm never satisfied with what I have – I always want more.",
    "I would kill to acquire a noble title.",
    "I'm horribly jealous of anyone who can outshine my handiwork. Everywhere I go, I'm surrounded by rivals.");

    List<String> bondsChoice = Arrays.asList("The workshop where I learned my trade is the most important place in the world to me.",
    "I created a great work for someone, and then found them unworthy to receive it. I'm still looking for someone worthy.",
    "I owe my guild a great debt for forging me into the person I am today.",
    "I pursue wealth to secure someone's love.",
    "One day I will return to my guild and prove that I am the greatest artisan of them all.",
    "I will get revenge on the evil forces that destroyed my place of business and ruined my livelihood.");

    List<String> idealsChoice = Arrays.asList("Community. It is the duty of all civilized people to strengthen the bonds of community and the security of civilization. (Lawful)",
    "Generosity. My talents were given to me so that I could use them to benefit the world. (Good)",
    "Freedom. Everyone should be free to pursue his or her own livelihood. (Chaotic)",
    "Greed. I'm only in it for the money. (Evil)",
    "People. I'm committed to the people I care about, not to ideals. (Neutral)",
    "Aspiration. I work hard to be the best there is at my craft.");

    List<String> traitsChoice = Arrays.asList("I believe that anything worth doing is worth doing right. I can't help it – I'm a perfectionist.",
    "I'm a snob who looks down on those who can't appreciate fine art.",
    "I always want to know how things work and what makes people tick.",
    "I'm full of witty aphorisms and have a proverb for every occasion.",
    "I'm rude to people who lack my commitment to hard work and fair play.",
    "I like to talk at length about my profession.",
    "I don't part with my money easily and will haggle tirelessly to get the best deal possible.",
    "I'm well known for my work, and I want to make sure everyone appreciates it. I'm always taken aback when people haven't heard of me.");

    List<String> businessChoice = Arrays.asList("Alchemists and apothecaries",
    "Armorers, locksmiths, and finesmiths",
    "Brewers, distillers, and vintners",
    "Calligraphers, scribes, and scriveners",
    "Carpenters, roofers, and plasterers",
    "Cartographers, surveyors, and chart-makers",
    "Cobblers and shoemakers",
    "Cooks and bakers",
    "Glassblowers and glaziers",
    "Jewelers and gemcutters",
    "Leatherworkers, skinners, and tanners",
    "Masons and stonecutters",
    "Painters, limners, and sign-makers",
    "Potters and tile-makers",
    "Shipwrights and sailmakers",
    "Smiths and metal-forgers",
    "Tinkers, pewterers, and casters",
    "Wagon-makers and wheelwrights",
    "Weavers and dyers",
    "Woodcarvers, coopers, and bowyers");

    public GuildArtisan(){
        System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
        System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
        System.out.println("Background Equipment: "+ Equipment);
        System.out.println("\nGuild Artisan Business Choice: "+ setSpecialty());
        System.out.println("\nPersonality Traits: "+ setTraits());
        System.out.println("\nIdeal: "+ setIdeals());
        System.out.println("\nBonds: "+ setBonds());
        System.out.println("\nFlaws: "+ setFlaws());
    }

    public String setSpecialty(){
            int choice = super.dice(1, 20, false);
            
            for (int i=0; i<20;i++){
                    if (businessChoice.get(i) == businessChoice.get(choice-1)){
                            Business =  businessChoice.get(choice-1);
                    }   
            }
            return Business;
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
