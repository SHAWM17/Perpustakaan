public class daftarBuku {
    String newJudul;
    String newPenulis;
    int newTahunTerbit;

    public daftarBuku(String judul, String penulis, int tahunTerbit){
        newJudul = judul;
        newPenulis = penulis;
        newTahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo(){
        System.out.println("Judul: " + newJudul);
        System.out.println("Penulis: " + newPenulis);
        System.out.println("Tahun Terbit: " + newTahunTerbit);
    }
}
