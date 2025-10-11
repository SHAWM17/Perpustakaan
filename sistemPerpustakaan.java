import java.util.ArrayList;
import java.util.Scanner;
public class sistemPerpustakaan {
    //Selamat Datang di perpustakaan digital
    /*Fitur yang akan diuat yaitu:
     * Menambahkan buku baru (judul, penulis, tahun terbit).
     Menampilkan seluruh daftar buku yang tersedia.
    Mencari buku berdasarkan judul.
    Mengubah status buku menjadi "dipinjam" atau "tersedia".
     */

    public static void main (String[] args) {
        ArrayList<daftarBuku> listBuku = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //Wellcome
        System.out.println("Selamat Datang di Perpustakaan Digital");
        for (int i = 0; i <= 38; i++){
            System.out.print("=");
        }
        System.out.println();
        System.out.println("1. Menambahkan buku baru ");
        System.out.println("2. Menampilkan daftar buku yang tersedia ");
        System.out.println("3. Mencari buku berdasarkan judul ");
        System.out.println("4. Keluar ");
        System.out.print("Ketik menu (1-4): ");
        int menu = sc.nextInt();
        
        //Logika 
        if (menu == 1) {
            int year;
            System.out.print("Ketikkan Judul Buku: ");
            String title = sc.next();
            System.out.print("Ketikkan Penulis Buku: ");
            String writer = sc.next();
            System.out.print("Ketikkan Tahun Terbit Buku: ");
            year = sc.nextInt();

            daftarBuku bukuBaru = new daftarBuku(title, writer, year);
            listBuku.add(bukuBaru);
            bukuBaru.tampilkanInfo();
            // Sistem 1 Done
        } else if (menu == 2) {
            if (listBuku.isEmpty()) {
                System.out.println("Daftar buku kosong");
            } else {
                System.out.println("Menampilkan daftar buku yang tersedia");
                for (int i = 0; i < listBuku.size(); i++) {
                    listBuku.get(i).tampilkanInfo();
                    System.out.println();
                }
            }
            // Sistem 2 Done
        } else if (menu == 3) {
            daftarBuku cariBuku = new daftarBuku();
            System.out.println("Mencari buku berdasarkan judul");
            System.out.print("Ketikkan judul buku yang ingin dicari: ");
            String cariJudul = sc.next();
            // Sistem 3 Done
        } else if (menu == 4) {
            System.out.println("Terima kasih telah menggunakan layanan kami");
            // Sistem 4 Done
        } else {
            System.out.println("Menu tidak tersedia");
        }
        sc.close();
    }
}
