package JSP1;

class Smartphone{
 String nama;
 String jenis;
 String warna;
 String model;
 String harga;
 
public Smartphone(String nama, String jenis, String warna, String model, String harga){
    this.nama = nama;
    this.jenis = jenis;
    this.warna = warna;
    this.model = model;
    this.harga = harga;
}
public void tampilkan(){
   System.out.println("Nama: " + nama);
   System.out.println("Jenis: " + jenis);
   System.out.println("Warna: " + warna);
   System.out.println("Model: " + model);
   System.out.println("Harga: " + harga);       
    }
    
}
public class JSNO3{
    public static void main(String[] args) {
        Smartphone a = new Smartphone("Samsung", "samsung galaxy s23", "pink", "HP", "12.479.000");
        Smartphone b = new Smartphone("iPhone", "iPad 14 pro max", "white", "HP", "8.100.000");

        System.out.println("Informasi Ponsel Samsung:");
        a.tampilkan();

        System.out.println("\nInformasi Ponsel iPhone:");
        b.tampilkan();
    }
}
