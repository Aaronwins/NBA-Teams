import java.util.Arrays; //Array for selection sort
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * Description of class NBALeague here: class to read teams text file
 * read up to 30 teams. User can search for the name of the team and if the txt 
 * file has it, then it will display
 *
 * @author Aaron Amalraj
 * @version 12.20.2022
 */
public class NBALeague implements displayInterface
{
    // instance variables - replace the example below with your own
    private String[] teamsArray; //team Array
    private String teamFile = "teams.txt";
    private int numberOfTeams; 
    private String[] lowerCaseArray; //team Array

    /**
     * Constructor for objects of class NBALeague
     */
    public NBALeague()
    {
        // initialise instance variables
        teamsArray = new String[30]; //max of 30 teams information
    }

    /**
     * Read method in team file 
     * reads up to thirty teams
     */
    public void readTeamFile(){
    {
        try{
        // 1. 
        FileReader reader = new FileReader(teamFile);
        Scanner fileScanner = new Scanner(reader); 
        fileScanner.useDelimiter("Team Name: "); //delimiter
        String team = ""; 
        int counterIndex = 0;
        while(fileScanner.hasNext() && counterIndex <29){
            team = fileScanner.next(); //get the next name 
            teamsArray[counterIndex] = team; 
            counterIndex = counterIndex + 1;
        }
        //3.Close Connection
        fileScanner.close(); // close the inner one before outter one 
        reader.close(); 
        numberOfTeams = counterIndex; // number of teams 
        //printTeamArray();
    }
    catch(IOException ioException){
        System.out.println("Error processing file");
    }
}}
    /**
     * search team user wants and get it if teamsArray has teamName
     * Used after read teams.txt
    */
    public void getTeam(){
        String userTeam = ""; 
        String teamObject = "";
        Scanner keybd = new Scanner(System.in);
        BasicFrame welcomeGUI;
        welcomeGUI = new BasicFrame(); //display welcome by creating new Basic Frame object
        helloWorld(); //ask user how they are doing today through default method from interface
        System.out.println("Enter the team you would like to see information about: ");
        userTeam = keybd.nextLine();
        thankYouNote(); //say thank you to user for entering info
        Boolean containsTeam= false; 
        for (int index = 0; index < numberOfTeams; index++){
            toLowerTeamArray();
            teamObject = lowerCaseArray[index];
            if(teamObject.contains(userTeam.toLowerCase())){ //checking if lowercase values are equal
                System.out.println(teamsArray[index]);
                containsTeam = true;
            }
        }
        if (containsTeam == false){
            System.out.println("Sorry this team is not on the array");
    }}
    /**
     * Print the teamArray
     */
    public void printTeamArray(){
        for(int index = 0; index< numberOfTeams; index++){
            System.out.print(teamsArray[index]+ " ");
        }
        System.out.println();
    }
    
    /**
     * Turn the teamArray to all lowercase to avoid any wrong string comparisions
     */
     public void toLowerTeamArray(){
        lowerCaseArray = new String[numberOfTeams];
        for(int index = 0; index< numberOfTeams; index++){
            lowerCaseArray[index] = teamsArray[index].toLowerCase(); //lowercase
        }
    }
    
    /**
     * Print lowercase Array
     */
    public void printLowerTeamArray(){
        toLowerTeamArray();
        for(int index = 0; index< numberOfTeams; index++){
            System.out.print(lowerCaseArray[index]+ " ");
        }
        System.out.println();
    }
    /**
     * Defining abstract method from displayInterface
     */
    public void helloWorld(){
       System.out.println("Hi user, follow the following directions to find if your team is on file"); 
    }
    /**
     * Defining abstract thank you method from displayInterface
     */
    public void thankYouNote(){
        System.out.println("Thank you very much for entering, the team you want. We will work to find it!");
    }
    }
