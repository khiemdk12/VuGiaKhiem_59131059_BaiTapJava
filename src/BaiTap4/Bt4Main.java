package BaiTap4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Bt4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChuyenXeNgoaiThanh cxNgoaiThanh1 = new ChuyenXeNgoaiThanh("Nha Trang", 10, "NGOAI1", "Vũ" , "1", 100);
        ChuyenXeNgoaiThanh cxNgoaiThanh2 = new ChuyenXeNgoaiThanh("Hà Nội", 20, "NGOAI2", "Gia" , "2", 200);
        ChuyenXeNgoaiThanh cxNgoaiThanh3 = new ChuyenXeNgoaiThanh("Đà Nẵng", 30, "NGOAI3", "Khiêm" , "3", 300);
        
        ChuyenXeNoiThanh cxNoiThanh1 = new ChuyenXeNoiThanh(1, 10, "NOI1", "Vũ", "11" , 1000);
        ChuyenXeNoiThanh cxNoiThanh2 = new ChuyenXeNoiThanh(2, 20, "NOI2", "Gia", "22" , 2000);
        ChuyenXeNoiThanh cxNoiThanh3 = new ChuyenXeNoiThanh(3, 30, "NOI3", "Khiêm", "33" , 3000);
        //tạo quản lý
        QuanLyChuyenXe ql = new QuanLyChuyenXe(); 
        
        ql.themChuyenXe(cxNgoaiThanh1);
        ql.themChuyenXe(cxNgoaiThanh2);
        ql.themChuyenXe(cxNgoaiThanh3);
        
        ql.themChuyenXe(cxNoiThanh1);
        ql.themChuyenXe(cxNoiThanh2);
        ql.themChuyenXe(cxNoiThanh3);
        //in thông tin từng chuyến xe
        
        ql.inDSChuyenXe();
        
        //tổng doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: " + ql.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: " + ql.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu của các chuyến xe: " + ql.tinhTongDT());
    }
    
}
