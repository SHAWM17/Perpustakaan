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
        do {
            System.out.println("Selamat Datang di Perpustakaan Digital\n");
            System.out.println("1. Menambahkan buku baru ");
            System.out.println("2. Menampilkan daftar buku yang tersedia ");
            System.out.println("3. Mencari buku berdasarkan judul ");
            System.out.println("4. Keluar ");
            System.out.print("Ketik menu (1-4): ");
            int menu = sc.nextInt();
            sc.nextLine();
            
            //Logika 
            if (menu == 1) {
                System.out.print("Ketikkan Judul Buku: ");
                String title = sc.nextLine();
                System.out.print("Ketikkan Penulis Buku: ");
                String writer = sc.nextLine();
                System.out.print("Ketikkan Tahun Terbit Buku: ");
                int year = sc.nextInt();
                daftarBuku bukuBaru = new daftarBuku(title, writer, year);
                listBuku.add(bukuBaru);
                // Sistem 1 Done
            } else if (menu == 2) {
                if (listBuku.isEmpty()) {
                    System.out.println("Daftar buku kosong\n");
                } else {
                    System.out.println("Menampilkan daftar buku yang tersedia");
                    for (int i = 0; i < listBuku.size(); i++) {
                        listBuku.get(i).tampilkanInfo();
                        System.out.println();
                    }
                }
                // Sistem 2 Done
            } else if (menu == 3) {
                System.out.println("Mencari buku berdasarkan judul");
                System.out.print("Ketikkan judul buku yang ingin dicari: ");
                String cariJudul = sc.nextLine();
                for (int i = 0; i < listBuku.size(); i++){
                    if (listBuku.get(i).getTitle().equalsIgnoreCase(cariJudul)){
                        System.out.println("Buku ditemukan!");
                        listBuku.get(i).tampilkanInfo();
                    }
                }
                // Sistem 3 Done
            } else if (menu == 4) {
                System.out.println("Terima kasih telah menggunakan layanan kami");
                break;
                // Sistem 4 Done
            } else {
                System.out.println("Menu tidak tersedia");
            }
        } while (true);
        sc.close();
    }
}
