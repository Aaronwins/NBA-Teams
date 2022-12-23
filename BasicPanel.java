import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 * Write a description of class BasicPanel here.
 * 200*100 size 
 * @author Aaron Amalraj
 * @version 12.13.2022
 */
import java.awt.Dimension;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.BoxLayout;
public class BasicPanel extends JPanel
{
    // instance variables - replace the example below with your own
    //private BasicPanel panelObject;
    private JLabel labelObject;
    private JLabel messageObject;
    private Dimension dimensions;
    private Color colorObject;
    private Color customColor;
    //private JLabel labelObject2;
    private BoxLayout layoutObject;
    /**
     * Constructor for objects of class BasicPanel
     */
    public BasicPanel()
    {
        // initialise instance variables
        super();
        labelObject = new JLabel("Hello NBA Fans");
        messageObject = new JLabel("How are you today?");
        //labelObject2 = new JLabel(LocalDate.now());
        BoxLayout layoutObject = new BoxLayout(this,BoxLayout.Y_AXIS); 
        add(labelObject); //don't need an object just add it 
        add(messageObject);
        Dimension dimensions = new Dimension(500, 100);
        setPreferredSize(dimensions);
        colorObject = Color.YELLOW; //to represent golden state warriors
        setBackground(colorObject); //color 
        setLayout(layoutObject); //box Layout method
    }

}

