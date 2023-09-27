package tutorial;

public class Student1 {

    int rollNo;
    String name;

    void insertRecords(int r, String n){
        rollNo = r;
        name = n;
    }

    void displayRecords(){
        System.out.println(rollNo + " " + name);
    }


}
