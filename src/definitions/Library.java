/*  Created by IntelliJ IDEA.
 *  User: Mukul Agarawal (Mukul-12)
 *  Date: 25/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    Book[] currentlyAvailableBooks;

    public Library() {
        this.currentlyAvailableBooks = new Book[9];
        for (int Index = 0; Index < currentlyAvailableBooks.length; Index++) {
            currentlyAvailableBooks[Index] = new Book("Book " + (Index + 1), "Author " + (Index + 1), "978-7-16-452-641-" + (Index + 1));
        }
    }

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks.clone();
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyAvailableBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailableBooks(), library.getCurrentlyAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailableBooks());
    }
}
