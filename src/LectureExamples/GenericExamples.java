package LectureExamples;

public class GenericExamples {
    public static void main(String[] args){
        char[] chars = {'a','b','c'};
        String str = new String(chars);
        System.out.print(str);



        // instance of Integer type
        Test <Integer> intObjects = new Test<Integer>(15);
        System.out.println(intObjects.getObject());
   
        // instance of String type
        Test <String> strObjects = new Test<String>("TestingStrings");
        System.out.println(strObjects.getObject());


    }
}

class Test<T> {
    // An object of type T is declared
    T object;
    // constructor
    Test(T object) {
          this.object = object;  
    }  
    public T getObject() {
        return this.object; 
    }
}
 