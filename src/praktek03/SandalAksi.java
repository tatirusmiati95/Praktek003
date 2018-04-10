
package praktek03;


public class SandalAksi {
    public static void main(String[] args) {
        Sandal s = new Sandal();
      
        s.setMerk("Crocodol");
        s.setWarna("Merah");
        s.setHarga(10000);
       //gak bisa s.setJenisSepatu();
        
        s.cetakInfo();
        
        System.out.print("Merknya \t:");
        System.out.println(s.getMerk());
        System.out.print("Warnaknya \t:");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t:");
        System.out.println(s.getHarga());
        
        Sepatu sp = new Sepatu();
        sp.setMerk("Nevada");
        sp.setWarna("Abu-Abu");
        sp.setJenisSepatu("Karet");
        sp.setHarga(100000);
        sp.cetakInfo();
        System.out.println("Jenis\t :"+sp.getJenisSepatu());
        sp.throttle();



    }
}
