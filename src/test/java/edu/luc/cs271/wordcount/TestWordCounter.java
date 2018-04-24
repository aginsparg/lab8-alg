package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter fixture;

  @Before
  public void setUp() {
    // create the SUT instance

    Map<String, Integer> testmap = new HashMap<>();
     fixture = new WordCounter(testmap);
  }

  @After
  public void tearDown() {
    fixture = null; // set the SUT instance to null
  }

  @Test
  public void testGetCountEmpty() {

    // verify that the SUT initially returns an empty map


    assertEquals(true, fixture.getCounts().isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {

          Iterator<String> wordList = Arrays.asList("asdf", "oiu", "qwer", "asdf").iterator();
          fixture.countWords(wordList);
          assertEquals(false, fixture.getCounts().isEmpty());
          assertEquals(2, fixture.getCount("asdf"));
          assertEquals(1, fixture.getCount("qwer"));
          assertEquals(3, fixture.getCounts().size());

          Iterator<String> wordList2 = Arrays.asList("dog", "cat", "dog").iterator();
          fixture.countWords(wordList2);
          assertEquals(5, fixture.getCounts().size());

          try {
              fixture.getCount("apple");
              fixture.getCount("banana");
              fail("java.lang.NullPointerException expected");
          } catch (final NullPointerException ex) {
              // exception occurred => all good
          }
  }
}
