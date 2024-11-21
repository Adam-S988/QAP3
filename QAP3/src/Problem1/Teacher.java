package Problem1;

public class Teacher extends Person {
    private String mySubject;
    private double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.mySubject = subject;
        this.mySalary = salary;
    }

    // Methods
    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    // Override toString method to include teacher-specific information
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}
