package program;

import utilities.EmployeeWageObject;
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
        int random= (int) (Math.floor(Math.random()*10)%3);
        EmployeeWageObject employeeWageObject=new EmployeeWageObject();
        employeeWageObject.setCompany("Dmart");
        employeeWageObject.setNumberofdays(10);
        employeeWageObject.setMaxhoursinmonth(100);
        employeeWageObject.setEmpratePerHr(50);
        System.out.println(employeeWageObject.getEmpratePerHr());
        utilities.TotalWorkingDays(is_present,is_parttime,employeeWageObject.getNumberofdays(),employeeWageObject.getMaxhoursinmonth(),employeeWageObject.getEmpratePerHr());
    }
    
}
