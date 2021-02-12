package javaApplication;

public class Tunjangan {
	boolean menikah;
	int anak;
	int jumlahTunjangan;
	
	public Tunjangan(boolean inputMenikah, int inputAnak) {
		menikah = inputMenikah;
		anak = inputAnak;
		if(inputMenikah== false) {
			jumlahTunjangan=0;
		}
		else {
			if(anak!=0) {
				jumlahTunjangan=2;
			}
			else {
				jumlahTunjangan=1;
			}
		}
	}

}
