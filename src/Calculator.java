import java.util.Scanner;

public class Calculator  extends MainCalculator {
	Scanner input = new Scanner(System.in);	// input 
	
	public Calculator() {
		System.out.println("----- Masukkan Angka -----");
		System.out.print("Angka1: ");
		double angka1 = input.nextDouble();
		System.out.print("Angka2: ");
		double angka2 = input.nextDouble();
		
		System.out.print("Penjumlahan \t: ");
		System.out.println(addition(angka1, angka2));
		
		System.out.print("Pengurangan \t: ");
		System.out.println(substraction(angka1, angka2));
		
		System.out.print("Perkalian \t: ");
		System.out.println(multiplication(angka1, angka2));
		
		System.out.print("Pembagian \t: ");
		System.out.println(divide(angka1, angka2));
		
		System.out.print("Modulo \t\t: ");
		System.out.println(modulo(angka1, angka2));
		
		System.out.println("\n----- Masukkan Angka -----");
		System.out.print("Jumlah Angka: ");
		int n = input.nextInt();
		
		double[] angka3 = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Angka ke-" + i + " : ");
			angka3[i]=input.nextDouble();
		}
		
		System.out.print("Rata-Rata : ");
		System.out.println(average(angka3));
		
		System.out.print("Median : ");
		System.out.println(median(angka3));
		
		
	}

	private double median(double[] angka3) {
		int n = angka3.length;
		double med = 0;
		
		if(n % 2 == 1) {
			med = angka3[(n+1) / 2-1];
		} else {
			med = (angka3[n/2-1] + angka3[n/2]) / 2;
		}
		return med;
	}

	private double average(double[] angka3) {
		double avg = 0;
		for(int i=0; i<angka3.length; i++){
			avg = avg + angka3[i];
        }
		return avg / angka3.length;
	}


	@Override
	public double addition(double a, double b) {
		return a + b;
	}

	@Override
	public double substraction(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public double modulo(double a, double b) {
		return a % b;
	}
}
