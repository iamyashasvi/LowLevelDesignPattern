package com.example.lowleveldesignpattern.StructuralPattern.Proxy;

public class EmployeeManagementMainClass {
    public static void main(String[] args) {
        System.out.println("Going to start proxy design");

        // Change the clientRole, then access perimission will get changed.
        final String clientRole = "ADMIN";
        EmployeeDaoProxy emplProxy = new EmployeeDaoProxy(clientRole);

        try{
            emplProxy.getEmployeeInfo(1);
            emplProxy.createEmployeeInfo(new EmployeeDaoConcrete());
        } catch (RuntimeException e) {
            System.out.println("Run time exception occured " + e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Generic exception occured " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
