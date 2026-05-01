public class window {
    String room;


    /**
     * Constructor for room
     * @param room room where window is located
     */
    public window(String room){
        this.room = room;
    }


    /**
     * Allows the user to open the window when they choose this escape route. Option A lets gregor jump out of the window, option B leads to a discovery when he acknowledges the itch on his back.
     */
    public void open(){ 
        System.out.println("You crawl up the wall to the windowsill and push the window open with your nose. You perch yourself on the windowsill and prepare to leap out.\n" + //
                        "\n" + //
                        "CHOOSE YOUR NEXT MOVE:\n" + //
                        "A: Jump\n" + //
                        "B: Hey, my back itches!");
    }

    /**
     * Kills the user when they choose to jump out the window
     */
    public void jumpOut(){
        System.out.println("You take a deep breath and push yourself out the window. You plummet to your death.\n" + //
                        "\n" + //
                        "YOU HAVE DIED.\n" + //
                        "\n" + //
                        "THE END.");
    }

}
