package Tugas;

import java.util.Scanner;

public class Tugas2JadwalKuliah {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        tampilSemuaJadwal(jadwal);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilBerdasarkanHari(jadwal, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        tampilBerdasarkanMatkul(jadwal, matkul);
    }

    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemuaJadwal(String[][] jadwal) {
        System.out.println("\n================= JADWAL KULIAH =================");
        System.out.println("Mata Kuliah\tRuang\t\tHari\tJam");
        System.out.println("================================================");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println(
                jadwal[i][0] + "\t" +
                jadwal[i][1] + "\t" +
                jadwal[i][2] + "\t" +
                jadwal[i][3]
            );
        }
    }

    static void tampilBerdasarkanHari(String[][] jadwal, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][3]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal.");
        }
    }

    static void tampilBerdasarkanMatkul(String[][] jadwal, String matkul) {
        System.out.println("\nJadwal mata kuliah " + matkul + ":");
        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(
                    "Ruang : " + jadwal[i][1] +
                    ", Hari : " + jadwal[i][2] +
                    ", Jam : " + jadwal[i][3]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
