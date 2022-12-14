/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCs Laptop New
 */
public class inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Ketua ketua = new Ketua("023344", "Firmansyah", "laki-laki", 2020,2);
      Kaprodi kaprodi = new Kaprodi ("777777", "upin", "bencong", "rpl");
      
      ketua.viewDosen();
      ketua.viewKetua();
      
      kaprodi.viewDosen();
      kaprodi.viewKaprodi();
    }
    
}
