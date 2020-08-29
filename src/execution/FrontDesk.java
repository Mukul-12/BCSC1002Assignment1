/*  Created by IntelliJ IDEA.
 *  User: Mukul Agarawal (Mukul-12)
 *  Date: 25/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_ISSSUE_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        int userInput;
        String choice;
        String name;
        long rollNumber;
        Book book = new Book();
        Student student = new Student();
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
}
