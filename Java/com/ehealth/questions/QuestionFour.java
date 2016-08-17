package com.ehealth.questions;

import com.ehealth.resources.Question;

public class QuestionFour implements Question {

      public int getLCM(int x, int y)
      {
          int a;
          a = (x > y) ? x : y;
          while(true)
          {
              if(a % x == 0 && a % y == 0)
                  return a;
              ++a;
          }
      }

      @Override
      public void execute(){

        int result = getLCM(20, 64);

        System.out.printf("The LCM of 20 and 64 is %d", result);
      }
}
