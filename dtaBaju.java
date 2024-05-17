
package uts_widhya;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class dtaBaju {
    private static Scanner scanner = new Scanner(System.in);
    private static Baju[] bajus = new Baju[100];  // Perbaikan nama class dan array
    private static int count = 0;

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addBaju();
                    break;
                case 2:
                    displayBajus();
                    break;
                case 3:
                    updateBaju();
                    break;
                case 4:
                    deleteBaju();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi Size Baju.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("\nMenu Aplikasi Size Baju:");
        System.out.println("1. Pencatatan Baju");
        System.out.println("2. Menampilkan Data Baju");
        System.out.println("3. Mengubah Data Baju");
        System.out.println("4. Menghapus Data Baju");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    private static void addBaju() {
        System.out.print("Masukkan nama baju: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ukuran baju: ");
        String ukuran = scanner.nextLine();
        Baju baju = new Baju(nama, ukuran);
        bajus[count] = baju;
        count++;
        System.out.println("Data baju berhasil ditambahkan.");
    }

    private static void displayBajus() {
        if (count == 0) {
            System.out.println("Belum ada data baju yang dicatat.");
        } else {
            System.out.println("Data Baju:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + bajus[i]);
            }
        }
    }

    private static void updateBaju() {
        System.out.print("Masukkan nomor data baju yang ingin diubah: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline
        if (index >= 0 && index < count) {
            System.out.print("Masukkan nama baju baru: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan ukuran baju baru: ");
            String ukuran = scanner.nextLine();
            bajus[index].setNama(nama);
            bajus[index].setUkuran(ukuran);
            System.out.println("Data baju berhasil diubah.");
        } else {
            System.out.println("Nomor data baju tidak valid.");
        }
    }

    private static void deleteBaju() {
        System.out.print("Masukkan nomor data baju yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                bajus[i] = bajus[i + 1];
            }
            bajus[count - 1] = null;
            count--;
            System.out.println("Data baju berhasil dihapus.");
        } else {
            System.out.println("Nomor data baju tidak valid.");
        }
    }
}