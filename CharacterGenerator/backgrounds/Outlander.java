package CharacterGenerator.backgrounds;

import java.util.Arrays;
import java.util.List;

import CharacterGenerator.characterCreator;

public class Outlander extends  characterCreator{
        List<String> bgSkillProf = Arrays.asList("Athletics","Survival");
        List<String> bgLanguages =  Arrays.asList("One of your choice");
        List<String> Equipment = Arrays.asList("Staff","Hunting Trap","Trophy from an animal you killed","Traverler's Clothes","10 gp");

        String Origin;
        String Traits;
        String Ideals;
        String Bonds;
        String Flaws;

        List<String> flawsChoice = Arrays.asList("I am too enamored of ale, wine, and other intoxicants.",
        "There's no room for caution in a life lived to the fullest.",
        "I remember every insult I've received and nurse a silent resentment toward anyone who's ever wronged me.",
        "I am slow to trust members of other races, tribes, and societies.","Violence is my answer to almost any challenge.",
        "Don't expect me to save those who can't save themselves. It is nature's way that the strong thrive and the weak perish.");

        List<String> bondsChoice = Arrays.asList("My family, clan, or tribe is the most important thing in my life, even when they are far from me.",
        "An injury to the unspoiled wilderness of my home is an injury to me.",
        "I will bring terrible wrath dow on the evildoers who destroyed my homeland.",
        "I am the last of my tribe, and it is up to me to ensure their enter legend.",
        "I suffer awful visions of a coming disaster and will do anything to prevent it.",
        "It is my duty to provide children to sustain my tribe.");

        List<String> idealsChoice = Arrays.asList("Change. Life is like the seasons, in constant change, and we must change with it.(Chaotic)",
        "Greater Good. It is each person's responsibility to make the most happiness for the whole tribe (Good)",
        "Honor. If I dishonor myself, I dishonor my whole clan (Lawful)","Might. The strongest are meant to rule (Evil)",
        "Nature. The natural world is more important than all the construct of civilization (Neutral)",
        "Glory. I must earn glory in battle, for myself and my clan (Any)");

        List<String> traitsChoice = Arrays.asList("I'm driven by a wanderlust that lead me away from home",
        "I watch over my friends as if they were a litter of newborn pups",
        "I once ran 25 miles wihtout stoppping to warn my clan of an approaching orc horde. I'd do it again if I had to",
        "I have a lesson fro every situation, drawn from observing nature",
        "I place no stock in wealthy or well-mannered folk. Money and manners won't save you from a hungry owlbear.",
        "I'm always picking things up, absently fiddling with them, and sometimes accidentaly breaking them",
        "I feel far more comfortable around animals than people","I was, in fact, raised by wolves");

        List<String> originChoice = Arrays.asList("Forester","Trapper","Homesteader","Guide","Exile or Outcast",
        "Bounty Hunter","Pilgrim","Tribal Nomad","Hunter-gatherer","Tribal Marauder");

        public Outlander(){
                System.out.println("Background Skill Proficiencies: "+ bgSkillProf);
                // System.out.println("Background Tool Proficiencies: "+ bgToolsProf);
                System.out.println("Background Equipment: "+ Equipment);
                System.out.println("\nOutlander Origin: "+ setOrigin());
                System.out.println("\nPersonality Traits: "+ setTraits());
                System.out.println("\nIdeal: "+ setIdeals());
                System.out.println("\nBonds: "+ setBonds());
                System.out.println("\nFlaws: "+ setFlaws());
            }

        public String setOrigin(){
                int choice = super.dice(1, 10, false);
                
                for (int i=0; i<10;i++){
                        if (originChoice.get(i) == originChoice.get(choice-1)){
                                Origin =  originChoice.get(choice-1);
                        }   
                }
                return Origin;
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
