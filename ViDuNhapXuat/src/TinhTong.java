import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so a: ");
		Double a = scanner.nextDouble();
		System.out.print("Nhap so b: ");
		Double b = scanner.nextDouble();
		Double Tong = a + b;
		System.out.print("Tổng là " + Tong);
	}

}
