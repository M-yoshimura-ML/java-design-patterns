package com.company.structural.adapter;

public class Main {

    public static void main(String[] args) {
        /* using class/Two-way adapter */
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        /* Using Object Adapter */
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(employee);
        String card2 = designer.designCard(adapter2);
        System.out.println(card2);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York city");
    }
}

