package Module3_Bai05;

public class KhachNuocNgoai extends QLHD {
	private String Quoctich;
	public KhachNuocNgoai() {
		super();
		Quoctich="";
	}
	public KhachNuocNgoai(String makh,String ht, String ngaylap, double kw, double dg,String qt) {
		super(makh,ht,ngaylap,kw,dg);
		Quoctich=qt;
	}
	public double ThanhTien() {
		return getKwtieuthu()*getDongia();
	}
	@Override
	public String toString() {
		return super.toString()+"\tQuoc tich:"+this.Quoctich+"\tThanh tien:"+ThanhTien()+"\n";
	}
	

}
