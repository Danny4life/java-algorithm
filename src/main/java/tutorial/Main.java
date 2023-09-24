package tutorial;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
//        Student tom = new Student();
//
//        tom.id = 1;
//
//        System.out.println(tom.id);
//        System.out.println(tom.name);
//
//        System.out.println(name(0));

//        if(condition 1){
//           // executes statement 1;  when condition is true
//        }
//
//        else if(condition 2) {
//            // executes statement 2; when condition is true
//       }
//        else{
//            //executes statement 2; when all conditions are false
//        }

//        switch (expression) {
//            case value 1:
//                execute statement 1;
//                break;
//
//            case value 2:
//                execute statement 2;
//                break;
//
//            default:
//                default statement;
//        }

        int num = 20;

        switch (num){
            case 20:
                System.out.println("number is 20");
                break;

            case 10:
                System.out.println("number is 10");
                break;

            default:
                System.out.println(num);

        }

        String name = "Segun";

        switch (name){
            case "Bayo":
                System.out.println("Wrong, this is not my name");
                break;

            case "Emeka":
                System.out.println("Wrong, this is not my name");
                break;

            case "Segun":
                System.out.println("Correct, this is my name " + name);
                break;

            default:
                System.out.println(name);
        }


    }



}
