package tutorial;

public class WrongFileException extends Exception{
    public WrongFileException(String errorMessage){
        super(errorMessage);
    }
}
