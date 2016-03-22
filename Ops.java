public class Ops {
  public static int sum(int x, int y){
    return x + y;
  }
  public static int multiply(int x, int y, int z){
    return x * y * z;
  }
  public static int power(int x){
    int i = x;
    return java.lang.Math.pow(x,i); 
  }
  public static void main(String[] args){
    System.out.println(sum(1,2));
    System.out.println(multiply(2,2,2));
    System.out.println(power(2));
  }
}
