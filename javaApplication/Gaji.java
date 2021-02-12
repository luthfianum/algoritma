package javaApplication;

public class Gaji {
	String jabatan;
	int gaji;
	
	void gaji(String inputJabatan) {
		if(inputJabatan == "direktur") {
			gaji=20;
		}
		else if(inputJabatan== "manager") {
			gaji=10;
		}
		else {
			gaji=5;
		}
	}
}
