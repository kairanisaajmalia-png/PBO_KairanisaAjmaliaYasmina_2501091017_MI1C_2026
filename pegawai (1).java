/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kairanisa080626.kairanisa2304;

/**
 *
 * @author LAB-SI-PC
 */
public class pegawai {
    private String nip;
    private String nama;
    private String golongan;
    private Double gajipokok;
    private Double tunjangan;
    private Double potongan;
    private Double gajibersih;
    private static int DataPegawai;
    
    public static int getDataPegawai(){
            return DataPegawai;
    }
    
    public pegawai(){
        DataPegawai++;
    }
    
    public pegawai(String nip, String nama, String golongan) {
        DataPegawai++;
        this.nip = nip;
        this.nama = nama;
        setGolongan(golongan);
        hitungGaji();
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip (String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        if (golongan.equalsIgnoreCase("IIA")) {
            this.gajipokok = 2000000.0;
        } else if (golongan.equalsIgnoreCase("IIB")) {
            this.gajipokok = 2500000.0;
        } else if (golongan.equalsIgnoreCase("IIC")) {
            this.gajipokok = 3000000.0;
        } else {
            this.gajipokok = 0.0;
        }
    }

    public double getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getPotongan () {
        return potongan;
    }

    public void setPotongan (double potongan) {
        this.potongan = potongan;
    }
    public double getGajibersih () {
        return gajibersih;
    }

    public void setGajibersih (double gajibersih) {
        this.gajibersih = gajibersih;
    }
    public void hitungGaji() {
        tunjangan = 0.10 * gajipokok;
        double total = gajipokok + tunjangan;
        potongan = 0.02 * total;
        gajibersih = total - potongan;
    }
    
}
 
