package string_methods;

public class SubstringEx {

    public static void main(String[] args) {

        // using substring to do prefix and suffix extraction
        String[] str = {
                "Praveen Kumar",
                "Yuvraj Singh",
                "Harbhajan Singh",
                "Gurjit Singh",
                "Virat Kohli",
                "Rohit Sharma",
                "Sandeep Singh",
                "Milkha Singh",
        };

        String surname = "Singh";
        int surnameSize = surname.length();
        int size = str.length;

        for(int i = 0; i < size; i++){
            int length = str[i].length();

            // extracting the surname
            String subStr = str[i].substring(length - surnameSize);

            //check if the surname is equal to singh or not
            if(subStr.equals(surname)){
                System.out.println(str[i]);
            }
        }
    }
}
