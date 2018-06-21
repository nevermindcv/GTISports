package gtisportscode;

import javax.swing.JOptionPane;

public class Cashier extends Employee {

    public double NHW;

    public double rate;

    public double wages = 0;

    public double bonus = 0;

    public double tax = 0;

    public double wagesaftertaxes = 0;

    public void setNHW(double enterednhw) {
        NHW = enterednhw;
    }

    public Double getNHW() {
        return NHW;
    }

    public void setRate(double enteredrate) {
        rate = enteredrate;
    }

    public Double getRate() {
        return rate;
    }

    public void calWageB() {

        wages = NHW * rate;

    }

    public double getwageB() {
        return wages;
    }

    public void calBonus() {

        bonus = wages * calbonusPercentage();

    }

    public double getcalBonus() {
        return bonus;
    }

    public double wagesBonus() {
        double wagesbonus = wages + bonus;
        return wagesbonus;
    }

    public double caltax() {

        if (wagesBonus() <= 1385.83) {

            tax = wagesBonus() * 0.20;

        } else {
            tax = wagesBonus() * 0.40;

        }

        return tax;
    }

    public double getcalWageA() {
        wagesaftertaxes = wagesBonus() - caltax();
        return wagesaftertaxes;
    }

}
