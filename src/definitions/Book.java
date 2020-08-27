/*  Created by IntelliJ IDEA.
 *  User: Mukul Agarawal (Mukul-12)
 *  Date: 25/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitIsbnNumber;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getThirteenDigitIsbnNumber() {
        return thirteenDigitIsbnNumber;
    }

    public void setThirteenDigitIsbnNumber(String thirteenDigitIsbnNumber) {
        this.thirteenDigitIsbnNumber = thirteenDigitIsbnNumber;
    }

    public Book() {
        bookName = "Engineering Chemistry";
        authorName = "Shashi chawla";
        thirteenDigitIsbnNumber = "970-7-16-452641-4";
    }

    public Book(String bookName, String authorName, String thirteenDigitIsbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.thirteenDigitIsbnNumber = thirteenDigitIsbnNumber;
    }

    public String toString() {
        return String.format("Book Name: %s, Author Name: %s, ISBN Number: %s", getBookName(), getAuthorName(), getThirteenDigitIsbnNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getThirteenDigitIsbnNumber(), book.getThirteenDigitIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getThirteenDigitIsbnNumber());
    }
}
