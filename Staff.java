/**
 * Description of class Staff: an abstract class than encompasses 
 * the coach and the player classes
 * @author Aaron Amalraj
 * @version 12.16.2022
 */
public abstract class Staff
{
    // instance variables - replace the example below with your own
    protected double height; //height of staff
    protected double weight; //weight of staff
    protected String name; //name of player
    protected int yearsExperience; //how many years of experience
    protected String generalPrintString;
    /**
     * Accessor Methods
     * setter for set Height
     * @param double for height
     */
    public void setHeight(double height){
        this.height = height;
    }
    /**
     * Setter for weight
     * @param double for the weight
     */
    public void setWeight(double weight){
        this.weight = weight;
    }
    /**
     * setter for Name
     * @param integer string name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * setter for yearsExperience
     * @param integer yearsExperience
     */
    public void yearExperience(int yearsExperience){
        this.yearsExperience = yearsExperience;
    }
    /**
     * getter methods
     * @return a double that is height
     */
    public double getHeight(){
        return height;
    }
    /**
     * getter method 
     * @return a double that is weight
     */
    public double getWeight(){
        return weight;
    }
    /**
     * getter method 
     * @return a string which is the name of the staff
     */
    public String getName(){
        return name; 
    }
    /**
     * getter method 
     * @return an integer which is the years of Experience
     */
    public int getYearsExperience(){
        return yearsExperience;
    }    
    /**
     * print method 
     */
    public void printStaffInfo(){
        System.out.println(this);
    }
    /**
     * General print values that are common between the player and coach class 
     */
    public String printGeneral(){
        generalPrintString = " who stands " + height  + " inches weighing " + 
         weight + " has " + yearsExperience + " years experience ";
        return generalPrintString;
    }
    
    /**
     * Override toString method to print 
     */
    public abstract String toString();
    
    /**
     * Abstract method for practice and scheduling purposes
     */
    public abstract void practice();
}
