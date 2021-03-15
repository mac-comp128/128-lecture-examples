package LectureExamples;

public class ArrayExamples {

    public static void main(String[] args){
        // Declare and initialize an array of 10 String object
        String[] words = new String[10];

        // Set position zero to hold "Bret"
        words[0] = "Bret";

        // Print the string at position zero
        System.out.println(words[0]);

        // Loop over the array and print each string.
        // Note the use of words.length field to get the current length of the array
        for(int i = 0; i < words.length; i++ ){
            System.out.println(words[i]);
        }

        // For each looping style also works
        for (String word : words){
            System.out.println(words[0]);
        }

        // You can also create arrays of arrays
        double[][] matrix = new double[4][4];
        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = i*j;
            }
        }

    }
}