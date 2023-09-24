package kata_8;

//You are the owner of a box making company.
//
//        Your company can produce any equal sided polygon box,
//        but plenty of your customers want to transport circular objects in these boxes.
//        Circles are a very common shape in the consumer industry. Tin cans, glasses,
//        tyres and CD's are a few examples of these.
//
//        As a result you decide to add this information on your boxes:
//        The largest (diameter) circular object that can fit into a given box.

//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class PolygonTest {
//
//    @Test
//    public void test1(){
//        //Square with sides of 5 units
//        Polygon poly=new Polygon(4, 5);
//        assertEquals("5.000", String.format("%.3f", poly.circleDiameter()));
//    }
//
//    @Test
//    public void test2() {
//        //Octogon with sides of 9 units
//        Polygon poly=new Polygon(8, 9);
//        assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
//    }
//
//    @Test
//    public void test3() {
//        //Triangle with sides of 4 units
//        Polygon poly=new Polygon(3, 4);
//        assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));
//    }
//}

public class Polygon {
    public static void main(String[] args) {

    }

    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        //Your code comes here
        if(sides < 3){
            return 0;
        }

        double rad = Math.PI / sides;
        // double tValue = Math.tan(rad);
        double dMeter = sideLength / Math.tan(rad);

        return dMeter;
    }
}
