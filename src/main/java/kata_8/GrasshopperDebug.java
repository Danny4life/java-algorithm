package kata_8;

//Debug celsius converter
//        Your friend is traveling abroad to the United States so he wrote a program to
//        convert fahrenheit to celsius. Unfortunately his code has some bugs.
//
//        Find the errors in the code to get the celsius converter working properly.
//
//        To convert fahrenheit to celsius:
//
//        celsius = (fahrenheit - 32) * (5/9)
//        Remember that typically temperatures in the current weather conditions are
//        given in whole numbers. It is possible for temperature sensors to report
//        temperatures with a higher accuracy such as to the nearest tenth.
//        Instrument error though makes this sort of accuracy unreliable for
//        many types of temperature measuring sensors.


//public class GrassHopperTest {
//
//    @Test
//    public void testA() {
//        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
//    }
//    @Test
//    public void testB() {
//        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
//    }
//}

public class GrasshopperDebug {
    public static void main(String[] args) {
        System.out.println(weatherInfo(50));

    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32) * (5/9.0);
        return celsius;
    }
}
