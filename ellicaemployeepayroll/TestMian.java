/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ellicaemployeepayroll;

/**
 *
 * @author User
 */


public class TestMian {

    public static void main(String[] args) {

       
        
        FullTimeFaculty fullTime = new FullTimeFaculty(
                "FT001",
                "Juan Dela Cruz",
                "Information Technology",
                30000,
                5000
        );

        
        PartTimeFaculty partTime = new PartTimeFaculty(
                "PT001",
                "Maria Santos",
                "Business Administration",
                120,
                150
        );

        
        AdminStaff admin = new AdminStaff(
                "AS001",
                "Pedro Garcia",
                "Finance",
                25000,
                2500
        );

      
        EllicaEmployeePayroll[] employees = {
            fullTime,
            partTime,
            admin
        };

        displayHeader();

       
        for (EllicaEmployeePayroll employee : employees) {
            displayEmployee(employee);
        }

        displaySummary();
    }

   
    public static void displayHeader() {

        System.out.println("==================================================");
        System.out.println("      DON JOSE ECLEO MEMORIAL COLLEGE");
        System.out.println("           EMPLOYEE PAYROLL SYSTEM");
        System.out.println("==================================================");
        System.out.println();
    }

    
    public static void displayEmployee(EllicaEmployeePayroll employee) {

        employee.displayEmployeeInfo();

        switch (employee) {
            case FullTimeFaculty faculty -> faculty.displayFacultyType();
            case PartTimeFaculty faculty -> faculty.displayFacultyType();
            case AdminStaff staff -> staff.displayFacultyType();
            default -> {
            }
        }

        System.out.printf("Salary\t\t: PHP %,.2f%n",
                employee.calculateSalary());

        System.out.println("--------------------------------------------------");
        System.out.println();
    }

   
    public static void displaySummary() {

        System.out.println("==================================================");
        System.out.println("Total Employees: " + EllicaEmployeePayroll.getEmployeeCount());
        System.out.println("==================================================");
    }
}

