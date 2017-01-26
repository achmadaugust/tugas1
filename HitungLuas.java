import java.util.Scanner;
class HitungLuas {
	public static int cariLuasPersegiPanjang (int panjang, int lebar){
		return panjang*lebar;
	}
	public static void main (String []args){
		Scanner x = new Scanner (System.in);
		System.out.print ("Masukkan angka panjang = ");
		int panjang = x.nextInt();
		System.out.print ("Masukkan angka lebar = ");
		int lebar = x.nextInt ();
		System.out.println (panjang + " * " + lebar + " = " + cariLuasPersegiPanjang (panjang , lebar));
	}
}
