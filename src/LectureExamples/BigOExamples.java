package LectureExamples;

public class BigOExamples {

    //o(1)
    public void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array [right] = temp;
    }

    //Total growth function 3(2n+2)
    //O(n)
    public void sum(int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) // 2n+2
            sum += j;
        for (int k = 0; k < n; k++) // 2n+2
            sum += k;
        for (int l = 0; l < n; l++) //2n+2
            sum += l;
    }

    //Total growth: (2n+2)(2n+2) + 2n+2
    // O(n^2)
    public void sum2(int n){
        int sum =0; //1
        for (int j = 0; j < n; j++) //2n+2
            for (int k = 0; k < n; k++) //2n+2
                sum += k + j; //1
        for (int l = 0; l < n; l++) //2n+2
            sum += l; //1
    }

    //O(n^2)
    public void print(int[] array){
        for(int i=array.length; i > 0; i--) {
            for(int j=0; j < i; j++) {
                System.out.println(j);
            }
        }
    }
    
    // O(logn)
    public void count(int n){
        int count = 1;
        while (count < n){
            count *=2;
        }
    }

    // O(nlogn)
    public void test(int[] array) {
        for(int i=array.length; i > 0; i /= 2){ // 2^k = n where k is the number of iterations, solve for k -> logn
            for (int k = 0; k < array.length; k = k + 2){ //n/2 -1
                System.out.println(k);
            }
        }
    }

    //O(n^2)
    public void swapSmallest(int[] array){
        int n = array.length;
        for (int top = 0; top < n - 1; top++) {
            int smallestIndex = top;
            for (int index = top; index < n; index++) {
                if(array[index] < array[smallestIndex])
                    smallestIndex = index;
            }
            // Swap smallest to the top index
            swap(array, top, smallestIndex);
        }
    }

    // empty loop example
    public void sum3(int n) {
        int sum = 0;
        for (int j = 0; j < n; j++){
            //sum += j;
        } 
    }


   // recusion example, and iterative example comparison 
   // Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
   // O(n) 
   public int iterativeFib(int n) {
        int fib = 0;
        int a = 1;
        for(int i=0; i<n; i++) {
            fib = fib + a;
            a = fib;
        }
        return fib;
    }

    // O(2^n)
    public int recursiveFib(int n){
    if (n <= 1)
       return n;
    return recursiveFib(n-1) + recursiveFib(n-2);
    }

    
}
