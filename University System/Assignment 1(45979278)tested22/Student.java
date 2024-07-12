//N.K Nkidi 45979278
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends UniversityStakeHolder
{
    private double studentFees;
    private String qualification;
    private int yearOfStudy;
    
    //Default Constructor
    public Student() {
    }
    
    public Student(String firstName, String lastName , int universityNumber, double studentFees ,int yearOfStudy ,String qualification ) {
        super(firstName , lastName , universityNumber);
        this.studentFees = studentFees;
        this.yearOfStudy = yearOfStudy;
        this.qualification = qualification;
        
    }
    //Accesor/Getter method
    public double getStudentFees() {
        return studentFees;
    }

    //Accesor/Getter method
    public int yearOfStudy() {
        return yearOfStudy;
    }
    
    //Accesor/Getter method
    public String getQualification() {
        return qualification;
    }

    //Mutator/Setter 
    public void setStudentFees(double studentFees) {
        this.studentFees = studentFees;
    }
    
    //Mutator/Setter 
    public void getQualification(String qualification) {
        this.studentFees = studentFees;
    }
    
    //Implementing the institutionRole method defined in the University Stakeholder class
     @Override
    public void institutionRole() {
        System.out.println("Institution role: Attending classes and studying according and Producing exellent  Module Marks and academic records.");
    }
    
    @Override
    public String toString() {
        return " \nStudent" +
                "\nFirst name: '" + getfirstName() + '\'' +
                "\nLast name : " + getlastName()+ '\'' +
                "\nUniversity Number : " + getUniversityNumber() +  '\'' +
                "\nStudent fees : R'" + studentFees + '\'' +
                "\nYear of Study : '" + yearOfStudy + '\'' +
                "\nQualification : '" + qualification;
    }
    
   
}
