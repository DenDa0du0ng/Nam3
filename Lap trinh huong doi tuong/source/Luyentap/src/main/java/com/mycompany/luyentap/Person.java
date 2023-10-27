/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Person {
    public String Hoten;
    public String Ngaysinh;
    public String Diachi;
    public String Gioitinh;
    
    public Person(){}
    @Override
    public String toString() {
        return "Person{" + "Hoten=" + Hoten + ", Ngaysinh=" + Ngaysinh + ", Diachi=" + Diachi + ", Gioitinh=" + Gioitinh + '}';
    }

    public Person(String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
    public void Nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
            Hoten = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
            Ngaysinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
            Diachi = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
            Gioitinh = sc.nextLine();
    }
    public void Hienthithongtin(){
        System.out.print("Hoten"+Hoten);
        System.out.print("Ngaysinh"+Ngaysinh);
        System.out.print("Diachi"+Diachi);
        System.out.print("Gioitinh"+Gioitinh);
    }
}
