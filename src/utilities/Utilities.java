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
    public void TotalWorkingDays(int is_present,int is_parttime,int Numberofworkingdays,int MaxWorkingHoursInMonth){
      int totalsalary;
      int totalempHrs=0;
      int totalWorkingDays=0;
      int random;
      int salaryofeachday;
      int empratePerHr=20;
      int[] empHrs;
      while((totalWorkingDays<Numberofworkingdays)&&(totalempHrs<MaxWorkingHoursInMonth)){
          totalWorkingDays++;
          random=(int) Math.floor(Math.random()*10)%3;
          new Utilities().Attendence(is_present,random,is_parttime);
          empHrs=new Utilities().DailyEmployeeWage(is_present,random,is_parttime);
          salaryofeachday=(empHrs[1]*empratePerHr);
          System.out.println(salaryofeachday);
          totalempHrs=totalempHrs+empHrs[1];
      }
      totalsalary=totalempHrs*empratePerHr;
      System.out.println("total salary is :"+totalsalary);
    }
}
