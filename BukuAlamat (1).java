package kairanisa1604;

/**
 * @author LAB-SI-PC
 */
public class BukuAlamat {
    
    private String name;
    private String address;
    private int telepon;
    private String email;

    public BukuAlamat() {
        this.name = "";
        this.address = "";
        this.telepon = 0;
        this.email = "";
    }

    public BukuAlamat(String name) {
        this.name = name;
        this.address = "";
        this.telepon = 0;
        this.email = "";
    }

    public BukuAlamat(String name, String address) {
        this.name = name;
        this.address = address;
        this.telepon = 0;
        this.email = "";
    }

    public BukuAlamat(String name, String address, int telepon, String email) {
        this.name = name;
        this.address = address;
        this.telepon = telepon;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print(String temp){
        System.out.println("Nama            : " + name);
        System.out.println("Alamat          : " + address);
        System.out.println("Telepon         : " + telepon);
        System.out.println("Email           : " + email);
       
    }
}