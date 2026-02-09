public class daftarBuku {
    String Judul;
    String Penulis;
    int TahunTerbit;

    public daftarBuku(String judul, String penulis, int tahunTerbit){
        this.Judul = judul;
        this.Penulis = penulis;
        this.TahunTerbit = tahunTerbit;
    }

    public String getTitle(){
        return this.Judul;
    }

    public void tampilkanInfo(){
        System.out.println("Judul: " + Judul);
        System.out.println("Penulis: " + Penulis);
        System.out.println("Tahun Terbit: " + TahunTerbit);
    }
}
