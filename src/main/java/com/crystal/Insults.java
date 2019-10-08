package com.crystal;

import java.util.Arrays;
import java.util.List;


public class Insults {
    /**
     * This class has lists of insults of varying severity, insults should be effective against man and wizards,
     * but not against monsters. Weak insult makes opponent laugh and improves health.
     */
    static int severityOfInsult;
    // Childish insults that a child would say.
    static List<String> weakInsults = Arrays.asList(
            "You're a poo!", "You're mean.",
            "If I had a face like yours, I'd sue my parents.",
            "Every time you talk I hear that sound that plays when Pacman dies.",
            "I don't know what makes you so stupid, but it really works.",
            "All right, I’ll confess… I confess you’re a bigger idiot than I thought you were!",
            "Please shut your mouth when you’re talking to me."
    );
    // Mean but keep it pg13.
    static List<String> meanInsults = Arrays.asList(
            "Is that your face or your ass?",
            "Do you want me to call your mom to pick you up before you get hurt?",
            "If I ever said anything to offend you, it was purely intentional.",
            "I'm really jealous of everyone that hasn't met you!",
            "The best part of you rolled down your mom's leg!",
            "If I wanted to kill myself I'd climb your ego and jump to your IQ!",
            "If you had any more tawdry quirks, you could open up a Tawdry Quirk Shop.",
            "Why don't you slip into something more comfortable... like a coma.",
            "Some babies were dropped on their heads but you were clearly thrown at a wall!",
            "They say opposites attract. I hope you meet someone who is good-looking, intelligent, and cultured."
    );
    static List<String> awesomeInsults = Arrays.asList("Your father smells like elderberries and your mother is related to hamsters.",
            "Thou art a boil, a plague sore, an embossed carbuncle in my corrupted blood.",
            "Villain, I have done thy mother!",
            "You obtuse piece of flotsam!",
            "You're a stuck up, half witted, scruffy looking nerf herder!",
            "Do hurry up. A hamster with a blunt penknife would do it quicker.");
    ;

    // methods
// prints insult and returns severityOfInsult
    public static int sayInsult() {
        severityOfInsult = (int) (Math.random() * 3);
        System.out.println(pickInsult(severityOfInsult));
        return severityOfInsult;
    }

    // picks the insult randomly from list based on severity
    public static String pickInsult(int severityOfInsult) {

        switch (severityOfInsult) {
            case 0:
                return weakInsults.get((int) (Math.random() * weakInsults.size()-1));
            case 1:
                return meanInsults.get((int) (Math.random() * weakInsults.size()-1));
            case 2:
                return awesomeInsults.get((int) (Math.random() * weakInsults.size()-1));
        }
        return "No insult found.";
    }
}

/* 
Note from Steve, who wrote a simpler version of the insults class and added many insults to the file.
---
I am a complete beginner but wanted to help. I don't know if I have the skill to implement insults into manfight, 
but I can definitely add insults. I'm not sure if this is the best way to do this, but I think a string array would probably 
work best. 
My plan is to use an array and the random class from math to generate a random number which will be used to retrieve the insult 
stored in that array. 
--Steve T (Selsec). */