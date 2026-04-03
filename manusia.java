package Inheritance;

public class manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah;

    public manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
    if (menikah) {
        if (jenisKelamin) {
            return 25.0; 
        } else {
            return 20.0; 
        }
    } else {
        return 15.0; 
    }
}

    public double getPendapatan() { 
        return getTunjangan();
    }

    public String toString() {
    String teks;
    if (jenisKelamin) {
        teks = "Laki-laki";
    } else {
        teks = "Perempuan";
    }

    return "Nama            : " + nama + "\n" +
           "NIK             : " + nik + "\n" +
           "Jenis kelamin   : " + teks + "\n" +
           "Pendapatan      : " + getPendapatan();
    }
}