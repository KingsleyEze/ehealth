package com.ehealth.questions;

import com.ehealth.resources.Question;

public class QuestionOne implements Question {

    String result = "";

    public String findChars(String string1, String string2){

        for(char character : string1.toCharArray())
            if(contains(character, string2.toCharArray()))
                result += character;

        return result;
    }

    static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c)
                return true;
        }
        return false;
    }

    @Override
    public void execute(){

      System.out.println(findChars("something", "anything"));
    }
}
