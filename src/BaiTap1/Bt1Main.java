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
        NhanVien nv = new NhanVien("Vũ Gia Khiêm", 20, "Nha Trang", 1000000, 100);
        NhanVien nv2 = new NhanVien("Vũ Gia Bảo", 21, "Diên Khánh", 1500000, 200);
        
        System.out.println("Thông tin nhân viên: \n" + nv.getThongTin() + "\n" +nv2.getThongTin());
    }
            
}
