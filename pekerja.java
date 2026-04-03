package Inheritance;
import java.time.LocalDate;

public class pekerja extends manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() { 
        return gaji; 
    }

    public double getBonus() {
        int lamaBekerja = 2023 - tahunMasuk.getYear();
        
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaBekerja <= 10) {
            return 0.10 * gaji; 
        } else {
            return 0.15 * gaji;
        }
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20.0);
    }

    @Override
    public double getPendapatan() {
        int lamaBekerja = 2020 - tahunMasuk.getYear();
        double persentaseBonus;
        
        if (lamaBekerja < 5) {
            persentaseBonus = 0.05;
        } else if (lamaBekerja < 10) {
            persentaseBonus = 0.10; 
        } else {
            persentaseBonus = 0.15;
        }
        return gaji + (persentaseBonus * gaji) + getTunjangan();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tahun masuk     : " + tahunMasuk.getDayOfMonth() + " " + 
                                     tahunMasuk.getMonthValue() + " " + 
                                     tahunMasuk.getYear() + "\n" +
               "Jumlah anak     : " + jumlahAnak + "\n" +
               "Gaji            : " + gaji;
    }
}