package com.blz.moodanalyzertest;

import com.blz.moodanalyzer.MoodAnalyzer;
import com.blz.moodanalyzer.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenHappy_shouldReturnHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenNull_shouldReturnHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenNull_shouldReturnInvalidInput() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            String mood = moodAnalyzer.analyseMood();
        }
        catch(MoodAnalyzerException moodAnalyzerException){
            Assert.assertEquals("Invalid Input!!!", moodAnalyzerException.getMessage());
        }
    }
    @Test
    public void givenMessage_whenEmpty_shouldReturnInvalidInput() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try{
            String mood = moodAnalyzer.analyseMood();
        }
        catch(MoodAnalyzerException moodAnalyzerException){
            Assert.assertEquals("Invalid Input!!!", moodAnalyzerException.getMessage());
        }
    }

}
