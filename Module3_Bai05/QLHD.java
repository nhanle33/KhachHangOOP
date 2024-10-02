package Module3_Bai05;

public abstract class QLHD {
	private String MaKH;
	private String Hoten;
	private String NgayLapHD;
	private double Kwtieuthu;
	private double Dongia;
	public QLHD() {
		MaKH="";
		Hoten="";
		NgayLapHD="";
		Kwtieuthu=0;
		Dongia=0;		
	}
	public QLHD(String makh,String ht, String ngaylap, double kw, double dg) {
		MaKH=makh;
		Hoten=ht;
		NgayLapHD=ngaylap;
		Kwtieuthu=kw;
		Dongia=dg;
		
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getNgayLapHD() {
		return NgayLapHD;
	}
	public void setNgayLapHD(String ngayLapHD) {
		NgayLapHD = ngayLapHD;
	}
	public double getKwtieuthu() {
		return Kwtieuthu;
	}
	public void setKwtieuthu(double kwtieuthu) {
		Kwtieuthu = kwtieuthu;
	}
	public double getDongia() {
		return Dongia;
	}
	public void setDongia(double dongia) {
		Dongia = dongia;
	}
	public abstract double ThanhTien(); 
	
	//
	public String toString() {
		return "Ma KH:"+this.MaKH+"\tHo ten:"+this.Hoten+
				"\tNgay lap hoa don:"+this.NgayLapHD+"\tSo KW tieu thu:"+this.Kwtieuthu+
				"\tDon gia:"+this.Dongia;
	}
	
	
	
	

}
