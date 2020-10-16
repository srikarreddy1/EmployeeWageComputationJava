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
        int salary;
        int random= (int) (Math.floor(Math.random()*10)%2);
        utilities.Attendence(is_present,random);
        salary=utilities.DailyEmployeeWage(is_present,random);
        System.out.println(salary);
    }
    
}
