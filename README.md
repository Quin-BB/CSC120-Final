## Reflection Questions
When approaching this project I knew I would have to start very broadly or I would get sucked into the minutiae of DnD character creation. Even so becuase so much of a dnd character sheet is interconnected I had to do a lot of thinking before hand about the many possible ways I could fashion such a generator. I ended up linking most of the random part to randomly generated enum values for race, class, and background but before I settled with that idea a bunch of other options came up. In the beginning of the project I was going to swap out the enums for interfaces and subclasses - not entirely different to the final product - but ended up leaving the enums in and just incorporating them into my design. There were some more less concrete ideas I scrapped that generally had a lot of excessive and redundant classes. I have a lot of features I would like to add that I kept thinking about as I wrote the code:
* Option to regenerate character without having to rerun the code
* Leveling Past Level 1
* More information abut features and skills
* Include the option to output the finished product to a pdf or a google sheet in case the npc created is for a more long term use or if a player is in need of a last minute character sheet - I can't email my terminal output to them 

I think other than the feedback that originally gave me this idea for the project, a really good piece of feedback came before I had any code written. I was talking to Rose and since she doesn't know a ton about DnD we were discussing if this generator was something that I should make super accessible to player not familiar with DnD. It wasn't really even the specific idea that helped but just talking through all the details with someone who couldn't see the evergrowing tangled web of interactions that dnd can be helped simplify my goal and the project in my mind.

I would tell myself to stop focusing on interfaces quite as much - I could see how I could implement them after the fact but at first I was too stuck on starting with an interface.

I do still think there are some areas I fell back on my procedural experience in some places possibly not utilizing the abilites of Java to its fullest. One potent example is when I considered using hashtables for some of the backgrounds traits and features but ended up stopping because I was more comfortable with the system I had developed. Also, possibly because I was already halfway done and didn't want to redo it all.

## Design Justification
