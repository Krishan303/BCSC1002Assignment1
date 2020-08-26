/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName;
    private long universityRollNumber;
    private int numberOfBookStored;
    private Book[] namesOfBooksIssuedByStudents;

    public Student() {
        this.studentName = getStudentName();
        this.universityRollNumber = getUniversityRollNumber();
        this.numberOfBookStored = getNumberOfBookStored();
        this.namesOfBooksIssuedByStudents = new Book[10];
        for (int i = 0; i < namesOfBooksIssuedByStudents.length; i++) {


        }

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBookStored() {
        return numberOfBookStored;
    }

    public void setNumberOfBookStored(int numberOfBookStored) {
        this.numberOfBookStored = numberOfBookStored;
    }

    public Book[] getNamesOfBooks() {
        return namesOfBooksIssuedByStudents;
    }

    public void setNamesOfBooks(Book[] nameOfBook) {
        this.namesOfBooksIssuedByStudents
                = namesOfBooksIssuedByStudents;
    }
}

