//N.K Nkidi 45979278
/**
 * Write a description of class Professor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends UniversityStakeHolder
{
    private String faculty;
     
    public Lecturer() {
    }
    
    //Parameterized Constructor
    public Lecturer(String firstName,String lastName ,  int universityNumber , String faculty) {
        super(firstName , lastName , universityNumber);
        this.faculty = faculty;
    }
    
    //Accesor/Getter method
    public String getFaculty() {
        return faculty;
    }
    
    //Mutator/Setter
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    //Implementing the institutionRole method defined in the University Stakeholder class
    @Override
    public void institutionRole() {
        System.out.println("Institution role: Teaching , Student Support , Administrative Duties and  conducting research.");
    }
    
     @Override
    public String toString() {
        return "\nLecturer" +
                "\nFirst name: '" + getfirstName() + '\'' +
                "\nLast name : " + getlastName()+ '\'' +
                "\nUniversity Number :" + getUniversityNumber() +  '\'' +
                "\nFaculty : '" + faculty + '\'';
    }
}
