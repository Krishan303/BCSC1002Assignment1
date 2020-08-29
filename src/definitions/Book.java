/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String bookIsbnNumber;

    public Book(String bookName, String bookAuthorName, String bookIsbnNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookIsbnNumber = bookIsbnNumber;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getBookAuthorName(), book.getBookAuthorName()) &&
                Objects.equals(getBookIsbnNumber(), book.getBookIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthorName(), getBookIsbnNumber());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookIsbnNumber='" + bookIsbnNumber + '\'' +
                '}';
    }
}

