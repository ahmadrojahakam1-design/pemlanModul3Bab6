package Inheritance;

public class mahasiswaFILKOM extends manusia {
    private String nim;
    private double ipk;

    public mahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String prodi = "";
        char kode = nim.charAt(6);

        if (kode == '2') {
            prodi = "Teknik Informatika";
        } else if (kode == '3') {
            prodi = "Teknik Komputer";
        } else if (kode == '4') {
            prodi = "Sistem Informasi";
        } else if (kode == '6') {
            prodi = "Pendidikan Teknologi Informasi";
        } else if (kode == '7') {
            prodi = "Teknologi Informasi";
        }
        return prodi + ", 20" + nim.substring(0, 2);
    }

    @Override
    public double getPendapatan() {
        double beasiswa;

        if (ipk >= 3.5) {
            beasiswa = 75.0;
        } else if (ipk >= 3.0) {
            beasiswa = 50.0;
        } else {
            beasiswa = 0.0;
        }
        return super.getPendapatan() + beasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "NIM             : " + nim + "\n" +
               "IPK             : " + ipk + "\n" +
               "Status          : " + getStatus();
    }
}
