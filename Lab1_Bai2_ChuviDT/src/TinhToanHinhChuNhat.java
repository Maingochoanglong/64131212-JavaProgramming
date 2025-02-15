import java.util.Scanner;

public class TinhToanHinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập cạnh b: ");
		double b = scanner.nextDouble();
		double chu_vi = 2 * (a + b);
		double dien_tich = a * b;
		double canh_nho = Math.min(a, b);
		System.out.println("Chu vi: " + chu_vi);
		System.out.println("Diện tích: " + dien_tich);
		System.out.println("Cạnh nhỏ: " + canh_nho);
		scanner.close();
	}

}
