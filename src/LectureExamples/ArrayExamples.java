package LectureExamples;

public class ArrayExamples {

    public static void main(String[] args){
        // Declare and initialize an array of 10 String object
        String[] words = new String[10];

        // Element data type

        // Set position zero to hold "Dumpling"
        words[0] = "Dumpling";

        System.out.println();
        // Print the string at position zero
        System.out.println(words[0]);
        // Not initialized element has null
        System.out.println(words[1]);    
        

        // Initializer list 
        int[] units = {147, 323, 89, 933, 540, 269, 97, 114, 298, 476};


        // Loop over the array and print each string.
        // Note the use of words.length field to get the current length of the array
        for(int i = 0; i < words.length; i++ ){
            //System.out.println(words[i]);
        }

        // For each looping style also works
        for (String word : words){
            System.out.println(word);
        }

        // You can also create arrays of arrays  
        double[][] matrix = new double[4][4];
        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = i*j;
            }
        }

        // Array can also be multidimensional - like three dimension array to represent an image matrix with color, or sometimes spatial information, when you want to represent x,y,z coordinates 
        int[][][] image_matrix = new int[5][5][3]; // a 5x5 image with rgb colors 
        for(int i = 0; i < image_matrix.length; i++ ){
            for(int j = 0; j < image_matrix[i].length; j++ ){
                for(int k = 0; k < image_matrix[i][j].length; k++){
                    image_matrix[i][j][k] = 50;
                }
            }
        }

    }
}