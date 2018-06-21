package gtisportscode;

public class Employee {

    public String name;

    public String address;

    public String DOB;

    public String PPSN;

    public double NYS;

    public void setName(String enteredname) {
        name = enteredname;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String enteredaddress) {
        address = enteredaddress;
    }

    public String getAddress() {
        return address;
    }

    public void setDOB(String entereddob) {
        DOB = entereddob;
    }

    public String getDOB() {
        return DOB;
    }

    public void setPPSN(String enteredppsn) {
        PPSN = enteredppsn;
    }

    public String getPPSN() {
        return PPSN;
    }

    public void setNYS(double enterednys) {
        NYS = enterednys;
    }

    public double getNYS() {
        return NYS;
    }

    public double calbonusPercentage() {

        if (NYS <= 3) {

            return 0.05;

        } else if (NYS < 7) {

            return 0.07;

        } else {
            return 0.10;
        }

    }

}
