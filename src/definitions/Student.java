/*  Created by IntelliJ IDEA.
 *  User: Mukul Agarawal (Mukul-12)
 *  Date: 25/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    Book[] namesOfBooksIssued;
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
        this.namesOfBooksIssued = new Book[3];
        for (int Index = 0; Index < namesOfBooksIssued.length; Index++) {
            namesOfBooksIssued[Index] = new Book("Book " + (Index + 1));
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
        return namesOfBooksIssued.clone();
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.namesOfBooksIssued = nameOfBooksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfBooksIssued=" + Arrays.toString(namesOfBooksIssued) +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBookIssued=" + numberOfBookIssued +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getNumberOfBookIssued() == student.getNumberOfBookIssued() &&
                Arrays.equals(getNameOfBooksIssued(), student.getNameOfBooksIssued()) &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getUniversityRollNumber(), student.getUniversityRollNumber());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNumberOfBookIssued());
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssued());
        return result;
    }

    /**
     * This method print a name of return book and who return it.
     *
     * @param choice store return name of Book.
     * @param name   store name of user who return  the book.
     **/
    public void returnIssueBook(String choice, String name) {
        System.out.println("This " + choice + " is returned by " + name + ".");
    }

    /**
     * THis method will provide random book name of any student.
     **/
    public void showAllIssueBook() {
        for (int Index = 0; Index < 3; Index++) {
            System.out.println("Book " + (int) (Math.random() * 10));
        }
    }
}
