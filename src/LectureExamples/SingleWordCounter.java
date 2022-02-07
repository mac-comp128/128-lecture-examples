package LectureExamples;

public class SingleWordCounter implements Comparable<SingleWordCounter> {
    private String word;
    private int count;

    public SingleWordCounter(String word, int count){
        this.word = word;
        this.count = count;
    }

    public String getWord(){
        return word;
    }

    public void incCount(){
        count++;
    }

    public String toString(){
        return word + ": " + count;
    }

    public int compareTo(SingleWordCounter other){
        if (this.count < other.count){
            return -1;
        }
        else if (this.count > other.count){
            return 1;
        }
        else{
            return this.word.compareTo(other.word);
        }
        // if (this.count != other.count){
        //     return this.count - other.count;
        // }
        // else {
        //     return this.word.compareTo(other.word);
        // }
    }
}
