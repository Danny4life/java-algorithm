package tutorial;

public class CounterStatic {
    static int count = 0;

    public CounterStatic() {
        count++;
        System.out.println(count);
    }

    static int cube(int x){
        return x*x*x;
    }
}
