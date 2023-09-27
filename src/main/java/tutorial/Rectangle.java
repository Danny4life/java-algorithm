package tutorial;

public class Rectangle {

    int length;
    int width;

    void insert(int l, int w){
        length = l;
        width = w;
    }

    void displayRecord(){
        System.out.println(length * width);
    }
}
