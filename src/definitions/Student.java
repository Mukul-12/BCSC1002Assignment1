/*  Created by IntelliJ IDEA.
 *  User: Mukul Agarawal (Mukul-12)
 *  Date: 25/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    Book[] nameOfBooksIssued;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long universityRollNumber;
    private int numberOfBookIssued;

    public Student() {
        firstName = "Aakash";
        middleName = "Kumar";
        lastName = "Singh";
        universityRollNumber = 191700789L;
        numberOfBookIssued = 3;
        this.nameOfBooksIssued = new Book[3];
        for (int Index = 0; Index < nameOfBooksIssued.length; Index++) {
            nameOfBooksIssued[Index] = new Book("Book " + (Index + 1));
        }
    }

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued.clone();
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfBooksIssued=" + Arrays.toString(nameOfBooksIssued) +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBookIssued=" + numberOfBookIssued +
                '}';
    }
}
