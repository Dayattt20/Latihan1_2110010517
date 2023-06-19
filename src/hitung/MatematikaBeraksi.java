package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
       //membuat objek
       Matematika Dayat = new Matematika(1,7);
       
       System.out.println("Hasil penjumlahan:"+Dayat.setPenjumlahan());
       System.out.println("Hasil pengurangan:"+Dayat.setPengurangan());
       System.out.println("Hasil perkalian:"+Dayat.setPerkalian());
       System.out.println("Hasil pembagian:"+Dayat.setPembagian());
    }        
}
