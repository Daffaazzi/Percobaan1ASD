import java.util.Scanner;

public class Pemilihan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================================");
		System.out.print("Masukkan nilai tugas: ");
		double tugas = scanner.nextDouble();
		System.out.print("Masukkan nilai kuis: ");
		double kuis = scanner.nextDouble();
		System.out.print("Masukkan nilai UTS: ");
		double uts = scanner.nextDouble();
		System.out.print("Masukkan nilai UAS: ");
		double uas = scanner.nextDouble();
        System.out.println("==================================");
        System.out.println("==================================");

		if (!isValid(tugas) || !isValid(kuis) || !isValid(uts) || !isValid(uas)) {
			System.out.println("nilai tidak valid");
			scanner.close();
			return;
		}

		double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);
		String nilaiHuruf = konversiNilai(nilaiAkhir);
		String keterangan = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "TIDAK LULUS" : "LULUS";

		System.out.printf("Nilai akhir: %.2f%n", nilaiAkhir);
		System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("==================================");
        System.out.println("==================================");
		System.out.println("Keterangan: " + keterangan);
     

		scanner.close();
	}

	private static boolean isValid(double nilai) {
		return nilai >= 0 && nilai <= 100;
	}

	private static String konversiNilai(double nilai) {
		if (nilai >= 80) {
			return "A";
		} else if (nilai >= 75) {
			return "B+";
		} else if (nilai >= 70) {
			return "B";
		} else if (nilai >= 65) {
			return "C+";
		} else if (nilai >= 60) {
			return "C";
		} else if (nilai >= 50) {
			return "D";
		}
		return "E";
	}
}
