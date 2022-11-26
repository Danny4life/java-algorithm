package kata_8;

//Debugging sayHello function
//        The starship Enterprise has run into some problem when creating a
//        program to greet everyone as they come aboard. It is your job to fix
//        the code and get the program working again!
//
//        Example output:
//
//        Hello, Mr. Spock

public class GrasshopperSayHello {

    public static void main(String[] args) {
        System.out.println(sayHello("Mr. Spock"));
    }

    public static String sayHello(String name) {

        return "Hello, " + name;
    }
}
