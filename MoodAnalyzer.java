package com.blz.moodanalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
