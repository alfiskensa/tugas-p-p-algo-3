package algo.tugas3;
import java.util.Scanner;

public class SoalSegitiga extends AbstractSoal {

	@Override
	public void answer() throws Exception {
		System.out.println("Input Panjang 3 Sisi:");
		int[] array = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Sisi "+(i+1));
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Hasil: ");
		
		if((array[1] == array[0]) && (array[1] == array[2])) {
			System.out.print("Segitiga sama sisi");
		} else if((array[1] == array[0])) {
			System.out.print("Segitiga sama kaki");
		} else {
			System.out.print("Segitiga sembarang");
		}

	}

	@Override
	public void opening() {
		// TODO Auto-generated method stub
		System.out.println("+==============================+");
		System.out.println("| NIM: 2111600819              |");
		System.out.println("| Nama: Alfi Ramdhani          |");
		System.out.println("| Program cetak jenis segitiga |");
		System.out.println("+==============================+");
	}
}
