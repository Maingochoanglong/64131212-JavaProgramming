import java.util.Scanner;

public class TheTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
		double a = scanner.nextDouble();
		double the_tich = Math.pow(a, 3);
		System.out.print("Thể tích khối lập phương " + the_tich);
		scanner.close();
	}

}
