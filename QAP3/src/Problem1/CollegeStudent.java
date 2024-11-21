package Problem1;

public class CollegeStudent extends Student {
    private String myMajor;
    private int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.myYear = year;
        this.myMajor = major;
    }

    // Methods
    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        this.myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    // Override toString method to include college student-specific information
    @Override
    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}
