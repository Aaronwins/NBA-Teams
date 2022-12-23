import java.util.Scanner;

/**
 * Description of class Players: class for NBA Players
 * @author Aaron Amalraj
 * @version 12.16.22
 */
public class Players extends Staff
{
    // instance variables
    String position; //position in basketball for the player
    double ppg; //points per game averaged
    String decision;
    /**
     * Constructor for objects of class Players
     */
    public Players(double height, double weight, String name, int yearsExperience,String position,double ppg)
    {
        this.height = height; 
        this.weight = weight; 
        this.name = name; 
        this.yearsExperience = yearsExperience; 
        this.position = position; 
        this.ppg = ppg;
        decision = "yes"; //defaults to yes unless changed in practice method
    }
    /**
     * Setter methods 
     */
    /**
     * Method to set the position of the player 
     * @param String for the position of the player to be entered
     */
    public void setPosition(String position){
        this.position = position;
    }
    /**
     * Method to set the points averaged per game by the player
     * @param takes in an int for points averaged
     */
    public void setPpg(double ppg){
        this.ppg = ppg;
    }   
    /**
     * Override the abstract toString() method in Staff Class
     * Use generalPrintString to avoid repetition
     * @return returns the player String with information about the player
     */
    @Override
    public String toString()
    {
        String playerString = " The name of the player is: " 
         + name + printGeneral() + "status on availabilty next practice: " + decision + 
         " the position played by the player is " + position + 
         " And points averaged per game is " + ppg;
         return playerString;
    }
    
    /**
     * Override the practice method
     * decision is the decision of whether the player will go to practice
     * For example, yes, no or maybe
     */
    public void practice(){
        Scanner keybd = new Scanner(System.in);
        System.out.println("As a player on the team please let us know whether you'd be able to make the next scheduled practice");
        decision = keybd.nextLine();
        this.decision = decision;
    }
}
