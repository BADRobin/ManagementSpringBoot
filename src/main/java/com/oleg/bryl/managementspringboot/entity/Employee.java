package com.oleg.bryl.managementspringboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "date_of_hiring")
    private String dateOfHiring;
    @Column(name = "position")
    private String position;
    @Column(name = "the_salary")
    private String theSalary;

    public Employee() {
    }
    /**
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param middleName
     * @param dateOfBirth
     * @param dateOfHiring
     * @param position
     * @param theSalary
     */
    public Employee(int id, String firstName, String lastName, String middleName, String dateOfBirth, String dateOfHiring, String position, String theSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.position = position;
        this.theSalary = theSalary;
    }
    /**
     *
     * @param firstName
     * @param lastName
     * @param middleName
     * @param dateOfBirth
     * @param dateOfHiring
     * @param position
     * @param theSalary
     */
    public Employee(String firstName, String lastName, String middleName, String dateOfBirth, String dateOfHiring, String position, String theSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.position = position;
        this.theSalary = theSalary;
    }
    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfHiring() {
        return dateOfHiring;
    }
    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getTheSalary() {
        return theSalary;
    }
    public void setTheSalary(String theSalary) {
        this.theSalary = theSalary;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", position='" + position + '\'' +
                ", theSalary='" + theSalary + '\'' +
                '}';
    }
}
