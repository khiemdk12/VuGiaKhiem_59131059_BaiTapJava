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
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    public String getThongTin() {
        return "Ten: " + ten + "\n" +
               "Tuoi: " + tuoi +"\n"+
               "Dia Chi: " + diaChi + "\n" +
               "Tien Luong: " + tienLuong + "\n" +
               "Tong Gio Lam: " + tongGioLam + "\n" +
               "Tien Thuong: " + tinhThuong();
    }
    
    public double tinhThuong() {
        if (tongGioLam >= 200) return tienLuong*20/100;
        else 
          if (tongGioLam < 100) return 0;
          else return tienLuong*10/100;
    }
}
