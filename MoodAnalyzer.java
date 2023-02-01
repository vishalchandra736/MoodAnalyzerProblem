package com.blz.moodanalyzer;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyseMood() {
        return analyseMood(this.message);
    }

    public String analyseMood(String message) {
        try {
            if(message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
