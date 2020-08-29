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
        do {
            System.out.println("-=-=--=-=-\"Welcome to the Front Desk\"-=-=--=-=-");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice from 1 to 4");
            userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Please enter your First name : ");
                    name = scanner.nextLine();
                    System.out.println("Please enter your University Roll Number : ");
                    rollNumber = scanner.nextLong();
                    System.out.println("Please choose any one book : ");
                    for (Book book1 : library.getCurrentlyAvailableBooks()) {
                        System.out.println(book1);
                    }
                    System.out.println();
                    scanner.nextLine();
                    choice = scanner.nextLine();
                    System.out.println("This " + choice + " is issue for " + name + " having University RollNo. is " + rollNumber);
                    System.out.println();
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Please enter your First name : ");
                    name = scanner.nextLine();
                    System.out.println("Please enter your University Roll Number : ");
                    rollNumber = scanner.nextLong();
                    System.out.println("Please enter a book name do you want to Return : ");
                    scanner.nextLine();
                    choice = scanner.nextLine();
                    student.returnIssueBook(choice, name);
                    System.out.println();
                    break;
                case SHOW_ALL_ISSSUE_BOOKS:
                    System.out.println("Please enter your First name : ");
                    name = scanner.nextLine();
                    System.out.println("Please enter your University Roll Number : ");
                    rollNumber = scanner.nextLong();
                    student.showAllIssueBook();
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        } while (userInput < EXIT);
        scanner.close();
    }
}
