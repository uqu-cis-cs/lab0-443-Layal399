/***** DO NOT ATTEMPT To CHANGE ANY CODE LINES ****/
package edu.uqu.cs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.StringContains;
import org.junit.Test;

/**
 * Unit test for lab 0.
 */
public class AppTest {

    @Test
    public void tc1() {
        //String input = "";
        //ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        //System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        App.twisters();

        String actual = baos.toString();
        String expected = "1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11 TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle ";
        
        MatcherAssert.assertThat(
            String.format("Output should contain: %s\n", expected),
            actual.toLowerCase(),
            new StringContains(expected.toLowerCase()));
       }
    
    @Test
     public void tc2() {
         String input = "calling batman";
         ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
         System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        App.phoneKeypad("calling batman");

        String actual = baos.toString();
        String expected = "2255464228626";
        
        MatcherAssert.assertThat(
            String.format("Output should contain: %s\n", expected),
            actual.toLowerCase(),
            new StringContains(expected.toLowerCase()));
       }

       @Test
      public void tc3() {
         String input = "calling minions";
         ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
         System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        App.phoneKeypad("calling minions");

        String actual = baos.toString();
        String expected = "22554646464667";
        
        MatcherAssert.assertThat(
            String.format("Output should contain: %s\n", expected),
            actual.toLowerCase(),
            new StringContains(expected.toLowerCase()));
       }

       @Test
      public void tc4() {
         String input = "0";
         ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
         System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        App.phoneKeypad("0");

        String actual = baos.toString();
        String expected = "";
        
        MatcherAssert.assertThat(
            String.format("Output should contain: %s\n", expected),
            actual.toLowerCase(),
            new StringContains(expected.toLowerCase()));
       }

       @Test
      public void tc5() {
         String input = "0596123456";
         ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
         System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        
        App.phoneKeypad("0596123456");

        String actual = baos.toString();
        String expected = "";
        
        MatcherAssert.assertThat(
            String.format("Output should contain: %s\n", expected),
            actual.toLowerCase(),
            new StringContains(expected.toLowerCase()));
       }
}
