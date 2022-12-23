import javax.swing.JFrame;
/**
 * Class to createa JFrame
 * 
 * @author la
 * @version 12.11.22
 */
public class BasicFrame{
    // field declaration
    private JFrame frameObject;
    //private LocalDate today;
    
    /**
     * Constructor
     */
    public BasicFrame(){
        frameObject = new JFrame("Welcome to the NBA League and Team Program! ");
        frameObject.add(new BasicPanel());
        frameObject.pack(); //tell the frame here it is 
        frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //tells what to do when frame is closed, exits objects
        frameObject.setLocationRelativeTo(null); //tells java where to place frame on screen, null defaults to center of screen
        frameObject.setVisible(true); //this method should always be last
    }
}
