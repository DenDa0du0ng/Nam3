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
public class Student extends Person {
    public String masv;
    public String email;
    public int DTK;
    public Student(){
        super();
    }
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDTK() {
        return DTK;
    }

    public void setDTK(int DTK) {
        this.DTK = DTK;
    }

    public Student(String masv, String email, String Hoten, String Ngaysinh, String Diachi, String Gioitinh, int DTK) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.masv = masv;
        this.email = email;
        this.DTK = DTK;
    }
    @Override
    public String toString() {
        
        return "Student{"+ "Hoten=" + Hoten + ", Ngaysinh=" + Ngaysinh + ", Diachi=" + Diachi + ", Gioitinh=" + Gioitinh + ", masv=" + masv + ", email=" + email + ", DTK=" + DTK + '}';
    }

    public void Nhapthontin(){
        super.Nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
            masv = sc.nextLine();
        System.out.print("Nhap Email: ");
            email = sc.nextLine();
        System.out.print("Nhap Diem tong ket: ");
            DTK = Integer.parseInt(sc.nextLine());
    }
    public void Hienthithongtin(){
        super.Hienthithongtin();
        System.out.print("Ma Sinh Vien:"+masv);
        System.out.print("Email:"+email);
        System.out.print("Diem tong ket:"+DTK);
    }
}
