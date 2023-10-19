package AggregationArrayList;

import java.util.ArrayList;

public class JurusanAggre {
	private String kodeJur;
	private String namaJur;
	private ArrayList<MahasiswaAggre> arraylistmhs= new ArrayList<MahasiswaAggre>();
	
	public JurusanAggre(String kodeJur, String namaJur) {
		super();
		this.kodeJur = kodeJur;
		this.namaJur = namaJur;
		//mhs = new ArrayList<Mahasiswa>();
	}

	public String getKodeJur() {
		return kodeJur;
	}
	public String getNamaJur() {
		return namaJur;
	}
	public void addMahasiswa(MahasiswaAggre mhs) {
		arraylistmhs.add(mhs);
	}
	public ArrayList<MahasiswaAggre> getMahasiswa(){
		return arraylistmhs;
	}
	/*
	public void cetakMhs() {
		System.out.println("Kode Jur: "+this.kodeJur);
		System.out.println("Nama Jur: "+this.namaJur);
		for(MahasiswaAggre listmhs: arraylistmhs) {
			if(listmhs!=null) {
				System.out.println(listmhs.getNim()+" - "+listmhs.getNama());
			}
			
		}
	}
	*/
}
