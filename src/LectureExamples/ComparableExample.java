package LectureExamples;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        SingleWordCounter to = new SingleWordCounter("to", 0);
        SingleWordCounter cold = new SingleWordCounter("cold", 0);

        String words = "Too wet to go out and too cold to play ball";
        Scanner scan = new Scanner (words);

        while  (scan.hasNext())
        {
            String word = scan.next();
            if (word.equals(to.getWord())){
                to.incCount();
            }
            else if (word.equals(cold.getWord())) {
                cold.incCount();
            }
        }
        scan.close();

        SingleWordCounter[] wordCounts = new SingleWordCounter[2];
        wordCounts[0] = to;
        wordCounts[1] = cold;

        Arrays.sort(wordCounts); // calls compareTo multiple times on each counter internally to actually do the sorting

        for(SingleWordCounter count : wordCounts){
            System.out.println(count.toString());
        }
    }
}
