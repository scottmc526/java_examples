import java.util.Scanner;
public class Input{
  public static void main(String[] args){
    int given =  giveNumber();

    System.out.println("Name?");
    Scanner textTaker = new Scanner(System.in);
    String name = textTaker.next();
    System.out.println("sup " + name);


  }
  public static int giveNumber(){
    return 3;
  }
}
