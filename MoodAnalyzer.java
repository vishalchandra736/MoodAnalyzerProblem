package com.blz.moodanalyzer;
public class MoodAnalyzer {
    String message = null;
    public MoodAnalyzer() {
    }
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    /**
     * use for analyse mood
     * @param message
     * @return String: if msg is Sad return SAD mood; otherwise return HAPPY mood
     */
    public String analyseMood(String message) throws MoodAnalyzerException{
        try{
            if(message.contains("Sad")) {
                return "SAD";
            }
        }
        catch(NullPointerException ex) {
            if(message == null){
                throw new MoodAnalyzerException("Invalid Input!!!");
            }
        }
        return "HAPPY";
    }
    public String analyseMood() {
        return analyseMood(this.message);
    }
}
