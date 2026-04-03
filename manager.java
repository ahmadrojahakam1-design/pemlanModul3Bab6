package Inheritance;

public class manager extends pekerja {
    private String departemen;

    public manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (0.10 * getGaji());
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan(); 
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Departemen      : " + departemen;
    }
}