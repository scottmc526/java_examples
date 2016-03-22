import java.util.Scanner;
public class ArrayCalc {
  public static void main(String[] args){
    int[] arr = new int[]{1,2,3,4,5,6};
    int total = 0;
    Scanner text = new Scanner(System.in);
    System.out.println("Add subtract or multiply?");
    String mathy = text.next();
    for (int i=0; i< arr.length ; i++ ) {
      if(mathy.equals("add")){
        total += arr[i];
      } else if (mathy.equals("subtract")){
        total -= arr[i];
      } else {
        total *= arr[i];
      }
    }
    System.out.println("Total = " + total);
  }
}
