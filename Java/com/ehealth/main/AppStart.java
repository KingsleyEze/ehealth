package com.ehealth.main;

import com.ehealth.factories.QuestionFactory;
import com.ehealth.resources.Question;

public class AppStart{

  public static void main(String[] args){

    /**
     * DEPTH FIRST TREE TRAVERSAL
     * Depth First Search algorithm(DFS) traverses a graph in a depthward motion
     * and uses a stack to remember to get the next vertex to start a search
     * when a dead end occurs in any iteration.
     */
    QuestionFactory questionFactory =  new QuestionFactory();

    /***
     * Question One Solution : CHARACTERS IN STRINGS
     */
    System.out.println("First Question's answer:");

    Question questionOne = questionFactory.getQuestion("ONE");
    questionOne.execute();

    /***
     * Question Two Solution : ARRAY COMPACTION
     */
    System.out.println("Second Question's answer:");

    Question questionTwo = questionFactory.getQuestion("TWO");
    questionTwo.execute();

    /***
     * Question Three Solution : ROTATING AN ARRAY
     */
    System.out.println("Third Question's answer:");

    Question questionThree = questionFactory.getQuestion("THREE");
    questionThree.execute();

    /***
     * Question Fourth Solution : LEAST COMMON MULTIPLE
     */
    System.out.println("Fourth Question's answer:");

    Question questionFourth = questionFactory.getQuestion("FOUR");
    questionFourth.execute();
  }
}
