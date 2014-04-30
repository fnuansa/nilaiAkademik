package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class NilaiMain {
	
	private List<Nilai> listNilai;
	private List<Mahasiswa> listMhs;
	private List<Matakuliah> listMk;
	
	public NilaiMain() {
		this.listNilai = new ArrayList<Nilai>();
		this.listMhs = new ArrayList<Mahasiswa>();
		this.listMk = new ArrayList<Matakuliah>();
	}
	
	public void initMhs(){
		listMhs.add(new Mahasiswa("113040246","Fahrizal Nuansa","Subang"));
		listMhs.add(new Mahasiswa("113040256","Falia Dwi Mentari","Bandung"));
	}
	
	public void initMatkul(){
		listMk.add(new Matakuliah("IF123","RKPPL",3));
		listMk.add(new Matakuliah("IF234","PSBK",3));
	}

	public void initNilai(){
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(0), 3.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(1), 4.0));
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(1), 3.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(0), 4.0));
	}
	
	public void tampilMhs(){
		for (Mahasiswa mhs : listMhs) {
			System.out.println(mhs);
		}
	}
	
	public void tampilMatkul(){
		for (Matakuliah mk : listMk) {
			System.out.println(mk);
		}
	}
	
	public void tampilNilai(){
		for (Nilai n : listNilai) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		NilaiMain nm = new NilaiMain();
		nm.initMhs();
		nm.initMatkul();
		nm.initNilai();
		System.out.println("========List Mahasiswa========");
		nm.tampilMhs();
		System.out.println("========List Matakuliah========");
		nm.tampilMatkul();
		System.out.println("========List Nilai========");
		nm.tampilNilai();
	}
	
}
