import model.Student;

public class Main {

    public static void main(String[] args){

        Student student = new Student("Eva", 18, "female", "100212");
        System.out.println("I'm a student.");
        System.out.println("My name is " + student.getName() + ".");
        System.out.println("My age is " + student.getAge() + ".");
        System.out.println("My gender is " + student.getGender() + ".");
        System.out.println("My student id is " + student.getId() + ".");
    }
}
