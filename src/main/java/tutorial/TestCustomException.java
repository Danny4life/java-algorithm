package tutorial;

public class TestCustomException {

    public static void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("You are too young to vote");
        }else {
            System.out.println("You are eligible to vote");
        }
    }
}
