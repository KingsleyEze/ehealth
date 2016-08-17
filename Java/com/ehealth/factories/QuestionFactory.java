package com.ehealth.factories;

import com.ehealth.resources.Question;
import com.ehealth.questions.*;

public class QuestionFactory{

  public Question getQuestion(String questionNumber){

        if(questionNumber.equalsIgnoreCase("ONE"))
              return new QuestionOne();

        if(questionNumber.equalsIgnoreCase("TWO"))
              return new QuestionTwo();

        if(questionNumber.equalsIgnoreCase("THREE"))
              return new QuestionThree();

        if(questionNumber.equalsIgnoreCase("FOUR"))
              return new QuestionFour();

        return null;
  }
}
