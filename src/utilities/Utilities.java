package utilities;

public class Utilities {
    /*
    * Functionality:Use the random function
    * and check if employee is present or
    * Absent
    * */
    public void Attendence(){
        int is_present=1;
        int random= (int) (Math.floor(Math.random()*10)%2);
        if (random==is_present){
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
}
