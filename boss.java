public class boss extends person {
    
    String name;
    String position;

    /**
     * Constructor
     * @param name name of boss figure
     * @param position position in the company
     */
    public boss(String name, String position){
        name = this.name;
        position = this.position;
    }

    /**
     * The user is fired from their job when they choose to bite the chief clerk.
     */
    public void fire(){
        System.out.println("You let the animalistic anger consume you. Lurching forward, you chomp on the leg of the chief clerk.\n" + //
                        "\"What the hell?!\" he screams. \"Mr. Samsa, you are fired!\"\n" + //
                        "\n" + //
                        "Did you let your horrible vermin self consume you and forget that work is your only purpose in this miserable life? YOU HAVE FAILED.\n" + //
                        "\n" + //
                        "THE END.");
    }

    /**
     * The user is forgiven of his debts and promoted to president of the company when he arrives at work and gives a speech to the president.
     */
    public void forgive(){
        System.out.println("You touch down, march in the front door and into the President's office, ignoring the shrieks and gasps around you. \"My name is Gregor Samsa, and I am a horrible vermin! But I am a human being, and I refuse to be treated as less than that any longer! I have worked for this company for years paying of a debt that is not mine, and I refuse to me mistreated any longer.\"\n" + //
                        "\n" + //
                        "The president stands from his desk. \"Mr. Samsa, you are right. Not only are your debts forgiven, but I am promoting you to president of the company! I resign immediately.\n" + //
                        "\n" + //
                        "YOU WIN!");
    }

    public static void main(String[] args) {
        boss ChiefClerk = new boss("Jeremy","Chief Clerk");
        ChiefClerk.fire();
        boss president = new boss("Steve", "President of the Company");
        president.forgive();
    }
}
