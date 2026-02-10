public class Fungsi {

    public static void main(String[] args) {
        
        int[][] stokBunga = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}    
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        hitungPendapatan(stokBunga, hargaBunga);
    }

    static void hitungPendapatan(int[][] stok, int[] harga) {
        System.out.println("======================================");
        System.out.println("   Program Menghitung Pendapatan   ");
        System.out.println("======================================");

        for (int i = 0; i < stok.length; i++) {
            int pendapatanCabang = 0;

            for (int j = 0; j < stok[i].length; j++) {
                pendapatanCabang += stok[i][j] * harga[j];
            }

            String status;
            if (pendapatanCabang > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.println("Cabang " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatanCabang);
            System.out.println("Status     : " + status);
            System.out.println("--------------------------------------");
        }

        System.out.println("======================================");
    }
}
