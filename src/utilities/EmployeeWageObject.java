package utilities;

import java.awt.event.WindowStateListener;

/*
 * Functionality:create a employee wage object
 * with getter and setters
 * */
public class EmployeeWageObject {
    private int empratePerHr;
    private int Maxhoursinmonth;
    private int Numberofdays;
    private String company;
    private int Totalwage;
    public EmployeeWageObject(int empratePerHr, int maxhoursinmonth, int numberofdays, String company) {
        this.empratePerHr = empratePerHr;
        Maxhoursinmonth = maxhoursinmonth;
        Numberofdays = numberofdays;
        this.company = company;
    }
    /*
    * Functionality:to get EmpratePerHr
    * */
    public int getEmpratePerHr() {
        return empratePerHr;
    }
    /* Functionality: to get max hours in a month*/
    public int getMaxhoursinmonth(){
        return Maxhoursinmonth;
    }
    /* Functionality: to get number of working days
    *  in a month */
    public int getNumberofdays(){
        return Numberofdays;
    }
    /*Functionality: to get company name */
    public String getCompany(){
        return company;
    }
    /*Functionality: to convert object to string*/
    @Override
    public String toString(){
        return "companyname "+company+" , Numberofdays= "+Numberofdays+" , Maxhoursinamonth= "+Maxhoursinmonth+
                ", Employee rate per hour= "+empratePerHr;
    }
    /*Functionality: to set the total wage
    * @param:totalwage: value of total wage computed*/
    public void SetToalwage(int totalwage){
        this.Totalwage=totalwage;
    }/*
    Functionality:to get the total wage
    */
    public int getTotalwage(){
        return this.Totalwage;
    }
}
