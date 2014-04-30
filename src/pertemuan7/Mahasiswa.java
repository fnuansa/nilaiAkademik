package pertemuan7;

public class Mahasiswa {
	
	private String nama;
	private String alamat;
	private String nrp;
	
	public Mahasiswa(){
		
	}
	
	public Mahasiswa(String nrp, String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
		this.nrp = nrp;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nrp+"-"+nama+"-"+alamat;
	}
	
	
}
