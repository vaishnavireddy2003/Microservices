package com.s;

public class SRPMain {
	public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101);
        Payroll payroll = new Payroll();
        payroll.processSalary(emp, 5000.0);
    }
}
