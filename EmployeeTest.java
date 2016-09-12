import java.io.*;

public class EmployeeTest {

  public static void main(String args[]){
    Employee empOne = new Employee("Scott");
    Employee empTwo = new Employee("Allan");

    empOne.empAge(26);
    empOne.empDesignation("Lifegaurd");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empDesignation("Cop");
    empTwo.empSalary(2000);
    empTwo.printEmployee();
  }
}
