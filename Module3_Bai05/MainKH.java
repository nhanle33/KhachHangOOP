package Module3_Bai05;

public class MainKH {

	public static void main(String[] args) {
		QLHD[] ql=new QLHD[6];
		//khach VN
		ql[0]=new KhachVN("KH01", "Le Van A", "10/2/2022", 900, 100, DoiTuong.sanxuat, 1000);
		ql[1]=new KhachVN("KH02", "Le Van B", "10/9/2018", 3000, 150, DoiTuong.kinhdoanh, 2500);
		ql[2]=new KhachVN("KH03", "Le Van C", "10/10/2024", 2500, 200, DoiTuong.sinhhoat, 1500);
		//khach QT
		ql[3]=new KhachNuocNgoai("KH03", "Thomas", "10/2/2024", 1000, 100, "Germany");
		ql[4]=new KhachNuocNgoai("KH04", "Robert", "21/9/2018", 1500, 150, "Portugal");
		ql[5]=new KhachNuocNgoai("KH05", "Leo", "19/9/2018", 2000, 200, "Argentina");
		for(QLHD QL: ql) {
			System.out.println(QL.toString());
		}
		int countVN=0;
		int countQT=0;
		for(QLHD QL: ql) {
			if(QL instanceof KhachVN) {
				countVN++;
			}else if(QL instanceof KhachNuocNgoai) {
				countQT++;
			}
		}
		System.out.println("So luong khach Viet Nam: "+countVN);
		System.out.println("So luong khach Quoc Te: "+countQT);
		//trung binh thanh tien cua khach nuoc ngoai
		double tien=0;
		for(QLHD QL: ql) {
			if(QL instanceof KhachNuocNgoai) {
				tien+=QL.ThanhTien();
			}
		}
		System.out.println("Trung binh thanh tien cua khach nuoc ngoai: "+tien/countQT);
		//hoa don thang 9/2018
		for(QLHD QL: ql) {
			if(QL.getNgayLapHD().contains("9/2018")) {
				System.out.println(QL.toString());
			}else {
				System.out.println("khong co giao dich nao!");
			}
		}
		
		

}
}
