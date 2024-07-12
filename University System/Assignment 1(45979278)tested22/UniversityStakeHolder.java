//N.K Nkidi 45979278
/**
 * Write a description of class UniversityStakeHolder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Abstract UniversityStakeHolder class
public abstract class UniversityStakeHolder
{
    private String firstName;
    private String lastName;
    private int universityNumber;
    
    //Default Constructor
    protected UniversityStakeHolder(){
        
    }
    
    
    //Parameterized Constructor
    protected UniversityStakeHolder(String firstName ,  String lastName , int universityNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityNumber = universityNumber;
        
    }
    
    //Accesor/Getter method for first name
    public String getfirstName(){
        return firstName;
    }
    
    //Accesor/Getter method for second  name
    public String getlastName(){
        return lastName;
    }
    
    //Accesor/Getter method for universityNumber
    public int getUniversityNumber() {
        return  universityNumber;
    }

    
    //Mutator/Setter for firstName
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    
    //Mutator/Setter for lastName
     public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    
    //Mutator/Setter for identifcationNumber
    public void setUniversityNumber(int universityNumber) {
        this.universityNumber = universityNumber;
    }
    
    //Absract method
    public abstract void institutionRole();

    @Override
    public String toString() {
        return "\nStakeholder" +
                "\nFirst name : " + firstName + '\'' +
                "Last name : " + lastName+
                "University Number: " + universityNumber;
    }
    
    
    
    
    
}
