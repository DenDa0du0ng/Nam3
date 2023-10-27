/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de5;

/**
 *
 * @author PC
 */
public class SinhvienHTTT extends Sinhvien {
    public int hocphi;

    public SinhvienHTTT(int hocphi, String masv, String ten, String ngaysinh, String gioitinh, Float DTB) {
        super(masv, ten, ngaysinh, gioitinh, DTB);
        this.hocphi = hocphi;
    }

    public int getHocphi() {
        return hocphi;
    }

    public void setHocphi(int hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public String toString() {
        return "SinhvienHTTT{"+ "masv=" + masv + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", DTB=" + DTB + "hocphi=" + hocphi + '}';
    }
    public void hienthi(){
        super.hienthi();
        System.out.print("hoc phi: "+hocphi);
    }
}
