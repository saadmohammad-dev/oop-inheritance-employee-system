/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i1;

/**
 *
 * @author pc
 */
public abstract class Employee {

    private int id;
    private String name;
    private String departmentName;
    protected double salary;
    private double tax;
    protected double gpfund;

    protected Employee(int id, String n, String dn) {
        this.id = id;
        name = n;
        departmentName = dn;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setdn(String n) {
        this.departmentName = n;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }

    public double getGpfund() {
        return gpfund;
    }

    protected abstract void calsal();

    public void caltax() {
        tax = salary * 0.03;
    }

    protected void calgpf() {
        gpfund = this.salary * 12;
    }

    protected void displayinfo() {
        System.out.println("\nName: " + name);
        System.out.println("Department: " + departmentName);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
        System.out.println("GP Fund: " + gpfund);
    }

}
