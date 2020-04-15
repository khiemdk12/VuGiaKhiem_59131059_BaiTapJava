/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *  
 * @author DELL
 */
public class ChuyenXe {
    private String maSoChuyen;
    private String hoTenTai;
    private String soXe;
    private double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTai, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTai = hoTenTai;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTai() {
        return hoTenTai;
    }

    public void setHoTenTai(String hoTenTai) {
        this.hoTenTai = hoTenTai;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public String inCX(){
        return ("Mã số chuyến: " + maSoChuyen +
                "\nHọ tên tài xế: " + hoTenTai +
                "\nSố xe: " + soXe +
                "\nDoanh thu: "+ doanhThu);
    }
}
