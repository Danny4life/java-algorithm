package tutorial;

public class Student {

    int rollNo;
    String firstName;
    String lastName;

    public Student(int rollNo, String firstName, String lastName) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return rollNo + " " + firstName + " " + lastName;
    }


    public static void main(String[] args) {
        Student s1 = new Student(1, "joe", "doe");
        Student s2 = new Student(1, "john", "doey");

        System.out.println(s1);
        System.out.println(s2);
    }



}
