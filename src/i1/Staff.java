/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i1;
public class Staff extends Employee {
    private int numberOfProjects;
    private double bonus;

    // Constructor
    public Staff(int id, String name, String departmentName, int numberOfProjects) {
        super(id, name, departmentName);
        this.numberOfProjects = numberOfProjects;
    }

    public int getnop() {
        return this.numberOfProjects;
    }

    double getb() {
        return this.bonus;
    }

    public void calsal() {
        salary = 3000 * numberOfProjects;
    }

    public void calgpf() {
        super.calgpf();
        gpfund = gpfund * (this.numberOfProjects + 8);
    }

    void calbonus() {
        bonus = salary / 2;
    }

    public void displayinfo() {
        super.displayinfo();
        System.out.println("Number of Projects: " + numberOfProjects);
        System.out.println("Bonus: " + bonus);
    }
}
