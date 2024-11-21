package Problem1;

public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Methods
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // Override toString method to include student-specific information
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
