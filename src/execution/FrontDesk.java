/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book("science", "o henry" , " 1234");
        Student student = new Student();
        student.setStudentName("Krishan");
        System.out.println(student.getStudentName());

    }
}
