------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: NBA Teams 
PURPOSE OF PROJECT: Final Project for Computer Science 2
VERSION or DATE: 12.20.2022
HOW TO START THIS PROJECT:
AUTHORS: Aaron Amalraj 
USER INSTRUCTIONS:
Explain each class and their relationships to each other 
o Indicate the location in your project (class and line number(s)) where I will find each of 
the required Java features from Section I above: 

A. Four or more classes with object class interaction. 
Import statements should specify all precise Class names. 
B. Inheritance: Inheritance is seen in this project through the abstract class Staff whose children are
Players and Coaches as seen in the class wrapper in the "extends keyword". Staff has the common fields between the two child classes which are: height, weight, name, yearsExperience. 
Also contains a generalPrintString which is what is common when printing using toString. Specifically, PrintGeneral method in the Staff class
has the common string that is used in the defining the abstract toString method in the child classes to avoid code duplication and repetition.
There is also an abstract method in Staff class called practice which differs between child classes coach (as the coach schedules the date and time of practice)
whereas a player would simply state if they are able to come. 

C. Abstract Class: The abstract implemented in this project is the Abstract class Staff as mentioned in part B.

D. Interface: The interface implemented in this project is called displayInterface. It is implemented by classes Team and NBALeague. 
It contains two abstract methods. One is used to greet the user with class specific instructions called helloWorld(). In the case of the player class
it is called when the user is about to start inputting players into a given team. In NBALeague the method is called in the getTeam method when the user is about to enter
a team they would like to see if on file.
 
E. File input/output: 
FileWriter is used in the constructor of the Team class (specifically in the try catch statement in the team constructor). In the try statement
the FileWriter object is created, and "Team Name: " string is printed which will be used as a delimiter in the FileReader. Then, 
the the string Players is written to the text file, the display method is called to display the date, as well as a GUI component. 
FileWriter is also used in team class, in methods writePlayers(), addPlayers(), setHeadCoach(). 

In the while loop, while the boolean is true, ask the user for numbers, if the user input equals 0 which is the stopper or the counter is greater than 14 
then exit the loop. Otherwise, ask the user for information about the player's fields, create a player object, ask them about practice
then increment counter by 1, so it is not an infinite loop. Then write to file to player's count and their information using the toString method
This is how fileWriter is used in the constructor of the Team Class. numberOfPlayers is set to the countervariable.

FileReader is used in the NBALeague class, specifically in the readTeamFile() method, where there is also a try and catch statement. 
In the try statement a FileReader object is created, the scanner is scanning the reader and using the "Team Name: " delimiter 
talked about earlier to separate teams string information from each other. Counter index and team are initialized, and a while loop is 
started given the condition that the fileScanner has another item to look at and the count is less than 29 (meaning a maxmimum of 30 NBA basketball teams)
In this while loop the next in the scanner is assigned to the respective element in the count and the counter index increases by 1 after that. 
After the loop ends, the scanner and the reader are closed and the numberOfTeams variable is set to the counter index, selectionSort
method is called to display to now sorted Array. 

F. HashMap or HashSet: 

A HashSet is used in the Team class in the constructor in order to add to the HashSet each time a player is inputted. Additionally, 
it is used so that there are no duplicates in the user input. It can print the players, in a HashSet 
using an Iterator and while loop in the Team class using the printPlayers() method in the team class. Also, the playersSet is used in 
the writePlayers() method, as well as addPlayers() method in the team class.  

G. Selection Sort using the approach learned in class and/or Binary Search 

A Selection Sort was used by first converting the HashSet formed by inputting players to an Array(as a sort can be done using an array) using the 
toArray method in the Team Class. The method is called, selectionSortHeight().numberOfPlayers is used for the 
amount of players to go through the array, because if it went through all 15 and there are not 15 players currently on the team a null pointer exception
will arise. It is called at the end of user input of players in order to display the name and height from shortest to tallest in inches. 
The method has three initializers: lowIndex, holder, and a swap counter to indicate the amount of swaps necessary to sort the values. 
A for loop with a nested for loop, is used in order to sort shortest to tallest, very similar to what was done in class. After the loop 
ends, the printPlayersArray method is called which prints the name and height in the now sorted array. The number of swaps is also 
displayed.  

H. Test fixtures containing instantiated objects 

Test fixtures are there for NBALeague class and Team Class(default team in the team class is the Cleveland Cavs)

I. main method 

The main method is used in the Team Class to replicate what would happen if a team object were 
created normally. It is at the end of the file of team Class. parse methods
are used in order to convert string arguments to the values needed. Then a new Team object 
is created, and prints information about the inputted team.

J. * String class method (other than .equals())

String methods used: 
 *Used ToString method(in the string class) to print information about object classes, including players and coaches! 
 *Used the .contains method in the NBALeague Class for getTeam method. 
 *Also used string.toLowerCase(),method for getting input for user about the item they want 

K. * Date (with LocalDate)
*Imported required syntax in team class
*Within the team class added a display method called 
*"displayMethod()". This method is called right before asking user 
*for input for the players on the team in the team Class

L. * GUI component (need not be integrated into your project)
*Had Basic Frame and Basic Panel class with GUI components. 
*Employed them within the project by creating object basic frames 
*during Team creation in team class, and in get method in the NBALeague Class.
*Integrated into project

*Something New – incorporate at least one new class or method that you locate in the Java API.
     *Incorporated the toArray method to convert the playerHashSet to a playerArray, thus avoiding any duplicates that could arise

o Give precise instructions on how to use your project. Tell what classes and what 
methods in each you want me to call. 
(If I don’t know what to do, you won’t be able to earn credit for it.): 

-Firstly, in team class you can use the test fixture if you'd like. 
It has the Cleveland Cavs as the team and the head coach information, or you can
create a new team. 

-Once the team (parameters/brought test fixture to object bench) are filled go to terminal where you will be asked to enter 
the scheduled date and time of the next practice. 

-After this the current date should be displayed on the terminal, 
user information to follow directions, and directions to add a player (this is the abstract helloWorld() method being used from displayInterface)
enter their name or 0 to end. Also a GUI component pops up with the title 
"Welcome to the NBA League and Team Program", label that states "hello NBA fans, how are you today"
in the panel. Yellow in GUI is used to indicate Golden State Warriors as they 
were the last NBA champions. 

-Enter player's name
-Then enter their height in inches
-Enter the player's position in initials PG, SG, SF, PF or C
-Enter the player's weight 
-Enter the player's year of experience 
-Enter how much points per game the player averages
-Lastly,state if the player can make it to the next practice or not 

-Repeat Process with as many players as you'd like enter 0 when you would like to stop adding players

-Once you enter 0 the order of the heights of the players from the team, 
from shortest to tallest with their respective names will be displayed as well as a thank you note(abstract method from the displayInterface)
saying how much you appreciate the user entering info as well the number of swaps that it took to sort 
the given players heights. 

-To check that the FileWriter (File input works can go to teams.txt file)
and see the updated team appended to the file. 

-Can test other methods in this class if you'd like including the addplayer() method where you enter arguments. Then you are asked in the scanner if the player
can attend practice or not, the player is then added to the HashSet and Array using toArray, and also appended to end of teams.txt. 
Then you can check that the player is in fact appended to the teams.txt file 

-Test setHeadCoach method by first inputting values for method, then go to terminal and input practice time, 
the new information with players and head coach should be appended to the end of the file. Go to teams.txt to test 
this. 

-Test main class in the teamClass to by calling it and entering the required arguments in string main arguments 
@param Argument 1, Team Name
     * @param Argument 2, height of head coach in inches, 
     * @param Argument 3, weight of head coach in pounds 
     * @param Argument 4, the name of head coach 
     * @param Argument 5, years of experience of coach
     * @param Argument 6, amount of wins for coach: 
     * @param Argument 7, amount of losses for coach

Then, follow the same instructions as if you were creating a team object normally. After entering the players you should everything 
as well as printTeam information to the console. 

-Secondly, use the testFixture in NBALeague or create your own object. 
First call the readTeamFile() method to read the teams.txt file and create an array 
of teams based on that. Then call getTeam() method in this object, 
where a GUI component showed pop up like the first time in team class, as well as directions to follow 
to enter the team you would like to see if on file. 

-Enter the team you just wrote into the file to test this 
-Then, the terminal thanks the user for entering the team they'd like. (thankUNote() method for displayInterface))
If the team is found on file, the team information is displayed, including 
team name, head coach info, and the players info. 
-After testing this, can test printLowerTeamArray() which prints 
the whole teams.txt file lowercase. Can also test the printTeamArray()
which prints the whole teams.txt file normally. 
-The helloWorld() method and thankYouNote(), are called before and after input 
by user and you should have seen the messages on the terminal during that time so you can test it now but you should have seen it before
as well 
-toLowerTeamArray() method, sets the elements in the array to lowercase strings, printLowerTeamArray() calls this method. 

• Citations for any outside sources: 

Math and Science. “Java Tutorial - 17 - Changing a String to Lowercase or Uppercase.” Www.youtube.com, www.youtube.com/watch?v=dwm_BR6K_po. Accessed 20 Dec. 2022.

“Set (Java Platform SE 8 ).” Docs.oracle.com, docs.oracle.com/javase/8/docs/api/java/util/Set.html#toArray--. Accessed 20 Dec. 2022.

Software Testing and Automation. “10 - Java Program to Copy All Elements of One Array into Another Array.” Www.youtube.com, www.youtube.com/watch?v=3tJ_gXzzOpI. Accessed 20 Dec. 2022.

• Class diagram (A screenshot of the BlueJ window is fine.): 
Wasn't able to paste it into this read.txt file have attached a screenshot of diagram(blueJ window) to the zip folder
