/*  Created by IntelliJ IDEA.
 *  User: Krishan Chandra Pandey
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] namesOfBooksAvailable;

    public Library() {
        this.namesOfBooksAvailable = new Book[10];
        for (int i = 0; i < namesOfBooksAvailable.length; i++) {
            namesOfBooksAvailable[i] =
                    new Book("malgudi days",
                            " ruskin bond", "5678");
        }
    }

    public Library(Book[] namesOfBooksAvailable) {
        this.namesOfBooksAvailable = namesOfBooksAvailable;
    }

    public Book[] getNamesOfBooksAvailable() {
        return namesOfBooksAvailable.clone();
    }

    public void setNamesOfBooksAvailable(Book[] namesOfBooksAvailable) {
        this.namesOfBooksAvailable = namesOfBooksAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getNamesOfBooksAvailable(), library.getNamesOfBooksAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getNamesOfBooksAvailable());
    }

    @Override
    public String toString() {
        return "Library{" +
                "namesOfBooksAvailable=" + Arrays.toString(namesOfBooksAvailable) +
                '}';
    }

    /**
     * This method adds a new book to the library
     *
     * @param name The name of book to be added.
     */
    public void addBook(String name) {
        System.out.println(name + " was added to library ");
    }

}
