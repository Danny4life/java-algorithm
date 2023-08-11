package kata_8;

//Sometimes, I want to quickly be able to convert miles per imperial gallon (mpg) into kilometers per liter (kpl).
//
//        Create an application that will display the number of kilometers per liter (output)
//        based on the number of miles per imperial gallon (input).
//
//        Make sure to round off the result to two decimal points.
//
//        Some useful associations relevant to this kata:
//
//        1 Imperial Gallon = 4.54609188 litres
//        1 Mile = 1.609344 kilometres

//
//public class TestConverter {
//
//    @Test
//    public void test1() {
//        assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
//    }
//
//    @Test
//    public void test2() {
//        assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
//    }
//
//    @Test
//    public void test3() {
//        assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
//    }
//}


// STEPS to convert mpg to kpl
// 1. get the mpg value
// 2. convert it by using the mpg value
// 3. round the results to 2 d.c point

//        1 Imperial Gallon = 4.54609188 litres
//        1 Mile = 1.609344 kilometres


import java.text.DecimalFormat;

public class Converter {

    public static void main(String[] args) {
        System.out.println(mpgToKPM(30));
    }

    public static float mpgToKPM(final float mpg) {

        float milesToKilometers = 1.609344f;
        float imperialGallonToLiters = 4.54609188f;

        float kpg = mpg * milesToKilometers / imperialGallonToLiters;

        return roundToTwoDecimalPlaces(kpg);
    }

    public static float roundToTwoDecimalPlaces(float value){
        return Math.round(value * 100.0f) / 100.0f;
    }
}
