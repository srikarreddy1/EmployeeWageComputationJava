package utilities;

import javax.swing.*;

public class Utilities {
    /*
    * Functionality:Use the random function
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
    public int DailyEmployeeWage(int is_present,int random,int is_parttime){
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
        return salary;
    }

    /*
    * Functionality:calculate employee wage for a month and print it out
    * @param:is_present is set to 1
    * @param:is_parttime is set to 1
    * @param:Numberofworkindays is set to 20
    * */
    public void CalculateWagesPerMonth(int is_present,int is_parttime,int Numberofworkingdays){
        int salary;
        int random;
         for(int day=1;day<Numberofworkingdays;day++){
             random=(int) Math.floor(Math.random()*10)%3;
             new Utilities().Attendence(is_present,random,is_parttime);
             salary=new Utilities().DailyEmployeeWage(is_present,random,is_parttime);
             System.out.println("salary of employee is "+salary);
         }
    }
}
