package com.company;

public class CommissionEmployeeTest {

    public static void main(String[] args) {
	// write your code here
        CommissionEmployee employee = new CommissionEmployee("Daniel", "Folivi", "111-11-1111", 5000, 0.4);

        System.out.println("Employee Information Based on GET Method");

        System.out.printf("%s: %s%n", "First Name", employee.getFirstName());
        System.out.printf("%s: %s%n", "Last Name", employee.getLastName());
        System.out.printf("%s: %s%n", "Social Security Number", employee.getSocialSecurityNumber());
        System.out.printf("%s: %.2f%n", "Gross Sales", employee.getGrossSales());
        System.out.printf("%s: %.2f%n", "Commission Rate", employee.getCommissionRate());
        System.out.printf("%s: %.2f%n", "Earning", employee.earnings());

        System.out.println("Setting Gross Sales to 7500 and Commission Rate to 0.6");
        employee.setGrossSales(7500);
        employee.setCommissionRate(0.6);

        System.out.printf("%s%n%s", "Updated Employee Information", employee.toString());
    }
}
