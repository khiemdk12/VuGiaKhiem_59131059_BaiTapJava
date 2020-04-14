/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QuanLy implements IQuanLy{

    private List<NhanVien> QL;

    public QuanLy() {
        QL = new ArrayList<>();
    }
    
    @Override
    public void them(NhanVien nv) {
        QL.add(nv);
        //System.out.println("BaiTap2.QuanLy.them()" + nv.getThongTin());
    }

    @Override
    public void inDS() {
//        QL.forEach((i) -> {
//            System.out.println(i.getThongTin());
//        });
        for (int i = 0 ; i < QL.size(); i++){
            System.out.println("Nhan Vien " + i + " : " + "\n" + QL.get(i).getThongTin());
        }
    }
    
}
