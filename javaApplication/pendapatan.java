package javaApplication;

public class pendapatan {
	public static void main(String[] args) {
		Gaji gajiBudi=new Gaji();
		gajiBudi.gaji("manager");
		System.out.println(gajiBudi.gaji);
		
		Tunjangan tunjanganBudi=new Tunjangan(true, 0);
		System.out.println(tunjanganBudi.jumlahTunjangan);
		
		System.out.println("total ="+(gajiBudi.gaji + tunjanganBudi.jumlahTunjangan));
		
	}
}
