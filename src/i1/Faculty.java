/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i1;
public class Faculty extends Employee {

    private int numberOfResearchPublications;

    public Faculty(int id, String name, String departmentName, int numberOfResearchPublications) {
        super(id, name, departmentName);
        this.numberOfResearchPublications = numberOfResearchPublications;
    }

    int getnop() {
        return this.numberOfResearchPublications;
    }

    public void calsal() {
        salary = 2000 * this.numberOfResearchPublications;
    }

    public void calgpf() {
        super.calgpf();
        gpfund = gpfund * (this.numberOfResearchPublications + 10);
    }

    public void displayinfo() {
        super.displayinfo();
        System.out.println("Number of Research Publications: " + numberOfResearchPublications);
    }

}
