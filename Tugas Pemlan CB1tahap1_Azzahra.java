package Pemlan;

public class CB1tahap1 {
    public static void main(String[] args) {
        Perusahaan ptInovasi = new Perusahaan("PT. Inovasi Teknologi");

        Karyawan k1 = new Karyawan("Andi", 5000000, ptInovasi);
        Karyawan k2 = new Karyawan("Budi", 7000000, ptInovasi);
        Karyawan k3 = new Karyawan("Eka", 6000000, ptInovasi);
        Karyawan k4 = new Karyawan("Ani", 3000000, ptInovasi);

        k1.info();
        k2.info();
        k3.info();
        k4.info();
    }
}

class Perusahaan {
    private final String namaPerusahaan;

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            System.out.println("Nama harus memiliki minimal 4 karakter.");
            this.nama = "Nama Invalid";
        }
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void info() {
        System.out.println("Nama Karyawan  : " + nama);
        System.out.println("Gaji Pokok     : Rp" + gajiPokok);
        System.out.println("Perusahaan     : " + perusahaan.getNamaPerusahaan());
        System.out.println("---------------------------");
    }
} //Azzahra Nayla Diandra_245150401111044