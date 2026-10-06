/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ellicaemployeepayroll;

/**
 *
 * @author User
 */

    

public class AdminStaff extends EllicaEmployeePayroll {

    private double basicSalary;
    private double overtimePay;

    // Constructor
    public AdminStaff(String employeeId, String name,
                      String department, double basicSalary,
                      double overtimePay) {

        super(employeeId, name, department);

        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }

    // Getters and Setters
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    // Method Overriding
    @Override
    public double calculateSalary() {
        return basicSalary + overtimePay;
    }

    // Employee Type
    public void displayFacultyType() {
        System.out.println("Employee Type\t: Administrative Staff");
    }
}

