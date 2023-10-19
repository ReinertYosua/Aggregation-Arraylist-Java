package AggregationArrayList;

import java.util.Comparator;

public class MahasiswaAggre {
	private int nim;
	private String nama;
	
	
	public MahasiswaAggre(int nim, String nama) {
		//super();
		this.nim = nim;
		this.nama = nama;
	}
	public int getNim() {
		return nim;
	}
	public void setNim(int nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public static Comparator<MahasiswaAggre> compStud = new Comparator<MahasiswaAggre>() {
		public int compare(MahasiswaAggre mhs1, MahasiswaAggre mhs2) {
			int namaMhs1 = mhs1.getNim();
			int namaMhs2 = mhs2.getNim();
			return namaMhs1-namaMhs2;
			
			//compareTo->string
			//return mhs1.nama.compareTo(mhs2.nama);
			
		}
	};
}
