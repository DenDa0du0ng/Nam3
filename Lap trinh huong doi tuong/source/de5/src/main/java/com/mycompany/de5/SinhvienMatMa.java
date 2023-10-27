/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de5;

/**
 *
 * @author PC
 */
public class SinhvienMatMa extends Sinhvien {
    public int donvi;
    public int luong;

    public SinhvienMatMa(int donvi, int luong, String masv, String ten, String ngaysinh, String gioitinh, Float DTB) {
        super(masv, ten, ngaysinh, gioitinh, DTB);
        this.donvi = donvi;
        this.luong = luong;
    }

    public int getDonvi() {
        return donvi;
    }

    public void setDonvi(int donvi) {
        this.donvi = donvi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhvienMatMa{"+ "masv=" + masv + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", DTB=" + DTB + "donvi=" + donvi + ", luong=" + luong + '}';
    }
    public void hienthi(){
        super.hienthi();
        System.out.print("don vi: "+donvi);
        System.out.print("luong: "+luong);
    }
}
