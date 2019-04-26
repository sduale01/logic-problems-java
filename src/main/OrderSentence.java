package main;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderSentence {
  public static String order(String words) {
    // if words is empty stops the method here
    if (words == "") {
      return "";
    }
    ArrayList<String> nums = new ArrayList<String>(9);
    // populate nums array
    for (int i = 1; i < 10; i++) {
      nums.add(Integer.toString(i));
    }

    // separate string sentece. make each word an array value
    ArrayList<String> unorderredWords = new ArrayList<String>(Arrays.asList(words.split(" ")));
    
    // order words by accending numbers
    ArrayList<String> orderedWords = new ArrayList<String>();
    for (int i = 0; i < nums.size(); i++) {
      for (int j = 0; j < unorderredWords.size(); j++) {
        if (unorderredWords.get(j).contains(nums.get(i))) {
          orderedWords.add(unorderredWords.get(j));
        }
      }
    }

    // join the array to make it a string sentence separated by commas
    String joinWords = String.join(" ", orderedWords);
    return joinWords;
  }
}
