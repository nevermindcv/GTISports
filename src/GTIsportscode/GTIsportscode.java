/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtisportscode;


import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author nevermindcv
 */
public class GTIsportscode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        for (int counter=0;counter<1;counter++){
        
     String choose = JOptionPane.showInputDialog(null, "Choose Employee Type" +"\n"+"\nWrite it down, please"+ "\n" + "\n- (M) Manager" + "\n- (C) Cashier");

        if (choose.equalsIgnoreCase("Manager") || choose.equalsIgnoreCase("M")) {
            Manager();
        } else if (choose.equalsIgnoreCase("Cashier") || choose.equalsIgnoreCase("C")) {
            Cashier();
        } else {
            ErrorMsg();
            counter--;
        }
    }
    }

    public static void Manager() {

        Manager M1 = new Manager();

        M1.setName(JOptionPane.showInputDialog("Enter your Name, please"));
        M1.setAddress(JOptionPane.showInputDialog("Enter your Address, please"));
        M1.setDOB(JOptionPane.showInputDialog("Enter your Day of Birth, please"));
        M1.setPPSN(JOptionPane.showInputDialog("Enter your PPSN, please"));
        M1.setNYS(Double.parseDouble(JOptionPane.showInputDialog("Enter your Number of Years of service, please")));
        M1.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Enter your Yearly Salary, please")));

        JOptionPane.showMessageDialog(null, "Name: " + M1.getName()
                + "\nAddress: " + M1.getAddress()
                + "\nPPSN: " + M1.getPPSN()
                + "\nGross Salary: " + String.format("%.2f",M1.calWageB())
                + "\nBonus: " + String.format("%.2f",M1.calBonus())
                + "\nNet Salary: " + String.format("%.2f", M1.calWageA()));
    }

    public static void Cashier() {

        Cashier C1 = new Cashier();

        C1.setName(JOptionPane.showInputDialog("Enter your Name, please"));
        C1.setAddress(JOptionPane.showInputDialog("Enter your Address, please"));
        C1.setDOB(JOptionPane.showInputDialog("Enter your Day of Birth, please"));
        C1.setPPSN(JOptionPane.showInputDialog("Enter your PPSN, please"));
        C1.setNYS(Double.parseDouble(JOptionPane.showInputDialog("Enter your Number of Years of service, please")));
        C1.setNHW(Double.parseDouble(JOptionPane.showInputDialog("Enter your Number of Hours Worked (2 weeks period), please")));
        C1.setRate(Double.parseDouble(JOptionPane.showInputDialog("Enter your Rate per Hour, please")));
        C1.calWageB();
        C1.calBonus();

        JOptionPane.showMessageDialog(null, "Name: " + C1.getName()
                + "\nAddress: " + C1.getAddress()
                + "\nPPSN: " + C1.getPPSN()
                + "\nGross Wages: " + C1.getwageB()
                + "\nBonus: " + C1.getcalBonus()
                + "\nNet Wages: " + C1.getcalWageA());
    }
    
     public static void ErrorMsg() {

       // JOptionPane.showMessageDialog(null, "Wrong Character Entered");
       
        final JPanel panel = new JPanel();

    JOptionPane.showMessageDialog(panel, "Wrong Character Entered", "Error", JOptionPane.ERROR_MESSAGE);
    }

}
