/**
 * Description of class Team: description of what an NBA team 
 * is supposed to be comprised of
 * @author Aaron
 * @version 12.16.22
 * @version 12.20.22
 */
import java.util.HashSet; 
import java.util.Iterator;
import java.util.Scanner;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays; //Array for selection sort 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; //local date method employed here
public class Team implements displayInterface
{
    private LocalDate today;
    private DateTimeFormatter datePattern;
    private String teamName;
    private HashSet<Players>playersSet; 
    private Coaches headCoach;
    private String teamFile = "teams.txt";
    private Players[] playersArray; //player Array
    private int numberOfPlayers; //the number of Players
    /**
     * Constructor for objects of class Team
     * Height, weight, name, experience, wins losses in constructor parameters, referring to the head coach not the player
     */
    public Team(String teamName, double height, double weight, String name, int yearsExperience, int wins, int losses)
    {
    {
        today = LocalDate.now(); 
        datePattern = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        this.teamName = teamName;
        playersSet = new HashSet<>(); 
        playersArray = new Players[15]; //max of 15 players on a roster 
        headCoach = new Coaches(height, weight, name, yearsExperience, wins, losses);
        headCoach.practice();
        String stopper = "0";
        String playerName = ""; 
        String playerPosition = "";
        double playerHeight = 0;
        double playerWeight = 0; 
        int playerYearsExperience = 0; 
        double ppg = 0; 
        boolean continueBool = true; //default to true
        int counterPlayers = 0; 
        Players playerObject;
        BasicFrame welcomeGUI;
        Scanner keybd = new Scanner(System.in);
        try{
            //1. Open the connection 
            FileWriter writerObject = new FileWriter(teamFile, true);
            writerObject.write("\n Team Name: " + teamName + headCoach.toString());
            writerObject.write("\n Players: ");
            displayMethod(); //display date to user just before asking for input of players
            welcomeGUI = new BasicFrame(); //display welcome
            helloWorld(); //ask user how they are doing today through default method from interface
            //2. Write the data 
            while(continueBool == true){
                System.out.println("\nTo add a new player first enter their name or 0 to end: "); 
                playerName = keybd.nextLine(); 
                if(!(playerName.equals(stopper) || counterPlayers > 14)){ //check if equals stopper or reached 15 spots
                System.out.println("\nEnter the player's height in inches: "); 
                playerHeight = keybd.nextDouble();
                keybd.nextLine();
                System.out.println("\nEnter the player's position whether in initials, PG(Point Guard), SG(Shooting Guard), SF(Small Forward), PF(Power Forward), C(Center)"); 
                playerPosition = keybd.nextLine(); 
                System.out.println("\nEnter the player's weight in pounds: "); 
                playerWeight = keybd.nextDouble();
                keybd.nextLine();
                System.out.println("\nEnter the player's years of experience: ");
                playerYearsExperience = keybd.nextInt();
                keybd.nextLine();
                System.out.println("\nEnter the player's average point's per game: ");
                ppg = keybd.nextDouble(); 
                keybd.nextLine();
                playerObject = new Players(playerHeight, playerWeight, playerName, playerYearsExperience, playerPosition, ppg);
                playerObject.practice();
                counterPlayers = counterPlayers + 1;
                writerObject.write("\n" + counterPlayers + "."); //player count
                writerObject.write(playerObject.toString()); //comma to indicate separate players
                playersSet.add(playerObject); //won't allow duplicates
                //playersArray[counterPlayers-1] = playerObject; 
                //add value by assigning to index 
                }
                else{
                    keybd.close(); //3. Close the scanner connection
                    writerObject.close(); //3. Close the writer connection
                    thankYouNote();
                    System.out.println("The order of heights of the players you entered from least to greatest are as follows: ");
                    playersSet.toArray(playersArray); //copy values from hashSet to playersArray of size 15
                    numberOfPlayers = counterPlayers;
                    selectionSortHeight(); //call selection sort to show from short to tall
                    continueBool = false; 
                }
            }
        }
        catch(IOException ioException){
            System.out.println("Error has occured could not access file");         
        }       
    }}
        // initialise instance variables
    /**
     * set Head Coach method
     * writes to file with updated information
     */
    public void setHeadCoach(double height, double weight, String name, int yearsExperience, int wins, int losses){
        headCoach = new Coaches(height, weight, name, yearsExperience, wins, losses);
        headCoach.practice();
        try{
            //1. Open the connection 
            FileWriter writerObject = new FileWriter(teamFile, true);
            writerObject.write("\n Team Name: " + teamName + headCoach.toString());
            writerObject.write("\n Players: ");
            writePlayers(); 
            writerObject.close();
        }
        catch(IOException ioException){
            System.out.println("Error writing to file");
        }
    }
    
    /**
     * Method to write Players to fileWriter using Iterator and HashSet
     */
    public void writePlayers(){
        Iterator<Players> playersIterator = playersSet.iterator();
        while(playersIterator.hasNext()){
            Players playerObject = playersIterator.next();
            numberOfPlayers = numberOfPlayers + 1;
            try{
                FileWriter writerObject = new FileWriter(teamFile, true);
                writerObject.write(numberOfPlayers + ". " + playerObject.toString());
                writerObject.close(); //close FileWriter
            }
            catch(IOException ioException){
                System.out.println("Error has occured processing file");
            }      
            }  
        }
    /**
     * Get Head Coach method
     */
    public Coaches getHeadCoach(){
        return headCoach;
    }    
    /**
     * Add player to roster
     * Add player to end of file teams.txt
     * Add player to HashSet, than convert to Array, 
     * Accepts parameters related to height of player, weight of coach, etc. 
     */
    public void addPlayer(double height, double weight, String name, int yearsExperience,String position,double ppg){
        Players playerObject = new Players(height, weight, name, yearsExperience,position,ppg);
        playerObject.practice(); //see if they can come to practice or not using user input 
        playersSet.add(playerObject);     
        playersSet.toArray(playersArray); //copy values from hashSet to playersArray of size 15
        numberOfPlayers = numberOfPlayers + 1;
        try{
            FileWriter writerObject = new FileWriter(teamFile, true);
            writerObject.write("\n" + numberOfPlayers + ". " + playerObject.toString());
            writerObject.close(); //close fileWriter
        }
        catch(IOException ioException){
           System.out.println("An error has occured accessing the file when trying to write to it"); 
        }
    }
    /**
     * Print players on roster to console
     * Uses iterator to print the HashSet of Players one at a time
     */
    public void printPlayers(){
        Iterator<Players> playersIterator = playersSet.iterator();
        while(playersIterator.hasNext()){
            Players playerObject = playersIterator.next();
            playerObject.printStaffInfo();
        }
        System.out.println();
    }
    /**
     * Print players name and height using array for selection sort for height
     * @param: counterPlayers int (i.e. number of Players)
     */
    public void printPlayersArray(int counterPlayers){
        for(int index = 0; index<counterPlayers; index++){
            System.out.print(playersArray[index].getName() + " " + playersArray[index].getHeight()+ " ");
        }
        System.out.println();
    }
    /**
     * Print players, coach and team name 
     */
    public void printTeam(){
        System.out.println("Team Name: " + teamName);
        System.out.println("Head Coach: " + headCoach);
        printPlayers(); 
    }
    
    /**
     * Selection Sort Height from smallest to greatest height of players on roster
     * and print it and amount of swaps
     */
    public void selectionSortHeight(){
        int lowIndex = 0;
        Players holder; 
        int swapCounter = 0;
        for (int startIndex = 0; startIndex< numberOfPlayers -1; startIndex++)
        {   
            lowIndex = startIndex;
            for(int nextIndex = startIndex + 1; nextIndex < numberOfPlayers; nextIndex++){
                if(playersArray[nextIndex].getHeight() < playersArray[lowIndex].getHeight()){
                    lowIndex = nextIndex;
                }
            }
            if (lowIndex != startIndex){ //so that you don't swap when it is not needed to
                holder = playersArray[startIndex]; //first starting value
                playersArray[startIndex] = playersArray[lowIndex];
                playersArray[lowIndex] = holder; 
                swapCounter = swapCounter+1; //number of swaps 
            }}
        printPlayersArray(numberOfPlayers); //print NumArray to show the order and swaps
        System.out.println("Number of Swaps: " + swapCounter); 
    }
    /**
     * Display method for the date called in constructor 
     * When asking for players in the team
     */
    public void displayMethod(){
        System.out.println(today);
        System.out.print("Formatted: ");
        System.out.println(datePattern.format(today));
    }
    
    /**
     * Defining abstract method from Interface class 
     * Define method for when called before adding players
     */
    public void helloWorld(){
        System.out.println("Hello user, please follow the following directions to add a player"); 
    }
    /**
     * Defining abstract thank you method from displayInterface
     */
    public void thankYouNote(){
        System.out.println("Greatly appreciate you entering the players on this team!");
    }
    /**
     * Main method to execute writing to file and printTeam information on console
     * Sample method Boston Celtics
     * @param Argument 1, Team Name
     * @param Argument 2, height of head coach in inches, 
     * @param Argument 3, weight of head coach in pounds 
     * @param Argument 4, the name of head coach 
     * @param Argument 5, years of experience of coach
     * @param Argument 6, amount of wins for coach: 
     * @param Argument 7, amount of losses for coach
     */
    public static void main(String[]args){
        String teamName = args[0];
        double height = Double.parseDouble(args[1]);
        double weight = Double.parseDouble(args[2]);
        String name = args[3];
        int yearsExperience = Integer.parseInt(args[4]);
        int wins = Integer.parseInt(args[5]);
        int losses = Integer.parseInt(args[6]);
        Team teamObject = new Team(teamName,height, weight,name, yearsExperience, wins, losses); 
        teamObject.printTeam();
    }
}
