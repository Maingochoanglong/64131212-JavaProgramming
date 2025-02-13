import java.util.Scanner;

public class DTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ và tên sinh viên: ");
		String ho_va_ten = scanner.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		Double diem_trung_binh = scanner.nextDouble();
		System.out.println("-------------");
		System.out.println("Thông tin sinh viên:");
		System.out.println("Họ và tên:" + ho_va_ten);
		System.out.println("Điểm trung bình" + diem_trung_binh);
		scanner.close();
	}

}
