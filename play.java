import java.util.Scanner;

public class play {

    /**
     * Alerts the user when they have typed something that was not an option
     */
    public void wrongChoice(){
        System.out.println("That wasn't an option! You only have the illusion of free will in this nightmare.");
    }



    public static void main(String[] args) {
        //our game
        play metamorphosis = new play();

        // Determines when game ends
        boolean stillPlaying = true;

        // New HorribleVermin object, Gregor is the protagonsist of our game
        HorribleVermin gregor = new HorribleVermin("Gregor Samsa", 27, "self", "Traveling salesman at Bank");
        //Gregor's wings are an object that may be discovered later, but the variable is only read under certain story paths
        wings gregorWings = new wings();

        door bedroomDoor = new door("Gregor's room");

        // Takes input from the user.
        Scanner userInput = new Scanner(System.in);


        // Stores user's responses
        String userResponse = "";

        // Greets the user and takes first input
        System.out.println("******************");
        System.out.println("Good Morning Gregor Samsa. You have entered THE METAMORPHOSIS...");
        System.out.println("You are a traveling salesman at a bank, endebted to your employer by your father's debts. You work day and night, sometimes for days at a time without coming home and are the sole breadwinner for your family of four, who depends on you entirely for their sustinence.");
        System.out.println("******************");
        
        System.out.println("Type GIVE UP to escape this horrible nightmare. Type anything else to enter the game.");

        do {
            userResponse = userInput.nextLine().toUpperCase();
            if (userResponse.equals("GIVE UP")){ //immediately give up
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
                                            apple redDelicious = new apple();
                                            redDelicious.woundHead();
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

                                                    } else if(userResponse.equals("B")){ 
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

                                                apple grannySmith = new apple();
                                                grannySmith.woundSide();
                                                stillPlaying = false; //ends the game - lose.
                            
                                            } else{ //invalid response
                                                metamorphosis.wrongChoice();
                                            }                                     

                                        } else{ //invalid response
                                            metamorphosis.wrongChoice();
                                        }
                                } else if (userResponse.equals("B")){ //knock down door 
                                    System.out.println("You walk backwards, stumbling and knocking down your desk chair as you scramble to the other end of the room. Full speed ahead, you slam your hard-shelled body into the door. A crack in the wood! Shrieks from your family and the chief clerk are heard from the other side. Backing up again, you give it another blow, and the door falls down. Your father and mother also appear in the doorway. \n" + //
                                                                                "As the horrible creature that you have become appears to your visitors, looks of horror fall upon you.\n" + //
                                                                                "\n" + //
                                                                                "\"It's me! It's just me, Gregor!\" you utter in your newly gruff voice.\n" + //
                                                                                "\"Gregor?\" your sister says with tenderness, but still tinged with disgust.\n" + //
                                                                                "\"Mr. Samsa, what is the meaning of this? You will surely be fired if this is not resolved!\" says the chief clerk.\n" + //
                                                                                "\n" + //
                                                                                "The adrenaline kicks in and you begin to think of the dreary thankless life you've lived, working day in, day out to support your family, who has never once tried to pitch in, all because of your father's debt, and to appease your boss, who now threatens to fire you for being late once. Once! In your entire career! And now they all look at you with disgust, though you have done nothing. \n" + //
                                                                                "\n" + //
                                                                                "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                                "A: Bite your bastard father!\n" + //
                                                                                "B: Bite your bastard boss!\n" + //
                                                                                "C: Explain!");
                                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response
                                    boss chiefClerk = new boss("Jared", 37, "boss", "Chief clerk at Bank");

                                    if(userResponse.equals("A")){ //Bite your father
                                        userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                        if(userResponse.equals("A")){
                                            System.out.println("You let your animalistic anger consume you. Lurching forward, you chomp on your father's leg. Screaming, he runs away towards the kitchen and grabs an apple, which he weilds as a weapon.\n" + //
                                                                                                "\n" + //
                                                                                                "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                                                "\n" + //
                                                                                                "A: Charge at him! \n" + //
                                                                                                "B: Run away");
                                            userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                            if(userResponse.equals("A")){ //charge at him
                                                apple gala = new apple();
                                                gala.woundHead();

                                                stillPlaying = false; //ends game - lose.
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

                                                        } if(userResponse.equals("B")){ 
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

                                                    apple pinkLady = new apple();
                                                    pinkLady.woundSide();

                                                    stillPlaying = false; //ends the game
                                
                                                } else{ //invalid response
                                                    metamorphosis.wrongChoice();
                                                }

                                            } else{ //invalid response
                                                metamorphosis.wrongChoice();
                                            }

                                        } else if(userResponse.equals("B")){

                                        } else{ //invalid response
                                            metamorphosis.wrongChoice();
                                        }

                                    } else if(userResponse.equals("B")){ //Bite your boss
                                        chiefClerk.fire();

                                        stillPlaying = false; //ends the game - lose.

                                    } else if(userResponse.equals("C")){ //Explain yourself!
                                        System.out.println("\"Mr. Clerk, you must know that I am unwell. In my years of work with the bank I have never once been late. Look at the horrible form I have become! You cannot fault me for such a thing! Do you see how I care for my family. Please sir, this job is all that I have!\"\n" + //
                                                                                        "\n" + //
                                                                                        "The chief clerk ponders your speech. \"You are right! I mustn't fault you for such a misfortune. You are forgiven - take the day off! You know what, I'll even recommend you for a raise!\"\n" + //
                                                                                        "\n" + //
                                                                                        "SUCCESS! \n" + //
                                                                                        "\n" + //
                                                                                        "THE END");

                                        stillPlaying = false; // ends the game - win!
                                    } else{
                                        metamorphosis.wrongChoice();
                                    }

                                } else{
                                    metamorphosis.wrongChoice();
                                }


                            } else { //invalid response
                                metamorphosis.wrongChoice();
                            }

                        } else if(userResponse.equals("B")){ //Should be stay quiet
                            gregor.getDoor();
                            userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                
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
                                            apple honeycrisp = new apple(); 
                                            honeycrisp.woundHead();
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

                                                    } if(userResponse.equals("B")){ 
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

                                                apple pinkLady = new apple();
                                                pinkLady.woundSide();

                                                stillPlaying = false; //ends the game
                            
                                            } else{ //invalid response
                                                metamorphosis.wrongChoice();
                                            }                                     

                                        } else{ //invalid response
                                            metamorphosis.wrongChoice();
                                        }
                                } else if (userResponse.equals("B")){ //knock down door
                                    bedroomDoor.knockDown(); 
                                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                    if(userResponse.equals("A")){
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

                                                    } if(userResponse.equals("B")){ 
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

                                                apple grannySmith = new apple();
                                                grannySmith.woundSide();
                                                stillPlaying = false; //ends the game
                            
                                            } else{ //invalid response
                                                metamorphosis.wrongChoice();
                                            }                                     

                                    } else if(userResponse.equals("B")){ //charge at father
                                        apple crabApple = new apple();
                                        crabApple.woundHead();
                                    } else{
                                        metamorphosis.wrongChoice();
                                    }

                                } else{
                                    metamorphosis.wrongChoice();
                                }


                        } else{ //invalid response
                            metamorphosis.wrongChoice(); 
                        }
                    
                    } else if (userResponse.equals("B")){ // gives up after sleeping through start of shift
                        System.out.println("Coward! Giving up on this mission is akin to letting you and your family die.\n" + //
                                        "You have failed!\n" + //
                                        "THE END.");
                        stillPlaying = false; //ends game - lose.
                    } else{
                        metamorphosis.wrongChoice();
                    }
                    
                } else if(userResponse.equals("B")){ //get out of bed at first chance
                    gregor.getUp();
                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                    if(userResponse.equals("A")){ //move legs
                        legs gregorsLegs = new legs(); 
                        gregorsLegs.move();
                        userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                        if(userResponse.equals("A")){ //give up
                            System.out.println("Coward! Giving up on this mission is akin to letting you and your family die.\n" + //
                                                                "You have failed!\n" + //
                                                                "THE END.");
                        } else if(userResponse.equals("B")){ //rock back and forth
                            gregor.rock();

                            if(userResponse.equals("A")){ //open the door
                                bedroomDoor.open();
                                userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                if(userResponse.equals("A")){
                                    bedroomDoor.crawlUpDoor();
                                    System.out.println("ou bolt towards the stairwell, opening it the same way you did your bedroom door, and run down the stairs, exiting the building.\n" + //
                                                                            "\n" + //
                                                                            "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                            "\n" + //
                                                                            "A: Walk to work\n" + //
                                                                            "B: Hey, my back itches! ");
                                    
                                    userResponse = userInput.nextLine().toUpperCase(); //takes next user response
                                    if(userResponse.equals("A")){
                                        gregor.walkToWork();
                                        stillPlaying = false; //ends game - lose.
                                    } else if(userResponse.equals("B")){
                                        gregorWings.fly();
                                        System.out.println("You march into work on time and find a place at the conference table for your morning meeting. Success! You are a model employee, and the very first horrible vermin to have a position at the bank.");
                                        stillPlaying = false; //ends game - win!
                                    }
                                }else if(userResponse.equals("B")){ //knock down door
                                    bedroomDoor.knockDown(); 
                                    apple fuji = new apple();
                                    fuji.woundHead();
                                    stillPlaying = false; //ends game - lose.
                                } else{ //invalid response
                                    metamorphosis.wrongChoice(); 
                                }
                            } else if(userResponse.equals("B")){ //open window
                                window gregorsWindow = new window("Gregor's room");
                                gregorsWindow.open();
                                userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                                if(userResponse.equals("A")){
                                    gregorsWindow.jumpOut();
                                    stillPlaying = false; //ends game - lose.
                                } else if(userResponse.equals("B")){
                                    gregorWings.fly();
                                    System.out.println("You march into work on time and find a place at the conference table for your morning meeting. Success! You are a model employee, and the very first horrible vermin to have a position at the bank.");
                                    stillPlaying = false; //ends game - win!
                                } else{
                                    metamorphosis.wrongChoice();
                                }

                            } else{ //invalid response
                                metamorphosis.wrongChoice();
                            }
                        }

                    } else if(userResponse.equals("B")) { //rock back and forth
                        gregor.rock();
                        userResponse = userInput.nextLine().toUpperCase();

                        if(userResponse.equals("A")){ //open the door
                            bedroomDoor.open();
                            userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                            if(userResponse.equals("A")){
                                bedroomDoor.crawlUpDoor();
                                System.out.println("ou bolt towards the stairwell, opening it the same way you did your bedroom door, and run down the stairs, exiting the building.\n" + //
                                                                        "\n" + //
                                                                        "CHOOSE YOUR NEXT MOVE:\n" + //
                                                                        "\n" + //
                                                                        "A: Walk to work\n" + //
                                                                        "B: Hey, my back itches! ");
                                
                                userResponse = userInput.nextLine().toUpperCase(); //takes next user response
                                if(userResponse.equals("A")){
                                    gregor.walkToWork();
                                    stillPlaying = false; //ends game - lose.
                                } else if(userResponse.equals("B")){
                                    gregorWings.fly();
                                    System.out.println("You march into work on time and find a place at the conference table for your morning meeting. Success! You are a model employee, and the very first horrible vermin to have a position at the bank.");
                                    stillPlaying = false; //ends game - win!
                                }
                            }else if(userResponse.equals("B")){ //knock down door
                                bedroomDoor.knockDown(); 
                                apple fuji = new apple();
                                fuji.woundHead();
                                stillPlaying = false; //ends game - lose.
                            } else{ //invalid response
                                metamorphosis.wrongChoice(); 
                            }
                        } else if(userResponse.equals("B")){ //open window
                            window gregorsWindow = new window("Gregor's room");
                            gregorsWindow.open();
                            userResponse = userInput.nextLine().toUpperCase(); //takes next user response

                            if(userResponse.equals("A")){
                                gregorsWindow.jumpOut();
                                stillPlaying = false; //ends game - lose.
                            } else if(userResponse.equals("B")){
                                gregorWings.fly();
                                System.out.println("You march into work on time and find a place at the conference table for your morning meeting. Success! You are a model employee, and the very first horrible vermin to have a position at the bank.");
                                stillPlaying = false; //ends game - win!
                            } else{
                                metamorphosis.wrongChoice();
                            }

                        }
                    } else{ //invalid response
                        metamorphosis.wrongChoice();
                    }

                } else{ //invalid response
                    metamorphosis.wrongChoice(); //bug with this command: goes back to beginning after 
                }
            }
        

        //Checks if the game is still ongoing
        } while (stillPlaying);

        // Tidy up
        userInput.close();

    }

}

