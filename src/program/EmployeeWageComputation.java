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
        int[] salary;
        int Numberofworkingdays=20;
        int MaxWorkingHoursInMonth=100;
        int random= (int) (Math.floor(Math.random()*10)%3);
        utilities.TotalWorkingDays(is_present,is_parttime,Numberofworkingdays,MaxWorkingHoursInMonth);

    }
    
}
