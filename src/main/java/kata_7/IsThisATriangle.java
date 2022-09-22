package kata_7;

//Implement a function that accepts 3 integer values a, b, c. The function should return true
//        if a triangle can be built with the sides of given length and false in any other case.
//
//        (In this case, all triangles must have surface greater than 0 to be accepted).
// 1,2,2 == true
// 7,2,2 == false

public class IsThisATriangle {

    public static void main(String[] args){
        System.out.println(isTriangle(3,2,2));
    }

    public static boolean isTriangle(int a, int b, int c){

        if(a + b > c){
            if(a + c > b){
                if(b + c > a){
                    return true;
                }
            }
        }
        return false;
    }
}
