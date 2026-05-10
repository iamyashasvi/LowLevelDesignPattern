package com.example.lowleveldesignpattern.StructuralPattern.Proxy;

public class EmployeeDaoProxy implements EmployeeDaoInterface{

    private String clientRole;
    private EmployeeDaoConcrete emploObj;

    public EmployeeDaoProxy(String clientRole){
        this.clientRole = clientRole;
        emploObj = new EmployeeDaoConcrete();
    }

    @Override
    public void getEmployeeInfo(int empId) {
        if(clientRole.equals("ADMIN") || clientRole.equals("user")){
            emploObj.getEmployeeInfo(empId);
        } else {
            throw new RuntimeException("User is undefined");
        }
    }

    @Override
    public void createEmployeeInfo(EmployeeDaoInterface obj) {
        if(clientRole.equals("ADMIN")){
            emploObj.createEmployeeInfo(obj);
        } else {
            throw new RuntimeException("ClientRole must have ADMIN role");
        }
    }
}
