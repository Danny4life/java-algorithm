package tutorial;

public class Student1 {

    int rollNo;
    String name;

    public Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static String college = "Decagon";

    void display(){
        System.out.println(rollNo + " " + name + " " + college);
    }



}
