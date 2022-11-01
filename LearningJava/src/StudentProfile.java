public class StudentProfile {
    String firstName;
    String lastName;
    int graduationYear;
    double GPA;
    String major;

    public StudentProfile(String firstName, String lastName, int graduationYear, double GPA, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.GPA = GPA;
        this.major = major;
    }
    public void incrementGraduation(){
        this.graduationYear ++;
    }
}
