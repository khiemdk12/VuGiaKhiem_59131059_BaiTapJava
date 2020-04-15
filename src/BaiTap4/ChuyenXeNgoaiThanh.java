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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSoChuyen, String hoTenTai, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTai, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String inCX() {
        return super.inCX() + 
               "Nơi đến: " + noiDen +
               "\nSố ngày đi được: " + soNgayDiDuoc; 
    }
}
