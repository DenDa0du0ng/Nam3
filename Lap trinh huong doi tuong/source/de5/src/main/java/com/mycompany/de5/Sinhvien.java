/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de5;

/**
 *
 * @author PC
 */
public class Sinhvien {
    public String masv;
    public String ten;
    public String ngaysinh;
    public String gioitinh;
    public Float DTB;

    public Sinhvien(String masv, String ten, String ngaysinh, String gioitinh, Float DTB) {
        this.masv = masv;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.DTB = DTB;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Float getDTB() {
        return DTB;
    }

    public void setDTB(Float DTB) {
        this.DTB = DTB;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "masv=" + masv + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", DTB=" + DTB + '}';
    }
    public void hienthi(){
        System.out.print("masv: "+masv);
        System.out.print("ten: "+ten);
        System.out.print("ngaysinh: "+ngaysinh);
        System.out.print("gioitinh: "+gioitinh);
        System.out.print("diem trung binh: "+DTB);
    }
   
}
