package algo.tugas3;
import java.util.Scanner;

public class SoalNilaiTengah extends AbstractSoal {

	@Override
	public void answer() throws Exception {
		System.out.println("Input 3 Angka:");
		int[] array = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Angka "+(i+1));
			array[i] = scanner.nextInt();
		}
		
		boolean duplicates=false;
		
		for (int j=0;j<array.length;j++)
		  for (int k=j+1;k<array.length;k++)
		    if (k!=j && array[k] == array[j])
		      duplicates=true;
		
		Integer middle = null;
		
		if(duplicates) {
			System.out.println("Angka tidak boleh sama");
		} else {
			middle = middleOfThree(array[0], array[1], array[2]);
		}
		
		String output = middle != null ? middle.toString() : "-";
		System.out.println("Nilai Tengah: "+output);
	}
	
	public static Integer middleOfThree(int a, int b, int c) {
		// x is positive if a is greater than b.
		// x is negative if b is greater than a.
		int x = a - b;

		int y = b - c; // Similar to x
		int z = a - c; // Similar to x and y.

		// Checking if b is middle (x and y
		// both are positive)
		if (x * y > 0)
			return b;

			// Checking if c is middle (x and z
		// both are positive)
		else if (x * z > 0)
			return c;
		else
			return a;
	}

	@Override
	public void opening() {
		// TODO Auto-generated method stub
		System.out.println("+==============================+");
		System.out.println("| NIM: 2111600819              |");
		System.out.println("| Nama: Alfi Ramdhani          |");
		System.out.println("| Program cetak nilai tengah   |");
		System.out.println("+==============================+");
	}
}
