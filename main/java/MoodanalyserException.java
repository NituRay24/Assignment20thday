
public class MoodanalyserException extends Exception{
    public MoodanalyserException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }

    enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_CLASS,NO_SUCH_METHOD,NO_SUCH_FIELD;
    }
    ExceptionType type;


}
