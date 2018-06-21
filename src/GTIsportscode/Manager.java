package gtisportscode;

public class Manager extends Employee {

    public double Salary;
    public double salarybonus;
    public double grossSalary;
    public double tax;
    public double netSalary;

    public void setSalary(double enteredsalary) {
        Salary = enteredsalary;
    }

    public double getSalary() {
        return Salary;
    }

    public double calWageB() {
        grossSalary = Salary / 26;
        return grossSalary;

    }

    public double calBonus() {

        salarybonus = grossSalary * calbonusPercentage();

        return salarybonus;
    }

    public double caltax() {

        if (calWageB() + calBonus() <= 1385.83) {

            tax = (calWageB() + calBonus()) * 0.20;

        } else {
            tax = (calWageB() + calBonus()) * 0.40;

        }

        return tax;
    }

    public double calWageA() {

        netSalary = (calWageB() + calBonus()) - caltax();
        return netSalary;
    }

}
