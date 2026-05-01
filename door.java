public class door {
    String room;


    /**
     * Constructor for door
     * @param room room to which door leads 
     */
    public door(String room){
        this.room = room;
    }

    

    /**
     * Gives the user options for how to open the door when they choose to get the door. This command is only available in the game path where no one is yet awake. Option A lets Gregor crawl up the doorframe to torn the handle with his mouth, and option B lets him knock down the door.
     */
    public void open(){
        System.out.println("Moving your many little legs, you scramble to the door, but your body lays close to the ground, too short in stature to reach the handle.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "\n" + //
                        "A: Crawl up the doorframe!\n" + //
                        "B: Try to knock down the door!");
    }

    /**
     * Knocks down the door when the user selects this choice, which awakens Gregor's father,then prompts the user to select their next move. Option A lets Gregor charge at his father, option B lets gregor run away.
     */
    public void knockDown(){
        System.out.println("You walk backwards, stumbling and knocking down your desk chair as you scramble to the other end of the room. Full speed ahead, you slam your hard-shelled body into the door. A crack in the wood! Backing up again, you give it another blow, and the door falls down. The loud sound awakens your father, who appears in the doorway, wielding an apple as a weapon. He screams when he sees the vermin in the doorway.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "A: Charge at him!\n" + //
                        "B: Run away");
    }

    /**
     * Allows the user to crawl up the window in Gregor's room
     */
    public void crawlUpDoor(){
        System.out.println("You place your very front feet on the wall in front of you and begin to crawl up the doorframe. You are shocked at how natural and easy it is!  Your little feet feel as if they can stick to the wall and practically defy gravity! Fully perched on the doorframe, you take the doorknob in your mouth and turn until the door swings open and you fall down.");
    }



}
