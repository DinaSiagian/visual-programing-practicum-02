//12S23009 -Dina Marlina Siagian
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang;

        System.out.println("Masukkan Nama Gudang:");
        namaGudang = input.nextLine();
        int kapasitasGudang;

        System.out.println("Masukkan Kapasitas Gudang:");
        kapasitasGudang = input.nextInt();
        int jumlahBukuSaatIni;

        System.out.println("Masukkan Jumlah Buku Saat Ini:");
        jumlahBukuSaatIni = input.nextInt();
        String aC;

        System.out.println("AC:");
        aC = input.nextLine();
        String jenisLantai;

        System.out.println("Masukkan Jenis Lantai:");
        jenisLantai = input.nextLine();
        String ketersediaanTeknologi;

        System.out.println("Masukkan Ketersediaan Teknologi:");
        ketersediaanTeknologi = input.nextLine();
        int skor;

        System.out.println("Skor");
        skor = input.nextInt();
        String hasil1;

        skor = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
        if (skor >= 40) {
            hasil1 = "Gudang Elite";
            System.out.println("Gudang Elite");
        } else {
            if (skor >= 25) {
                hasil1 = "Gudang Standar";
                System.out.println("Gudang Standar");
            } else {
                if (skor <= 25) {
                    hasil1 = "Gudang Perlu Peningkatan";
                    System.out.println("Gedung Perlu Peningkatan");
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + jenisLantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + hasil1);
    }
}
