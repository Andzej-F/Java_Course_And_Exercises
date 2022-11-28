package _2_Gettting_Started_With_Java;

import java.time.LocalDate;

public class Person {
  private String firstName;
  private String lastName;
  public LocalDate dob;

  public Person(String firstName, String lastName, LocalDate dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
  }

  public String getFirstName() {
    return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  @Override
  public String toString() {
    return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", dob=" + dob +
            '}';
  }
}
