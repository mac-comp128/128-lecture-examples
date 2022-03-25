package LectureExamples;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args){
        // make some new student instances
        Student sam = new Student("Sam", 2220390);  Student john = new Student("John", 333333);
        Student libby = new Student("Libby", 4444444);

        List<Student> studentList = new ArrayList<Student>();  

        studentList.add(sam);
        studentList.add(john);
        studentList.add(libby);

        // 1. While a familiar approach, this for loop example
        // is not typically what we use to access every element 
        // in a List

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        // // 2. This style is preferred for both efficiency and
        // // elegance of the code itself.
        // // It is ideal for traversal of all elements  or some 
        // // elements until a given one is found

        // for (Student stu : studentList) {  
        //     System.out.println(stu);
        // }

        // // 2a. Using the colon style and repeat until sentinel
        // // to find a desired element.

        // for (Student stu : studentList) {  
        //     if (stu.getID() == 333333) {  
        //         System.out.println(stu);
        //         break;
        //     }
        // }
    
        // // 2b. Using stream
        // studentList.stream().forEach(System.out::println);


        // // 3. Using an Iterator.
        // // Must include java.util.Iterator

        // Iterator iter = studentList.iterator();  
        // while (iter.hasNext()) {
        //     Student stu = (Student) iter.next();  System.out.println(stu);
        // }

        // // 3a. Using an Iterator.
        // // This enables us to change the list while iterating over it.

        // Iterator iter2 = studentList.iterator();  
        // while (iter2.hasNext()) {
        //     Student stu = (Student) iter2.next();  
        //     if (stu.getID() == 333333) {
        //         //	note that using remove on Iterator object is a
        //         //	safe way to remove the element and keep going
        //         iter2.remove();
        //     }
        // }
        // System.out.println("List after removing one student:");  
        // System.out.println(studentList);

    }
}
