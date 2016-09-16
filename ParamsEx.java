import java.util.Scanner;

public class ParamsEx {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ParamClass paramObj = new ParamClass();
		System.out.println("Enter Your name here");
		String name = input.nextLine();

		paramObj.simple(name);
	}
}
