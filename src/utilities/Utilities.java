package utilities;

public class Utilities {
    /*
    * Functionality:Use the random function
    * and check if employee is present or
    * Absent
    * @param:is_present variable which is set to 1
    * @param:random which is set to 0 0r 1
    * */

    public void Attendence(int is_present,int random){
        if (random==is_present){
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
    /*
    * Fuctionality:to compute the daily wage of employee
    * @param:is_present is set to 1
    * @param:random which is set to 0 or 1
    * @return:returns salary*/
    public int DailyEmployeeWage(int is_present,int random){
        int employeeWagePerHr=20;
        int empHrs=8;
        int salary;
        if (is_present==random){
          salary=(empHrs*employeeWagePerHr);
        }
        else {
            salary=0;
        }
        return salary;
    }
}
