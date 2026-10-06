/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ellicaemployeepayroll;

/**
 *
 * @author User
 */

  

public abstract class EllicaEmployeePayroll {

    private String employeeID;
    private String name;
    private String department;

    private static int employeeCount = 0;

    
    public EllicaEmployeePayroll() {
        employeeCount++;
    }

   
    public EllicaEmployeePayroll(String employeeID, String name, String department) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        employeeCount++;
    }

    // Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

   
    public abstract double calculateSalary();

    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID\t: " + employeeID);
        System.out.println("Name\t\t: " + name);
        System.out.println("Department\t: " + department);
    }

  
    public void displayEmployeeInfo(boolean showSalary) {
        displayEmployeeInfo();

        if (showSalary) {
            System.out.printf("Salary\t\t: PHP %,.2f%n", calculateSalary());
        }
    }

  
    public static int getEmployeeCount() {
        return employeeCount;
    }
}

