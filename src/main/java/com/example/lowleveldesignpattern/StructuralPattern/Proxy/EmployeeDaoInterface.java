package com.example.lowleveldesignpattern.StructuralPattern.Proxy;

public interface EmployeeDaoInterface {
    public void getEmployeeInfo(int empId);
    public void createEmployeeInfo(EmployeeDaoInterface obj);
}
