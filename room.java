public class room {
    String name;
    boolean hasWindow;

    /**
     * Constructor for room
     * @param name name of room
     * @param hasWindow true/false if the room has a window
     */
    public room(String name, boolean hasWindow){
        this.name = name;
        this.hasWindow = hasWindow;
    }

    /**
     * method prints message telling the user what room they have chosen to enter
     */
    public void enter(){
        System.err.println("You have entered" + this.name);
    }

}
