
public class MainHuongDoiTuong {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2,"Bánh Chuối","Đồ ăn nhanh","bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SaiGon");
		sp1.setLoaiSP("Đồ uống có cồn");
		sp1.setAnhSP("sg.png");
		String ThongTinSP1 = sp1.toString();
		String ThongTinSP2 = "Mã SP2 là " + sp2.getMaSP() + " Tên SP2 là " + sp2.getTenSP();
		System.out.println(ThongTinSP1);
		System.out.println(ThongTinSP2);
	}

}
