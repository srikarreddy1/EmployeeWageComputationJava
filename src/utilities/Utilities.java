package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Utilities {

    List<EmployeeWageObject> EmployeewageComputation=new ArrayList<EmployeeWageObject>();
    HashMap<String,EmployeeWageObject> companymap=new HashMap<String, EmployeeWageObject>();

   /* Functionality:Use the random function
    * and check if employee is present or
    * Absent
    * @param:is_present variable which is set to 1
    * @param:random which is set to 0 , 1 or 2
    * @param:is_parttime is set to 1
    *
    * */

    public void Attendence(int is_present,int random,int is_partime){
        if (random==is_present||random==is_partime){
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
    /*
    * Fuctionality:to compute the daily wage of employee
    * @param:is_present is set to 1
    * @param:random which is set to 0 , 1 or 2
    * @param:is_parttime is set to 1
    * @return:returns salary*/
    public int[] DailyEmployeeWage(int is_present,int random,int is_parttime){
        int employeeWagePerHr=20;
        int empHrs;
        int salary;
        if (is_present==random){
          empHrs=8;
        }
        else {
            if (is_parttime==random){
                empHrs=4;
            }
            else {
                empHrs=0;
            }
        }
        salary=(empHrs*employeeWagePerHr);
        int[] salaryarray={salary,empHrs};
        return salaryarray;
    }
    /*Functionality:calculate the total employee wage untill the paticular emphours or total
    * working days is completed
    * @param:is_present is set to 1
    * @param:is_parttime is set to 1
    * @param:Numberofworkingdays is set to 20
    * @param:MaxWorkingHoursInMonth is set to 100
    * */
    public static int TotalWorkingDays(int Numberofworkingdays,int MaxWorkingHoursInMonth,int empratePerHr,String company){
      int totalWorkingDays=0;
      int totalempHrs=0;
      int is_present=1;
      int is_parttime=2;
      int[] empHrs;
      int salaryofeachday;
      int totalsalary;
      while((totalWorkingDays<Numberofworkingdays)&&(totalempHrs<MaxWorkingHoursInMonth)){
          totalWorkingDays++;
          int random=(int) Math.floor(Math.random()*10)%3;
          new Utilities().Attendence(is_present,random,is_parttime);
          empHrs=new Utilities().DailyEmployeeWage(is_present,random,is_parttime);
          salaryofeachday=(empHrs[1]*empratePerHr);
          System.out.println(salaryofeachday);
          totalempHrs=totalempHrs+empHrs[1];
      }
      totalsalary=totalempHrs*empratePerHr;
      System.out.println("total wage for a company "+company+" is "+totalsalary);
      return totalsalary;
    }
    /*
    * Functionality:To add a company to array list
    * @param:empratePerHr:employee rate per hour
    * @param:maxhoursinmonth: maximum number of working hours in month
    * @param:numberofdays: maximum number of working days in a month
    * @param:company: name of the company
    * */
    public void Add_Company(int empratePerHr,int maxhoursinmonth,int numberofdays,String company){
         EmployeeWageObject companyobject;
         companyobject=new EmployeeWageObject(empratePerHr,maxhoursinmonth,numberofdays,company);
         EmployeewageComputation.add(companyobject);
        companymap.put(company,companyobject);

    }
    /*
    * Functionality:to dispaly the name of companies in the arraylist
    * */
    public void display(){
        for(EmployeeWageObject employee : EmployeewageComputation)
            System.out.println(employee);
    }
    /*
    * Functionality:to compute the wages and store in a hash map
    * */
    public void computewage(){
        int tatalsalary;
        for(EmployeeWageObject company : EmployeewageComputation){
            tatalsalary=Utilities.TotalWorkingDays(company.getNumberofdays(),company.getMaxhoursinmonth()
                                     ,company.getEmpratePerHr(),company.getCompany());
            company.SetToalwage(tatalsalary);
        }

    }
    /*
     * Functionality:to display the total wage of company with company name
     * @param:companyname:name of the company*/
     public void displayTotalwage(String companyname){
          System.out.println("total wage for a  company "+companyname+" is : "+companymap.get(companyname).getTotalwage());
       }

}
