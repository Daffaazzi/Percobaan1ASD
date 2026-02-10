import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program menghitung IP Semester");
        System.out.println("==================================");

        String[] matKuliah = {
            "Matematika Dasar",
            "Pemrograman Dasar",
            "Critical Thinking Dan Problem Solving",
            "Bahasa Inggris",
            "Bahasa Indonesia",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja",
            "Konsep Teknologi Informasi",
            "Agama"
        };

        int[] sks = {2, 2, 2, 2, 2, 3, 2, 2, 2};
        double[] nilaiAkhir = new double[matKuliah.length];
        String[] nilaiHuruf = new String[matKuliah.length];
        double[] bobotNilai = new double[matKuliah.length];

        double totalBobotNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < matKuliah.length; i++) {
            System.out.print("Masukkan nilai akhir untuk " + matKuliah[i] + ": ");
            nilaiAkhir[i] = sc.nextDouble();

            if (nilaiAkhir[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAkhir[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAkhir[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAkhir[i] >= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAkhir[i] >= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAkhir[i] >= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            totalBobotNilai += bobotNilai[i] * sks[i];
            totalSks += sks[i];
        }

        double ipSemester = totalBobotNilai / totalSks;

        System.out.println("==================================");
        System.out.printf("%-40s %-5s %-12s %-12s %-12s%n", 
            "Matakuliah", "SKS", "Nilai Akhir", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==================================");
        
        for (int i = 0; i < matKuliah.length; i++) {
            System.out.printf("%-40s %-5d %-12.2f %-12s %-12.2f%n",
                matKuliah[i], sks[i], nilaiAkhir[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("==================================");
        System.out.printf("IP Semester: %.2f%n", ipSemester);
        
        sc.close();
    }
}
