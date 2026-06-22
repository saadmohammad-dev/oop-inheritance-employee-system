/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i1;
public class Mainclass {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(1, "Dr. Smith", "Computer Science", 5);

      

        f1.calsal();
        f1.caltax();
        f1.calgpf();
        f1.displayinfo();

        Staff staff = new Staff(2, "John Doe", "Administration", 3);

        staff.calsal();
        staff.caltax();
        staff.calgpf();
        staff.calbonus();
        staff.displayinfo();

    }

}
