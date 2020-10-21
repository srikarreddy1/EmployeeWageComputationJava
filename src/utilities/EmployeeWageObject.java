package utilities;
/*
* Functionality:create a employee wage object
* with getter and setters
* */
public class EmployeeWageObject {
  private int empratePerHr;
  private int Maxhoursinmonth;
  private int Numberofdays;
  private String company;

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getNumberofdays() {
        return Numberofdays;
    }

    public void setNumberofdays(int numberofdays) {
        Numberofdays = numberofdays;
    }

    public int getMaxhoursinmonth() {
        return Maxhoursinmonth;
    }

    public void setMaxhoursinmonth(int maxhoursinmonth) {
        Maxhoursinmonth = maxhoursinmonth;
    }

    public int getEmpratePerHr() {
        return empratePerHr;
    }

    public void setEmpratePerHr(int empratePerHr) {
        this.empratePerHr = empratePerHr;
    }
}
