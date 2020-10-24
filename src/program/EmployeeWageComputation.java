package program;

import utilities.EmployeeWageObject;
import utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

/*author:srikar reddy
  date:16/10/2020
  Functionality:To solve the employee wage
  computation problem
* */
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation main branch");
        Utilities utilities=new Utilities();
        utilities.Add_Company(20,30,40,"Dmart");
        utilities.Add_Company(30,40,50,"Reliance");
        utilities.Add_Company(40,50,60,"Groffers");
        utilities.Add_Company(40,60,50,"Bigbasket");
       // utilities.display();
        utilities.computewage();

    }
}
