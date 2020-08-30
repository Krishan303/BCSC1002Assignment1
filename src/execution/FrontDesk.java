/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_MY_ISSUED_BOOK = 3;
    private static final int EXIT = 4;


    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int clientInput;
        Library library = new Library();
        Student student = new Student();
        student.getStudentDetails();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice");
            clientInput = scannerObject.nextInt();
            switch (clientInput) {
                case ISSUE_A_NEW_BOOK:
                    System.out.println("Enter the Book Name you want to issue");
                    scannerObject.nextLine();
                    String bookName = scannerObject.nextLine();
                    library.issueBook(bookName);
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Enter The Book name you want to return");
                    scannerObject.nextLine();
                    String returnBookName = scannerObject.nextLine();
                    library.doReturn(returnBookName);
                    break;
                case SHOW_ALL_MY_ISSUED_BOOK:
                    student.booksIssued();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        } while (clientInput != EXIT);
        scannerObject.close();
    }
}
