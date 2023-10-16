package string_methods;

public class IndexOf {
    public static void main(String[] args) {

        String str = "welcome to javatpointoo";

       int count = 0;
       int startFrom = 0;

       for(int i = 0; i < str.length(); i++){
           int index = str.indexOf("t", startFrom);

           if(index >= 0){
               count += 1;

               startFrom = index + 1;
           }else{
               break;
           }
       }

        System.out.println(count);
    }
}
