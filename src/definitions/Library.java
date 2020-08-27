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
        return namesOfBooksAvailable.clone();
    }

    public void setNamesOfBooksAvailable(Book[] namesOfBooksAvailable) {
        this.namesOfBooksAvailable = namesOfBooksAvailable;
    }
    public Library() {
        Book[] namesOfBooksAvailable = new Book[10];
        for (int i = 0; i < namesOfBooksAvailable.length; i++) {
            namesOfBooksAvailable[i] =
                    new Book("malgudi days" ,
                            " ruskin bond" , "5678");
        }
        this.namesOfBooksAvailable=namesOfBooksAvailable;
    }
}
