package kata_8;

//Create a function which answers the question "Are you playing banjo?".
//        If your name starts with the letter "R" or lower case "r", you are playing banjo!
//
//        The function takes a name as its only argument, and returns one of the following strings:
//
//        name + " plays banjo"
//        name + " does not play banjo"
//        Names given are always valid strings.

// when ask the question, are you playing banjo?
// if your name starts with the letter R or lowercase r, then yes you are playing  banjo
// if not you are not playing banjo.

//steps
//-- check if given name starts with the letter R which must respect both uppercase and lowercase letter
// -- if given name starts with R or r, then name plays banjo
// -- if not, name does not play banjo.




public class AreYouPlayingBanjo {

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("bravo"));
    }

    public static String areYouPlayingBanjo(String name) {
        // Program me!

        char[] first = name.toCharArray();

        char c = first[0];

        String s = Character.toString(c);

        if(s.equals("R") || s.equals("r")){
            return  name + " " + "plays banjo";
        } else {
            return name + " " + "does not play banjo";
        }

    }
}
