package _3_Working_With_Text;

/* 1. Model a Person with a first name and last name and ensure that even if the first name is
entered all lowercase, it will be stored all uppercase. */

import java.time.LocalDate;

public class Person {
  private String firstName;
  private String lastName;
  private LocalDate dob;

  public Person(String firstName, String lastName, LocalDate dob) {
    this.firstName = firstName.toUpperCase();
    this.lastName = lastName;
    this.dob = dob;
  }

  public String getFirstName() {
    return this.firstName.toUpperCase();
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDob() {
    return this.dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String toString() {
    return "Person:\n" +
            "firstName: " + firstName + "\n" +
            "lastName: " + lastName + "\n" +
            "dob: " + dob;
  }

  public static void main(String[] args) {
    Person james = new Person("james", "Harden", LocalDate.of(1987, 5, 23));
    System.out.println(james);
  }
}
