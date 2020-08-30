/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String studentFirstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBookStored;
    private Book[] namesOfBooksIssuedByStudents;

    public Student() {
        this.studentFirstName = getStudentFirstName();
        this.middleName = getMiddleName();
        this.lastName = getLastName();
        this.universityRollNumber = getUniversityRollNumber();
        this.numberOfBookStored = getNumberOfBookStored();
        this.namesOfBooksIssuedByStudents = new Book[1];
        for (int i = 0; i < namesOfBooksIssuedByStudents.length; i++) {
            namesOfBooksIssuedByStudents[i]
                    = new Book("Let us C , JavaTm ", "Prashant Karnetkar , James Gosling ", "1234 ,5678 ");
        }
    }

    public Student(Book[] namesOfBooksIssuedByStudents) {
        this.namesOfBooksIssuedByStudents = namesOfBooksIssuedByStudents;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Book[] getNamesOfBooksIssuedByStudents() {
        return namesOfBooksIssuedByStudents.clone();
    }

    public void setNamesOfBooksIssuedByStudents(Book[] namesOfBooksIssuedByStudents) {
        this.namesOfBooksIssuedByStudents
                = namesOfBooksIssuedByStudents;
    }

    /**
     * This method shows us the number of books issued by a student
     */
    public void booksIssued() {
        for (Book bookNames : namesOfBooksIssuedByStudents) {
            System.out.println(bookNames);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBookStored() == student.getNumberOfBookStored() &&
                Objects.equals(getStudentFirstName(), student.getStudentFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getNamesOfBooksIssuedByStudents(), student.getNamesOfBooksIssuedByStudents());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNumberOfBookStored());
        result = 31 * result + Arrays.hashCode(getNamesOfBooksIssuedByStudents());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", MiddleName='" + middleName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBookStored=" + numberOfBookStored +
                ", namesOfBooksIssuedByStudents=" + Arrays.toString(namesOfBooksIssuedByStudents) +
                '}';
    }

    /**
     * This method helps to store student details
     */
    public void getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        studentFirstName = scanner.nextLine();
        System.out.println("Enter Middle Name");
        middleName = scanner.nextLine();
        System.out.println("Enter Last Name");
        lastName = scanner.nextLine();
        System.out.println("Enter university Roll number");
        universityRollNumber = scanner.nextLong();
        System.out.println("Your Name Is = " + studentFirstName + " " + middleName + " "
                + lastName);
        System.out.println("Your University Roll Number is = " + universityRollNumber);
    }
}



