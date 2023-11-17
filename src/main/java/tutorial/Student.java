package tutorial;

import java.util.ArrayList;

public class Student {

    int rollNo;
    String firstName;
    String lastName;

    public Student(int rollNo, String firstName, String lastName) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public static void main(String[] args) {
        Student s1 = new Student(1, "joe", "doe");
        Student s2 = new Student(2, "john", "doey");
        Student s3 = new Student(3, "jane", "daly");


        ArrayList<Student> st = new ArrayList<>();

        st.add(s1);
        st.add(s2);
        st.add(s3);

        for(Student s : st){
            System.out.println(s);
        }



    }



}
