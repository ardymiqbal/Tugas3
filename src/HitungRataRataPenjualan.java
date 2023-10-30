import java.util.Scanner;

public class HitungRataRataPenjualan {
    /**
     * @author Ardy
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Meminta input harga barang dan jumlah barang yang terjual
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        System.out.print("Masukkan jumlah barang yang terjual: ");
        int jumlahTerjual = input.nextInt();

        // Memanggil fungsi hitungPendapatan
        double totalPendapatan = hitungPendapatan(hargaBarang, jumlahTerjual);

        // Menampilkan hasil perhitungan
        System.out.println("Total pendapatan dari penjualan: " + totalPendapatan);

        input.close();
    }

    // Fungsi untuk menghitung pendapatan dari penjualan

    /**
     *
     * @param hargaBarang
     * @param jumlahTerjual
     * @return
     */
    public static double hitungPendapatan(double hargaBarang, int jumlahTerjual) {
        return hargaBarang * jumlahTerjual;
    }
}