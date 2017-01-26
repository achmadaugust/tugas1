import java.util.Scanner;
class HitungLuas2{
	public static int cariLuasPersegiPanjang (int panjang, int lebar){
		return panjang*lebar;
	}
	public static float cariLuasLingkaran (float r){
		return (22*r*r)/7;
	}
	public static float cariLuasSegitiga (float alas, float tinggi){
		return (alas*tinggi)/2;
	}
	public static void main (String []args){
		Scanner x = new Scanner (System.in);
		System.out.println ("Hitung Luas Persegi Panjang");
		System.out.print ("Masukkan angka panjang = ");
		int panjang = x.nextInt();
		System.out.print ("Masukkan angka lebar = ");
		int lebar = x.nextInt ();
		System.out.println (panjang + " * " + lebar + " = " + cariLuasPersegiPanjang (panjang , lebar));
		System.out.println ("Hitung Luas Lingkaran");
		System.out.print ("Masukkan jari-jari = ");
		float r = x.nextFloat ();
		System.out.println ("( 22 * " + r + " * " + r + " ) / 7 = " + cariLuasLingkaran (r));
		System.out.println ("Hitung Luas Segitiga");
		System.out.print ("Masukkan angka alas = ");
		float alas = x.nextFloat ();
		System.out.print ("Masukkan angka tinggi = ");
		float tinggi = x.nextFloat ();
		System.out.println ("( " + alas + " * " + tinggi + " ) / 2 = " +cariLuasSegitiga (alas , tinggi));
	}
}
