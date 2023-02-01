package com.blz.moodanalyzer;

/**
 * Author: Vishal Chandra
 * Use to handle invalid user input situations
 */
public class MoodAnalyzerException extends RuntimeException{
    public MoodAnalyzerException(String message) {
        super(message);
    }
}
