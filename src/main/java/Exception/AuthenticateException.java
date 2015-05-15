package Exception;

/**
 * Created by i843719 on 11/7/14.
 */
public class AuthenticateException extends Exception {

    private String message = null;

    public AuthenticateException(){
        super();
    }

    public AuthenticateException(String message){
        super(message);
        this.message = message;
    }

    public AuthenticateException(Throwable cause){
        super(cause);
    }

}
