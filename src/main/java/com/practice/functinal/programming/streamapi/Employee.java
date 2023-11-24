package com.practice.functinal.programming.streamapi;

public class Employee {

    private Long employeeId;

    private String firstName;

    private String lastName;

    private String emailId;

    private int age;

    public Employee (){

    }
    public Employee(Long employeeId, String firstName, String lastName, String emailId,int age) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.age = age;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
