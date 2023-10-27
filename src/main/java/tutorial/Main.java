package tutorial;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Table obj = new Table();
        Table.Mythread1 t1 = new Table.Mythread1(obj);
        Table.Mythread2 t2 = new Table.Mythread2(obj);

        t1.start();
        t2.start();

    }
}
