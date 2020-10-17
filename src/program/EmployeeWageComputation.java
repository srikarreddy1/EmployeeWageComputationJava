package program;

import utilities.Utilities;
/*author:srikar reddy
  date:16/10/2020
  Functionality:To solve the employee wage
  computation problem
* */
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation main branch");
        Utilities utilities=new Utilities();
        int is_present=1;
        int is_parttime=2;
        int salary;
        int salaryusingswitch;
        int Numberofworkingdays=20;
        int random= (int) (Math.floor(Math.random()*10)%3);
        utilities.Attendence(is_present,random,is_parttime);
        salary=utilities.DailyEmployeeWage(is_present,random,is_parttime);
        salaryusingswitch=utilities.UseSwitchCaseForEmployeeWage(random);
        utilities .CalculateWagesPerMonth(is_present,is_parttime,Numberofworkingdays);
        System.out.println("salary calculate using if else statement:" +salary);
        System.out.println("salary calculated using switch statement:" +salaryusingswitch);
    }
    
}
