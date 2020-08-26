/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] namesOfBooksAvailable;

    public Book[] getNamesOfBooksAvailable() {
        return namesOfBooksAvailable;
    }

    public void setNamesOfBooksAvailable(Book[] namesOfBooksAvailable) {
        this.namesOfBooksAvailable = namesOfBooksAvailable;
    }
}
