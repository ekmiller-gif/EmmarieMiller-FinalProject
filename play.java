import java.util.Scanner;

public class play {

    public void enter(room location){
        System.out.print("You have entered " + location.name);
    }

    public void pathA(){
        //already late to work
    }

    public void pathB(){
        //timer countdown to get to work on time
    }

    public static void main(String[] args) {
        
        boolean stillPlaying = true;

        // Takes input from the user.
        Scanner userInput = new Scanner(System.in);

        // Stores user's responses
        String userResponse = "";

        // Greets the user
        System.out.println("******************");
        System.out.println("Good Morning Gregor Samsa. You have entered THE METAMORPHOSIS...");
        System.out.println("You are a traveling salesman at a bank, endebted to your employer by your father's debts. You work day and night, sometimes for days at a time without coming home and are the sole breadwinner for your family of four, who depends on you entirely for their sustinence.");
        System.out.println("******************");
        
        // Instructions to user
        System.out.println("Type GIVE UP to escape this horrible nightmare. Type anything else to enter the game.");

        //Introductory dialogue
        System.out.println("You awake one morning from troubled dreams to discover that you have been transformed into a"
                            + " horrible vermin. You lift your head to peer down at your body to discover that you are no"
                            + " longer human at all, as your eyes lay upon your newly brown belly, slightly domed and divided"
                            + " by arches into stiff sections. Your many tiny legs wave around helplessly in the air as you bedding"
                            + " slips, hardly able to cover your body.");

        System.out.println("What has happened to me?, you think to yourself. Peering to look at the alarm clock, you realize that you have overslept!");

        // I would like to have a counter of sorts in the game to measure the time elapsed (like maybe each user intput equals 10 minutes or something), and if a certain amount of time elapses, it's too late to get to work and the game ends.

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            System.out.println("Choose your next move:");
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("GIVE UP")) {
                stillPlaying = false;
            }
        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }

    }

}

