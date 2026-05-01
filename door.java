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
     * Knocks down the door when the user selects this choice
     */
    public void knockDown(){
        System.out.println("You walk backwards, stumbling and knocking down your desk chair as you scramble to the other end of the room. Full speed ahead, you slam your hard-shelled body into the door. A crack in the wood! Backing up again, you give it another blow, and the door falls down. The loud sound awakens your father, who appears in the doorway, wielding an apple as a weapon. He screams when he sees the vermin in the doorway.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "A: Charge at him!\n" + //
                        "B: Run away");
    }

    /**
     * Gives the user options for how to open the door when they choose to get the door
     */
    public void open(){
        System.out.println("Moving your many little legs, you scramble to the door, but your body lays close to the ground, too short in stature to reach the handle.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "\n" + //
                        "A: Crawl up the doorframe!\n" + //
                        "B: Try to knock down the door!");
    }

}
