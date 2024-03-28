package MidTerm.Q3;

import java.util.ArrayList;
import java.util.List;

public class StreetSign {
    private String message;
    private int lineWidth;

    public StreetSign(String message, int lineWidth) {

        this.message = message;
        this.lineWidth = lineWidth;
    }

    public void displayMessage() {
        List<String> lines = getLines();
        //TODO: ADD IMPLEMENTAION THAT PRINTS THE LINES
        System.out.println(lines);
    }

    public List<String> getLines() {
        List<String> lines = new ArrayList<>();
        //TODO: ADD IMPLEMENTATION THAT SPLITS THE MESSAGE INTO LINES
        for (int i = 0; i < message.length(); i += lineWidth){
            //Couldn't figure out how to do this but I know I need a for loop just could
            // not figure out the logic of said for loop
        }

        //HINT: USE THE INSTANCE VARIABLE lineWidth TO DETERMINE THE MAXIMUM NUMBER OF CHARACTERS PER LINE
        //HINT: USE THE INSTANCE VARIABLE message TO GET THE MESSAGE
        //HINT: THE RETURNED LIST SHOULD CONTAIN THE LINES OF THE MESSAGE
        //HINT: There are many ways to do this, but one way is to use a while loop to iterate over the message
        //HINT. String.substring() and String.indexOf() are useful methods

        return lines;
    }

    public static void main(String[] args) {
        StreetSign sign = new StreetSign("Heavy Traffic on 41", 10);
        sign.displayMessage();

        // Additional test case
        StreetSign q1 = new StreetSign("Good Times Ahead!", 50);
        q1.displayMessage();
    }
}

