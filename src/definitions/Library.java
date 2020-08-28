/*  Created by IntelliJ IDEA.
 *  User: Mukul Agarawal (Mukul-12)
 *  Date: 25/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    Book[] currentlyAvailableBooks;

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks.clone();
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Library() {
        this.currentlyAvailableBooks = new Book[10];
        for (int Index = 0; Index < currentlyAvailableBooks.length; Index++) {
            currentlyAvailableBooks[Index] = new Book("Book " + (Index + 1));
        }
    }

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }
}
