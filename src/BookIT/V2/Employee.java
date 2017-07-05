/*
Author: Kyle Porter
Date: 6/20/17
Assignment: CIS 484 Group Project
Purpose: Employee entity class
 */
package BookIT.V2;

import BookIT.*;

/**
 *
 * @author KP
 */
public class Employee {

    private int empID;
    private String fName;
    private String lName;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String cell;
    private String userName;
    private String password;
    private double empWage;
    private double otWage = empWage* 1.5;
    private String empType;
    public static int empCount;

    // constructor
    public Employee() {
        empID = 0;
        fName = "";
        lName = "";
        street = "";
        city = "";
        state = "";
        zipCode = 0;
        cell = "";
        userName = "";
        password = "";
        empWage = 0.0;
        otWage = 0.0;
        empType = "";
        empCount = 1;

    }

    public Employee(String fName, String lName, String street, String city,
            String state, int zipCode, String cell, String userName,
            String password, double empWage, double otWage, String type)
    {
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cell = cell;
        this.userName = userName;
        this.password = password;
        this.empWage = empWage;
        this.otWage = otWage;
        this.empType = type;
        empID = empCount++;

    }
    
    //loading an employee from the database
    public Employee(int empID, String fName, String lName, String street,
                        String city, String state, int zipCode, String cell,
                        String username, String password, double empWage, 
                        double otWage, String empType)
    {
        this.empID = empID;
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cell = cell;
        this.userName = username;
        this.password = password;
        this.empWage = empWage;
        this.empType = empType;
        
    }

    public int getEmpID() {
        return this.empID;
    }
    public int setEmpID()
    {
        return this.empID;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String name) {
        this.fName = name;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String name) {
        this.lName = name;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zip) {
        this.zipCode = zip;
    }

    public String getCell() {
        return this.cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public double getWage()
    {
        return this.empWage;
    }
    
    public void setWage(double wage)
    {
        this.empWage = wage;
    }
    public double getOtWage()
    {
        return this.empWage;
    }
    
    public void setOtWage(double wage)
    {
        this.empWage = wage;
    }
    
    public String getType()
    {
        return this.empType;
    }
    
    public void setType(String type)
    {
        this.empType = type;
    }

  
    

    @Override
    public String toString(){
        return "First Name: " + fName
                + ", \tLast Name: " + lName 
                + ", \tStreet: " + street 
                + ", \tCity: " + city 
                + ", \tState: " + state 
                + ", \tZipCode: " + zipCode 
                + ", \tCell: " + cell 
                + ", \tUsername: " + userName 
                + ", \tpassword: " + password 
                + ", \tWage: " + empWage 
                + ", \tWage: " + otWage 
                + ", \tType: " + empType;
    }
}