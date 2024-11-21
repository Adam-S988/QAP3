package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create Person, Student, Teacher, and CollegeStudent objects
        Person bob = new Person("Brandon Shea", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Kyle Hollett", 16, "M", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Bradley Ayers", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Angie Flynn-Smith", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
