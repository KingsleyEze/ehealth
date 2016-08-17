package com.ehealth.questions;

import com.ehealth.resources.Question;
import java.util.*;

public class QuestionTwo implements Question {

    public int[] removeDuplicates(int[] anArray){

        int end = anArray.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < end; i++)
            set.add(anArray[i]);

        int[] uniqueList = new int[set.size()];
        int i = 0;

        for (Iterator<Integer> it = set.iterator(); it.hasNext();)
            uniqueList[i++] = it.next();

        return uniqueList;
      }

      @Override
      public void execute(){

          int[] unfilteredArray = new int[]{1, 3, 7, 7, 8, 9, 9, 9, 10};

          int[] result = removeDuplicates(unfilteredArray);

        System.out.println(Arrays.toString(result));
      }
}
