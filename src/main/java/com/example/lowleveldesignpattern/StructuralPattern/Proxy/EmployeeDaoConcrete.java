package com.example.lowleveldesignpattern.StructuralPattern.Proxy;

public class EmployeeDaoConcrete implements EmployeeDaoInterface{
    @Override
    public void getEmployeeInfo(int empId) {
        System.out.println("Get employee info getEmployeeInfo");
    }

    @Override
    public void createEmployeeInfo(EmployeeDaoInterface obj) {
        System.out.println("Create employee info createEmployeeInfo");
    }
}
