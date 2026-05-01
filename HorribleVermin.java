public class HorribleVermin extends person{
    // Attributes
    String job; //Occupation of vermin

    /**
     * Constructor for HorribleVermin
     * @param name name of vermin
     * @param job job title of vermin
     */
    public HorribleVermin(String name, int age, String relationship, String job){
        super(name, age, relationship);
        this.job = job;
    }


    /**
     * Gregor goes back to sleep, causing him to miss his first meeting and his boss to show up at his home, then prompts the user to select their next move. Option A lets gregor call for help, option B lets him quit the game.
     */
    public void goToSleep(){
        System.out.println("You doze off, drifting in and out of nightmares. You wake up again, jolted out of slumber by horrible visions. Again you look down to find that you are still in the form of a horrible vermin - this is a nightmare you cannot escape! The time is now 9:30 - you've already missed your morning meeting! You hear voices in the living room... \n" + //
                        "\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "\n" + //
                        "A: Call for help!\n" + //
                        "B: Give up");
    }

    /**
     * Gregor calls for help, alerting his sister Grete, then prompts the user to select their next move. Option A lets gregor answer her, option B lets gregor get the door.
     */
    public void callForHelp(){
        System.out.println("You try to speak but all that comes out of your mouth is a horrible hissing sound.\n" + //
                        "The sound startles your sister Grete. \n" + //
                        "\"Gregor! Is that you?I thought you'd left for work already!\"\n" + //
                        " She tries the doorknob but it's locked. \n" + //
                        "\"Gregor, open the door!\"\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "\n" + //
                        "A: Answer her!\n" + //
                        "B: Get out of bed to get the door");
    }

    /**
     * Gregor answers Grete, then prompts the user to choose their next move. Option A lets Gregor stay quiet, option B lets him get the door.
     */
    public void answerGrete(){
        System.out.println("Again, the sound that leaves your mouth is nothing but a horrible hissing. Clearing your throat, you try to speak again. This time, the words form in your mouth, but the voice that speaks them is rough and inhuman.\n" + //
                        "A knock at the far end of the hallway.\n" + //
                        "\"Don't worry Grete, I'm okay! I just need to get out of bed.\"\n" + //
                        "The unfamiliar voice gets the attention of your father, who begins rattling the doorknob.\n" + //
                        "\"What's going on in there? Gregor, the chief clerk is here! He wants to know why you haven't caught the earlier train.\"\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "A: Stay quiet\n" + //
                        "B: Get the door");
    }

    /**
     * Gregor answers the door for his guests, then prompts the user to choose their next move. Option A lets gregor crawl up the doorframe to turn the doorknob, option B lets him knock the door down.
     */
    public void getDoor(){
        System.out.println("You rock back and forth until you can get enough momentum to roll out of bed. You hit the ground with a bang, startling the visitors outside your door.\n" + //
                        "\"Gregor, what was that?\" Grete asks.\n" + //
                        "You hear the chief clerk: \"Mr. Samsa?\"\n" + //
                        "moving your many little legs, you scramble to the door, but your body lays close to the ground, too short in stature to reach the handle.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "\n" + //
                        "A: Crawl up the door frame!\n" + //
                        "B: Try to knock the door down!");
    }

    /**
     * Gregor runs away, and the user is prompted to choose their destination. Option B lets Gregor run to the stairwell, option B lets Gregor run to his parent's room, and option c lets Gregor run to his sister Grete's room.
     */
    public void runAway(){
        System.out.println("Where will you go?\n" + //
                        "\n" + //
                        "A: The stairwell\n" + //
                        "B: Your parents' room\n" + //
                        "C: Grete's room");
    }

    /**
     * Gregor gets out of bed instead of staying asleep, then prompts the user to select their next move. Option A allows gregor to move his legs, option B lets him rock back and forth.
     */
    public void getUp(){
        System.out.println("You try to move your core you bring your head off its pillow, but you are not used to the strange body that you now inhabit. \n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "A: Move legs\n" + //
                        "B: Rock back and forth");
    }

    /**
     * Gregor rocks back and forth in order to get out of bed, then the user is prompted to select their next move. Option A lets Gregor open the door, option B lets him open the window.
     */
    public void rock(){
        System.out.println("Rocking back and forth, you finally get enough momentum to swing out of bed. You land on the ground with a plop. Glancing in the mirror, you see the full image monster you have become. You look like a beetle of some kind, but as tall lengthwise as a fully grown man. You gasp, but the sound that leaves your mouth sounds more like a hiss. Surely anyone who sees you in this condition would kill you on the spot! You think your family is still asleep.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "\n" + //
                        "A: Open the door\n" + //
                        "B: Open the window");
    }

    /**
     * Kills the user when the choose to walk to work. Ends the story.
     */
    public void walkToWork(){
        System.out.println("You stupid idiot. Did you think you could survive these streets as the horrible vermin you are? A civilian spotted you and ran you over with their car. \n" + //
                        "\n" + //
                        "YOU HAVE DIED.\n");
    }


    /**
     * Allows the user to explain himself when the chief clerk arrives at his home. Ends the story.
     */
    public void explain(){
        System.out.println("\"Mr. Clerk, you must know that I am unwell. In my years of work with the bank I have never once been late. Look at the horrible form I have become! You cannot fault me for such a thing! Do you see how I care for my family. Please sir, this job is all that I have!\"\n" + //
                        "\n" + //
                        "The chief clerk ponders your speech. \"You are right! I mustn't fault you for such a misfortune. You are forgiven - take the day off! You know what, I'll even recommend you for a raise!\"\n" + //
                        "\n" + //
                        "SUCCESS! \n" + //
                        "\n" + //
                        "THE END");
    }

    /**
     * Fires the user from their job when they refuse to answer the chief clerk. Ends the story.
     */
    public void stayQuiet(){
        System.out.println("\"That's it, you're fired!\" yells the chief clerk from behind the door. Footsteps stomp into the distance and the apartment door slams.\n" + //
                        "\n" + //
                        "Did you let your horrible vermin self consume you and forget that work is your only purpose in this miserable life? YOU HAVE FAILED.\n" + //
                        "\n" + //
                        "THE END.");
    }

    public static void main(String[] args) {
        HorribleVermin gregor = new HorribleVermin("Gregor Samsa", 27, "self", "Traveling salesman");
        gregor.walkToWork();
    }



}
