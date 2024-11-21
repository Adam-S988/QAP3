package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create Person, Student, Teacher, and CollegeStudent objects
        Person BS = new Person("Brandon Shea", 27, "M");
        System.out.println(BS);

        Student KH = new Student("Kyle Hollett", 16, "M", "HS95129", 3.5);
        System.out.println(KH);

        Teacher BA = new Teacher("Bradley Ayers", 34, "M", "Computer Science", 50000);
        System.out.println(BA);

        CollegeStudent ima = new CollegeStudent("Angie Flynn-Smith", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
