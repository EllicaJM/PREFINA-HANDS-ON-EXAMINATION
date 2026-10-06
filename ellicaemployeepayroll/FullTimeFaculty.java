/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ellicaemployeepayroll;

/**
 *
 * @author User
 */

    public class FullTimeFaculty extends EllicaEmployeePayroll {

    private double monthlySalary;
    private double allowance;

 
    public FullTimeFaculty(String employeeID, String name,
                           String department, double monthlySalary,
                           double allowance) {

        super(employeeID, name, department);

        this.monthlySalary = monthlySalary;
        this.allowance = allowance;
    }

   
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

   
    @Override
    public double calculateSalary() {
        return monthlySalary + allowance;
    }

    
    public void displayFacultyType() {
        System.out.println("Employee Type\t: Full-Time Faculty");
    }
}
