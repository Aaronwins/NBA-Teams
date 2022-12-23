import java.util.Scanner;
/**
 * Description of class Coaches: Subclass of abstract class 
 * Staff, contains more information about head coaches of the NBA
 * Including theirs wins and losses over their careers as a coach
 * @author Aaron Amalraj
 * @version 12.16.2022
 */
public class Coaches extends Staff
{
    // private instance variables
    private int wins; // total wins the coach has had in their career
    private int losses; //total losses the coach has had in their career
    private String practiceNextDateAndTime; //date and time of next practice set by coach
    /**
     * Constructor for objects of class Coaches
     */
    public Coaches(double height, double weight, String name, int yearsExperience, int wins, int losses)
    {
        this.height = height; 
        this.weight = weight; 
        this.name = name; 
        this.yearsExperience = yearsExperience; 
        this.wins = wins; 
        this.losses = losses;
        //this.practiceNextDateAndTime = ""; //defaults to empty unless changed by user 
    }
    /**
     * Additional Getter methods
     * This method is to getWins
     */
    public int getWins(){ 
        return wins;
    }
    /**
     * Method to getLosses
     */
    public int getLosses(){
        return losses;
    }   
    /**
     * Additional setter methods
     * This method is to set the wins
     */
    public void setWins(int wins){
        this.wins = wins;
    }
    /**
     * This method is to set the losses
     */
    public void setLosses(int losses){
        this.losses = losses;
    }
    /**
     * Override the abstract toString() method in Staff Class
     * Use generalPrintString to avoid repetition
     */
    @Override
    public String toString()
    {
        String coachString = "\n The name of the head coach is: " 
         + name + printGeneral() + " The next scheduled practice time and date will be: " + practiceNextDateAndTime +
         " the coaches win loss ratio is " + wins + "-" + losses;
         return coachString;
    }
    /**
     * Override the practice string using Scanner
     * Ask the user for next scheduled practice
     */
    public void practice(){
         Scanner keybd = new Scanner(System.in);
         System.out.println("As head coach please enter the next scheduled practice time and date");
         practiceNextDateAndTime = keybd.nextLine();
    }
}