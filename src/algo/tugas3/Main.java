package algo.tugas3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pilih soal: (1 == soal segitiga, 2 == soal nilai tengah)");
		int choose = 0;
		AbstractSoal soal = null;
		Scanner scanner = new Scanner(System.in);
		choose = scanner.nextInt();
		
		execute(choose, soal);
		scanner.close();
	}

	private static void execute(int choose, AbstractSoal soal) throws Exception {
		
		switch (choose) {
		case 1:
			soal = new SoalSegitiga();
			break;

		case 2:
			soal = new SoalNilaiTengah();
			break;

		default:
			System.out.println("soal tidak diketahui");
			break;
		}
		
		if (soal != null) {
			soal.opening();
			soal.answer();
		}
	}
	
	

}
