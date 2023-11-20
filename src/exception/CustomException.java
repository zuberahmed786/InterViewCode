package exception;

public class CustomException extends Exception{

    public CustomException(String message)
    {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomException("This is Custom Exception");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
