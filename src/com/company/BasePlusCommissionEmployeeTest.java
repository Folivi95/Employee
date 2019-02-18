package com.company;

public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args)
    {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Joshua", "Folivi","222-22-2222",10000,0.5,1000);

        System.out.println("Employee Information Based on GET Method");

        System.out.printf("%s: %s%n", "First Name", employee.getFirstName());
        System.out.printf("%s: %s%n", "Last Name", employee.getLastName());
        System.out.printf("%s: %s%n", "Social Security Number", employee.getSocialSecurityNumber());
        System.out.printf("%s: %.2f%n", "Gross Sales", employee.getGrossSales());
        System.out.printf("%s: %.2f%n", "Commission Rate", employee.getCommissionRate());
        System.out.printf("%s: %.2f%n", "Earning", employee.earnings());

        System.out.println("Setting Base Salary to 2500");
        employee.setBaseSalary(2500);

        System.out.printf("%s%n%s", "Updated Employee Information", employee.toString());
    }
}
