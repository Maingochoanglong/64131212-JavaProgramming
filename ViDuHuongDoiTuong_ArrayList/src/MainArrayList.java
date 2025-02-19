import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();
		SanPham sp1 = new SanPham(0,"Cơm","Đồ ăn",null);
		SanPham sp2 = new SanPham(1,"Phở","Đồ ăn",null);
		SanPham sp3 = new SanPham(2,"Nước ngọt","Giải khát",null);
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		for(SanPham sp: dsSanPham)
		{
			System.out.println(sp.toString());
		}
	}

}
