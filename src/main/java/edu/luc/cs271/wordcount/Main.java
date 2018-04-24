package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // complete this main program
    // 1. create a WordCounter instance

    Map<String, Integer> topten = new HashMap<>();

    WordCounter counttop = new WordCounter(topten);

    // 2. use this to count the words in the input
    counttop.countWords(input);

    // 3. determine the size of the resulting map
    int amtwords = counttop.getCounts().size();

    // 4. create an ArrayList of that size and
    List<Map.Entry<String, Integer>> ordertopten = new ArrayList<>(amtwords);

    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    ordertopten.addAll(topten.entrySet());

    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
    Collections.sort(ordertopten, new DescendingByCount());

    // 7. print the (up to) ten most frequent words in the text
    if (ordertopten.size() > 10) {
      for (int i = 0; i < 10; i++) {
        System.out.println(ordertopten.get(i));
      }
    } else {
      for (int i = 0; i < ordertopten.size(); i++) {
        System.out.println(ordertopten.get(i));
      }
    }
  }
}
