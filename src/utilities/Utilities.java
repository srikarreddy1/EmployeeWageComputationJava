package utilities;

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

    /*Functionality:using switch case to calculate
    * employee wage
    * @param:random which is set to 0 , 1 or 2
    * @return:returns salary
    * */
    public int UseSwitchCaseForEmployeeWage(int random){
        int empHrs;
        int employeeWagePerHr=20;
        int salary;
        switch (random){
            case 1:
                empHrs=8;
                salary=(empHrs*employeeWagePerHr);
                break;
            case 2:
                empHrs=4;
                salary=(empHrs*employeeWagePerHr);
                break;
            default:
                empHrs=0;
                salary=(empHrs*employeeWagePerHr);
                break;
        }
        return salary;
    }
}
