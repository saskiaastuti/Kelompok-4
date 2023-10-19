
package jsnomor2;

class smartphone{
 String nama;
 String jenis;
 String warna;
 String model;
 String harga;
 
 void tampilkan(){
System.out.println(nama);
System.out.println(jenis);
System.out.println(warna);
System.out.println(model);
System.out.println(harga);
System.out.println("=======");
}

}

public class JsNomor2 {
    
    public static void main(String[] args) {
       smartphone saskia= new smartphone();
       saskia.nama = "Saskia Astuti";
       saskia.jenis = "samsung";
       saskia.warna = "pink";
       saskia.model = "samsung galaxy s23";
       saskia.harga = "12.479.000";
       saskia.tampilkan();
       
       smartphone dini= new smartphone();
       dini.nama = "dini";
       dini.jenis = "iphone";
       dini.warna = "putih";
       dini.model = "iphone 14 pro max";
       dini.harga = "8.100.000";
       dini.tampilkan();
      
    }
    
}
