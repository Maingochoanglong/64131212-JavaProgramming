import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		double delta = b*b-4*a*c;
		if (delta >= 0)
		{
			System.out.print("Căn delta: " + Math.sqrt(delta));
		}
		else
		{
			System.out.print("Delta âm: " + delta);
		}
	}

}
