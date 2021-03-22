package LectureExamples;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        SingleWordCounter the = new SingleWordCounter("the", 0);
        SingleWordCounter bret = new SingleWordCounter("bret", 0);

        String words = "Bret the quick brown fox jumped over the lazy dog";
        Scanner scan = new Scanner (words);

        while  (scan.hasNext())
        {
            String word = scan.next();
            if (word.equals(the.getWord())){
                the.incCount();
            }
            else if (word.equals(bret.getWord())) {
                bret.incCount();
            }
        }
        scan.close();

        SingleWordCounter[] wordCounts = new SingleWordCounter[2];
        wordCounts[0] = the;
        wordCounts[1] = bret;

        Arrays.sort(wordCounts); // calls compareTo multiple times on each counter internally to actually do the sorting

        for(SingleWordCounter count : wordCounts){
            System.out.println(count.toString());
        }
    }
}
