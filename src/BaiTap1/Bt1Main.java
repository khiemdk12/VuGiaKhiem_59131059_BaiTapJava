/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author DELL
 */
public class Bt1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv = new NhanVien("khiem", 10, "abc", 1, 100);
        NhanVien nv2 = new NhanVien("Khiêm", 20, "abc", 1000, 200);
        
        System.out.println(nv.getThongTin() + nv2.getThongTin());
    }
            
}
