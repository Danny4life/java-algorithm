package tutorial;

public class Bike1 {

    int id;
    String name;

    float price;

    public Bike1(int i, String n) {
        id = i;
        name = n;
    }

    public Bike1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(id + " " + name + " "  + price);
    }
}
