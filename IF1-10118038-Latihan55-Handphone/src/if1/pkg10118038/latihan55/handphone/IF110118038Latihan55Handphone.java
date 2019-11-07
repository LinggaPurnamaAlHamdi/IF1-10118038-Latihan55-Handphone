/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan55.handphone;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan informasi Handphone
 */
public class IF110118038Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Samsung","Android","Grand",3000000);
        android.setKeyStore("234ibfd3840fo");
        BlackBerry BB = new BlackBerry("BlackB","RIM","Curve",2000000);
        BB.setPinBB("BHS249");
        WindowsPhone WP = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        WP.setWpKeyStore("UUUQIJWORJ");
        
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore() + "\n");
        BB.displayProduct();
        System.out.println("PIN : " + BB.getPinBB() + "\n");
        WP.displayProduct();
        System.out.println("Wp Key Store : " + WP.getWpKeyStore());
        
    }
    
}
