package main;

import java.util.ArrayList;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    text = text.toLowerCase();
    ArrayList<String> dups = new ArrayList<String>();
    for(int i = 0; i < text.length(); i++) {
      for(int j = i + 1; j < text.length(); j++) {
        if ((text.charAt(i) == text.charAt(j)) && !(dups.contains(Character.toString(text.charAt(i))))){
          String s = Character.toString(text.charAt(i));
          dups.add(s);
        }
      }
    }
    System.out.println(dups);
    return dups.size();
  }
}