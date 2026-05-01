public class apple {

    /**
     * Kills the user when he is cornered, and as a result is hit by his father with the apple in his side.
     */
   public void woundSide(){
    System.out.print("You are cornered! There is no window nor another exit. Your father follows you into the room and throws the apple at you. The apple lodges into your side and a pain shoots through your body. \n \n YOU HAVE DIED. \n \n THE END.");
   }

   /**
    * Kills the vermin when the user chooses to charge at his father, who weilds the apple.
    */
   public void woundHead(){
        System.out.print("You run full speed towards him, but he throws the apple directly towards your head, delivering a fatal blow. \n \n YOU HAVE DIED. \n \n THE END.");
   }
    

   public static void main(String[] args) {
       apple redDelicious = new apple();
        //redDelicious.woundSide();
        redDelicious.woundHead();
   }
}


