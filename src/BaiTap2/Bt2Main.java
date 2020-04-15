/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author DELL
 */
public class Bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Vũ Gia Khiêm", 19, "Nha Trang", 1000000, 100);
        NhanVien nv2 = new NhanVien("Trương Lê Khánh Phương", 20, "Diên Khánh", 2000000, 200);
        NhanVien nv3 = new NhanVien("Phạm Huỳnh Đức", 32, "Đà Nẵng", 1500000, 100);
        NhanVien nv4 = new NhanVien("Võ Đông Các", 43, "Nha Trang", 1300000, 10);
        NhanVien nv5 = new NhanVien("Trần Thế Kiệt", 22, "Đà Nẵng", 500000, 210);
        
        QuanLy ql = new QuanLy();
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        
        System.out.println("Danh sách nhân viên: ");
        ql.inDS();
    }
}
