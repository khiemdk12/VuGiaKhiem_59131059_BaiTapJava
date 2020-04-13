/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author DELL
 */
public class Bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sinh viên Poly
        SinhVienPoly svPoly = new SinhVienIT("Vu",10 , 10, 1);
        System.out.println("SV Poly:");
        svPoly.xuat();
        System.out.println("Điểm: " + svPoly.getDiem() + "\nHọc lực: " + svPoly.getHocLuc());
        
        //sinh viên IT
        SinhVienIT svIT = new SinhVienIT("Gia", 9, 8, 7);
        System.out.println("SV IT:");
        svIT.xuat();
        System.out.println("Điểm: " + svIT.getDiem() + "\nHọc lực: " + svIT.getHocLuc());
        
        //sinh vien Biz
        SinhVienBiz svBiz = new SinhVienBiz("Khiêm", 10, 10);
        System.out.println("SV Biz:");
        svBiz.xuat();
        System.out.println("Điểm: " + svBiz.getDiem() + "\nHọc lực: " + svBiz.getHocLuc());
    }
    
}
