package user.exception;

public class InputCanNotBeNullException extends RuntimeException{
    public InputCanNotBeNullException() {
        super("Input cannot be null");
    }
}
