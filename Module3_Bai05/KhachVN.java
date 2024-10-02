package Module3_Bai05;

public class KhachVN extends QLHD {
	private DoiTuong doituong;
	private double DinhMuc;
	public KhachVN() {
		super();
		DinhMuc=0;
	}
	public KhachVN(String makh,String ht, String ngaylap, double kw, double dg, DoiTuong dt, double dinhmuc) {
		super(makh,ht,ngaylap,kw,dg);
		DinhMuc=dinhmuc;
		
	}
	public void setDinhMuc(double dinhmuc) {
		this.DinhMuc=dinhmuc;
	}
	public double getDinhMuc() {
		return DinhMuc;
	}
	public double ThanhTien() {
		if(getKwtieuthu()<=getDinhMuc()) {
			return getKwtieuthu()*getDongia();
		}else {
			return getKwtieuthu()*getDongia()*getDinhMuc() + (getKwtieuthu()-getDinhMuc())*getDongia()*2.5;
		}
	}
	@Override
	public String toString() {
		return super.toString()+"\tDoi tuong:"+this.doituong+"\tDinh muc: "+this.DinhMuc+"\tThanh tien:"+ThanhTien()+"\n";
	}
	

}
