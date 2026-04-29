package kairanisa080626.kairanisa2304;

import java.util.Scanner;

public class DataPegawai {
    private static pegawai[] data = new pegawai[100];
    private static int jumlahSekarang = 0; 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===============================");
            System.out.println("   SISTEM MANAJEMEN PEGAWAI    ");
            System.out.println("===============================");
            System.out.println("1. Tambah Pegawai (Insert)");
            System.out.println("2. Lihat Semua Pegawai (View)");
            System.out.println("3. Update Data Pegawai");
            System.out.println("4. Hapus Data Pegawai (Delete)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu [1-5]: ");
            
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    viewData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan salah, coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void tambahData() {
        if (jumlahSekarang < data.length) {
            System.out.println("\n[ TAMBAH DATA PEGAWAI ]");
            System.out.print("Masukkan NIP      : ");
            String nip = input.nextLine();
            System.out.print("Masukkan Nama     : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Golongan : ");
            String gol = input.nextLine();

            data[jumlahSekarang] = new pegawai(nip, nama, gol);
            jumlahSekarang++;
            System.out.println("Data berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas data penuh!");
        }
    }

    public static void viewData() {
        if (jumlahSekarang <= 0) {
            System.out.println("\n------------------------------");
            System.out.println("    DATA MASIH KOSONG!  ");
            System.out.println("------------------------------");
            return;
        }

        System.out.println("\n[ DAFTAR DATA PEGAWAI ]");
        for (int i = 0; i < jumlahSekarang; i++) {
            if (data[i] != null) {
                System.out.println("Pegawai ke-" + (i + 1));
                System.out.println("NIP          : " + data[i].getNip());
                System.out.println("Nama         : " + data[i].getNama());
                System.out.println("Golongan     : " + data[i].getGolongan());
                System.out.println("Gaji Pokok   : Rp " + data[i].getGajipokok());
                System.out.println("Tunjangan    : Rp " + data[i].getTunjangan());
                System.out.println("Potongan     : Rp " + data[i].getPotongan());
                System.out.println("gaji bersih  : Rp " + data[i].getGajibersih());
                System.out.println("------------------------------");
            }
        }

        System.out.println("Total Pegawai : " + pegawai.getDataPegawai());
    }

    public static void updateData() {
        if (jumlahSekarang <= 0) {
            System.out.println("Data kosong, tidak ada yang bisa diupdate.");
            return;
        }
        
        System.out.print("Masukkan nomor urut pegawai yang akan diupdate: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < jumlahSekarang && data[index] != null) {
            System.out.println("Updating data: " + data[index].getNama());
            System.out.print("Masukkan Nama Baru     : ");
            String namaBaru = input.nextLine();
            System.out.print("Masukkan Golongan Baru : ");
            String golBaru = input.nextLine();

            data[index] = new pegawai(data[index].getNip(), namaBaru, golBaru);
            System.out.println("Data berhasil diperbarui!");
        } else {
            System.out.println("Nomor urut tidak ditemukan.");
        }
    }

    public static void deleteData() {
        if (jumlahSekarang <= 0) {
            System.out.println("Data kosong, tidak ada yang bisa dihapus.");
            return;
        }

        System.out.print("Masukkan nomor urut pegawai yang akan dihapus: ");
        int index = input.nextInt() - 1;

        if (index >= 0 && index < jumlahSekarang) {

            for (int i = index; i < jumlahSekarang - 1; i++) {
                data[i] = data[i + 1];
            }
            data[jumlahSekarang - 1] = null;
            jumlahSekarang--;
            
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor urut tidak ditemukan.");
        }
    }
}