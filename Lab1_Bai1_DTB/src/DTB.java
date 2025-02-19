import java.util.Scanner;

public class DTB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten sinh vien: ");
        String HoVaTen = scanner.nextLine();
        double DiemTrungBinh;
        
        while (true) {
            try {
                System.out.print("Nhap diem trung binh: ");
                DiemTrungBinh = scanner.nextDouble();
                
                if (DiemTrungBinh < 0 || DiemTrungBinh > 10) {
                    System.out.println("Loi! Diem trung binh phai nam trong khoang 0 - 10.");
                    continue;
                }
                break;
            } catch (Exception ex) {
                System.out.println("Loi! Vui long nhap so hop le.");
            }
        }
        
        System.out.println("-----------------");
        System.out.println("Thong tin sinh vien:");
        System.out.println("Ho va ten: " + HoVaTen);
        System.out.println("Diem trung binh: " + DiemTrungBinh);
        scanner.close();
    }
}
