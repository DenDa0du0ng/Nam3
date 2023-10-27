/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Nhanvien extends Person {
    public String phongban;
    public float hesoluong;
    public float thamnien;
    public float luongcoban;
    

    public Nhanvien( String hoten, String ngaysinh, String diachi, String gioitinh, String phongban, float hesoluong, float thamnien, float luongcoban) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public float getThamnien() {
        return thamnien;
    }

    public void setThamnien(float thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }
    public float getLuongthuclinh(){
        float luongthuclinh = luongcoban*hesoluong*(1+thamnien/100);
        return luongthuclinh;
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "hoten=" + hoten+ "$" + ", ngaysinh=" + ngaysinh+ "$" + ", diachi=" + diachi+ "$" + ", gioitinh=" + gioitinh+ "$" + ", phongban=" + phongban+ "$" + ", hesoluong=" + hesoluong+ "$" + ", thamnien=" + thamnien+ "$" + ", luongcoban=" + luongcoban+ "$" + ", luongthuclinh=" + getLuongthuclinh() + '}';
    }
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phongban: ");
        phongban = sc.nextLine();
        System.out.print("Nhap hesoluong: ");
        hesoluong= Float.parseFloat(sc.nextLine());
        System.out.print("Nhap thamnien: ");
        thamnien= Float.parseFloat(sc.nextLine());
        System.out.print("Nhap luongcoban: ");
        luongcoban= Float.parseFloat(sc.nextLine());
    }
    public void hienthithongtin(){
        super.hienthithongtin();
        System.out.print("phongban: "+phongban);
        System.out.print("hesoluong: "+hesoluong);
        System.out.print("thamnien: "+thamnien);
        System.out.print("luongcoban: "+luongcoban);
        System.out.print("luongthuclinh: "+getLuongthuclinh());
    }
}
