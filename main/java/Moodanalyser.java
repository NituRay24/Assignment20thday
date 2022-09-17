import java.util.Scanner.*;
import java.io.*;
public class Moodanalyser {
    private String message;
    private String returnMessage;
    public void  MoodAnalyser(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodanalyserException, MoodanalyserException {
        this.message = message;
        return  analyseMood();
    }
    // Overloading analysedMood method
    public String analyseMood() throws MoodanalyserException
    {
        try
        {
            if (message.length() == 0)
            {
                throw new MoodanalyserException()Exception(MoodanalyserException.ExceptionType.ENTERED_EMPTY,"Please enter proper mood");
            }
            returnMessage= (message.contains("Sad")) ? "SAD":"HAPPY";
        }
        catch (NullPointerException e)
        {
            return "HAPPY";
        }
        return returnMessage;
    }
}