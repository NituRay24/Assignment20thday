import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {

    Moodanalyser moodAnalyser;
    String message = "I am in happy mood";
    Boolean check;
    String result;

    @Test
    public void givenMessage_whenProper_RespondAsSadMood() throws MoodanalyserException
    {
        moodAnalyser = new Moodanalyser("I am in Sad Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",result);
    }

    @Test
    public void givenMessage_whenProper_RespondAsHappyMood() throws MoodanalyserException
    {
        moodAnalyser = new Moodanalyser("I am in Happy Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }

    @Test
    public void givenNullMood_shouldReturnHappy() throws MoodanalyserException
    {
        moodAnalyser = new Moodanalyser();
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
}





