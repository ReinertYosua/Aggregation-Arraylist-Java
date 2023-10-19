package AggregationArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TampilAggre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		JurusanAggre jur = new JurusanAggre("001", "TI");
		/*
		MahasiswaAggre mhs1 = new MahasiswaAggre(123,"Agung");
		MahasiswaAggre mhs2 = new MahasiswaAggre(234,"Budi");
		MahasiswaAggre mhs3 = new MahasiswaAggre(345,"Bejo");
		MahasiswaAggre mhs4 = new MahasiswaAggre(456,"Tukul");
		*/
		String stat;
		do {
			System.out.println("Input mahasiswa (Nim Nama)");
			int nim = scan.nextInt();
			String nama = scan.next();
			//disini letak aggregationnya
			jur.addMahasiswa(new MahasiswaAggre(nim,nama));
			System.out.println("input lagi (y/n)");
			stat = scan.next();
		}while(stat.equals("y"));
		
		/*
		//disini letak aggregationnya
		jur.addMahasiswa(mhs1);
		jur.addMahasiswa(mhs2);
		jur.addMahasiswa(mhs3);
		jur.addMahasiswa(mhs4);
		*/
		System.out.println("Kode Jur: "+jur.getKodeJur());
		System.out.println("Nama Jur: "+jur.getNamaJur());
		ArrayList<MahasiswaAggre> std = jur.getMahasiswa();
		System.out.println("Before sorting:");
		for(MahasiswaAggre listmhs: std) {
			if(listmhs!=null) {
				System.out.println(listmhs.getNim()+" - "+listmhs.getNama());
			}
			
		}
		Collections.sort(std, MahasiswaAggre.compStud);
		System.out.println("After sorting:");
		for(MahasiswaAggre listmhs: std) {
			if(listmhs!=null) {
				System.out.println(listmhs.getNim()+" - "+listmhs.getNama());
			}
		}
	}

}
