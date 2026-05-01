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
     * Kills the user when the choose to walk to work
     */
    public void walkToWork(){
        System.out.println("You stupid idiot. Did you think you could survive these streets as the horrible vermin you are? A civilian spotted you and ran you over with their car. \n" + //
                        "\n" + //
                        "YOU HAVE DIED.\n");
    }


    /**
     * Allows the user to explain himself when the chief clerk arrives at his home.
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
     * Fires the user from their job when they refuse to answer the chief clerk.
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
