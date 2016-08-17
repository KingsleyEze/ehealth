package com.ehealth.questions;

import com.ehealth.resources.Question;

import java.util.Arrays;

public class QuestionThree implements Question {

      public int[] rotateArray(int[] rawArray, int N){

          int output[] = new int[rawArray.length];

          int outPutNvalue = N;

          for (int i = 0; i < rawArray.length; i++) {
              int value = rawArray.length - N;
              if (N != 0) {
                  output[i] = rawArray[value];
                  N--;
              } else {
                  output[i] = rawArray[i - outPutNvalue];
              }
          }
          return output;
      }

      @Override
      public void execute(){

          int input[] = { 1, 2, 3, 4, 5, 6 };

          int[] result = rotateArray(input, 2);

          System.out.println(Arrays.toString(result));
      }
}
