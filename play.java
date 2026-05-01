import java.util.Scanner;

public class play {

    /**
     * Alerts the user when they have typed something that was not an option
     */
    public void wrongChoice(){
        System.out.println("That wasn't an option! You only have the illusion of free will in this nightmare.");
    }

    public static void main(String[] args) {

        play metamorphosis = new play();

        // Determines when game ends
        boolean stillPlaying = true;

        // New HorribleVermin object, Gregor is the protagonsist of our game
        HorribleVermin gregor = new HorribleVermin("Gregor Samsa", 27, "self", "Traveling salesman at Bank");
        wings gregorWings = new wings();

        // Takes input from the user.
        Scanner userInput = new Scanner(System.in);


        // Stores user's responses
        String userResponse = "";

        // Greets the user
        System.out.println("******************");
        System.out.println("Good Morning Gregor Samsa. You have entered THE METAMORPHOSIS...");
        System.out.println("You are a traveling salesman at a bank, endebted to your employer by your father's debts. You work day and night, sometimes for days at a time without coming home and are the sole breadwinner for your family of four, who depends on you entirely for their sustinence.");
        System.out.println("******************");
        
        System.out.println("Type GIVE UP to escape this horrible nightmare. Type anything else to enter the game.");

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            
            userResponse = userInput.nextLine().toUpperCase();
            if (userResponse.equals("GIVE UP")){ //give up
                System.out.println("Coward! Giving up on this mission is akin to letting you and your family die.\n" + //
                                        "You have failed!\n" + //
                                        "THE END.");
                stillPlaying = false;
            } else{ //user enters anything else
                System.out.println("You awake one morning from troubled dreams to discover that you have been transformed into a horrible vermin. You lift your head to peer down at your body to discover that you are no longer human at all, as your eyes lie upon your newly brown belly, slightly domed and divided by arches into stiff sections. Your many tiny legs wave around helplessly in the air as your bedding slips, hardly able to cover your body.\" \n" + //
                                        "\n" + //
                                        "\"What has happened to me?,\" you think to yourself. Peering to look at the alarm clock, you realize that you have overslept! The time is now 6:30 -- you must be at work at 9:00.\n" + //
                                        "\n" + //
                                        "CHOOSE YOUR NEXT MOVE: \n" + //
                                        "\n" + //
                                        "A: Go back to sleep\n" + //
                                        "B: Get out of bed");

                userResponse = userInput.nextLine().toUpperCase(); //takes next user response
                if(userResponse.equals("A")){ //go back to sleep
                    gregor.goToSleep();
                
                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response
                    if (userResponse.equals("A")){ //call for help

                        gregor.callForHelp();
                        userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                        if(userResponse.equals("A")){ //answer Grete's knock at the door
                            gregor.answerGrete();
                            userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                            if(userResponse.equals("A")){ //stay quiet - don't answer grete
                                gregor.stayQuiet();
                                stillPlaying = false; //end of game - lose.

                            } else if(userResponse.equals("B")){ // choose to get door
                                gregor.getDoor();
                                userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                door bedroomDoor = new door("Gregor's room");
                                if(userResponse.equals("A")){ //crawl up door to reach doorknob
                                    
                                    bedroomDoor.crawlUpDoor();
                                    System.out.println("Your family stands in awe around the door, gawking at your horrible form. Your father runs away in fear towards the kitchen and grabs an apple, wielding it as a weapon.\n" + //
                                                                                "\n" + //
                                                                                "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                                "\n" + //
                                                                                "A: Charge at him!\n" + //
                                                                                "B: Run away");
                                        
                                        userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                        if(userResponse.equals("A")){ // charge at father
                                            gregor.chargeDad();
                                            stillPlaying = false; //end of game - lose.

                                        } else if(userResponse.equals("B")){ //run away
                                            gregor.runAway();
                                            userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                            if(userResponse.equals("A")){ //enter stairwell
                                                room stairwell = new room("Exit Stairs", false);
                                                stairwell.enter();

                                                System.out.println("Ha! The chief clerk left the door cracked open, allowing you to flee to the stairwell, where you run down the stairs and into the open air on the streets.\n" + //
                                                                                                        "\n" + //
                                                                                                        "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                                                        "\n" + //
                                                                                                        "A: Walk to work\n" + //
                                                                                                        "B: Hey, my back itches! ");
                                                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                                    if(userResponse.equals("A")){
                                                        gregor.walkToWork();
                                                        stillPlaying = false; //end of game - lose.

                                                    } if(userResponse.equals("B")){ //bug, ends game but also selects parentsRoom
                                                        gregorWings.fly();
                                                        boss president = new boss("Steve", 57, "big boss", "president at Bank" );
                                                        president.forgive();
                                                        stillPlaying = false; //ends game - win!

                                                    } else{ //invalid input
                                                        metamorphosis.wrongChoice();
                                                    }
                                            } else if(userResponse.equals("B")){ // enter parent's room
                                                room parentsRoom = new room("Mother and Father's room", true);
                                                parentsRoom.enter();

                                                System.out.println("A wise choice, but now your only exit is the window. \n" + //
                                                                                                        "\n" + //
                                                                                                        "You crawl up the wall to the windowsill and push the window open with your nose. You perch yourself on the windowsill and prepare to leap out.\n" + //
                                                                                                        "\n" + //
                                                                                                        "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                                                        "A: Jump\n" + //
                                                                                                        "B: Hey, my back itches!");
                                                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                                    if(userResponse.equals("A")){
                                                        window parentWindow = new window("Mother and Father's room");
                                                        parentWindow.jumpOut();
                                                        stillPlaying = false; // ends game - lose.

                                                    } if(userResponse.equals("B")){
                                                        gregorWings.fly(); 
                                                        //ends game - win!

                                                    } else{ //invalid response
                                                        metamorphosis.wrongChoice();
                                                    }

                                            } else if(userResponse.equals("C")){ //enter Grete's room
                                                room sistersRoom = new room("Grete's room", false);
                                                sistersRoom.enter();

                                                System.out.println("You are cornered! There is no window nor another exit. Your father follows you into the room and throws the apple at you. The apple lodges into your side and a pain shoots through your body. \n" + //
                                                                                                        "\n" + //
                                                                                                        "YOU HAVE DIED.\n" + //
                                                                                                        "\n" + //
                                                                                                        "THE END.");
                                                stillPlaying = false; //ends the game
                            
                                            } else{ //invalid response
                                                metamorphosis.wrongChoice();
                                            }                                     

                                        } else{ //invalid response
                                            metamorphosis.wrongChoice();
                                        }
                                } else if (userResponse.equals("B")){ //knock down door
                                    bedroomDoor.knockDown();

                                } else{
                                    metamorphosis.wrongChoice();
                                }


                            } else{ //invalid response
                                metamorphosis.wrongChoice();
                            }

                        } else if(userResponse.equals("B")){
                            gregor.getDoor();
                        } else{ //invalid response
                            metamorphosis.wrongChoice();
                        }
                    
                    } else if (userResponse.equals("B")){ //complete paths
                        System.out.println("Coward! Giving up on this mission is akin to letting you and your family die.\n" + //
                                        "You have failed!\n" + //
                                        "THE END.");
                        stillPlaying = false;
                    } else{
                        metamorphosis.wrongChoice();
                    }
                    
                } else if(userResponse.equals("B")){ //get out of bed at first chance
                    gregor.getUp();

                } else{ //invalid response
                    metamorphosis.wrongChoice(); //potential bug here: goes back to beginning after 
                }
            }


        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // // Once you exit the loop, you may need to deal with various possible stopping conditions
        // if (userResponse.equals("WIN")) {
        //     System.out.println("Yay, you won!");
        // } else { // userResponse.equals("LOSE")
        //     System.out.println("Better luck next time.");
        // }

    }

}

