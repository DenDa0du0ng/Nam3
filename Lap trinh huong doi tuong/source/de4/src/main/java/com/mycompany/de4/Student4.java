/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de4;

/**
 *
 * @author PC
 */
public class Student4 extends Person4 {
    public String masv;
    public String email;
    public Float DTK;

    public Student4(String hoten, String ngaysinh, String diachi, String gioitinh, String masv, String email, Float DTK) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.masv = masv;
        this.email = email;
        this.DTK = DTK;
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

    public Float getDTK() {
        return DTK;
    }

    public void setDTK(Float DTK) {
        this.DTK = DTK;
    }

    @Override
    public String toString() {
        return "Student4{" + "hoten=" + hoten + "$ ngaysinh=" + ngaysinh + "$ diachi=" + diachi + "$ gioitinh=" + gioitinh + "masv=" + masv + "$ email=" + email + "$ DTK=" + DTK + "}";
    }
    public void hienthi(){
        super.hienthi();
        System.out.print("masv: "+masv);
        System.out.print("email: "+email);
        System.out.print("DTK: "+DTK);
    }
}
