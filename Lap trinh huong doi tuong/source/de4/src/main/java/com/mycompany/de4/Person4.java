/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de4;

/**
 *
 * @author PC
 */
public class Person4 {
    public String hoten;
    public String ngaysinh;
    public String diachi;
    public String gioitinh;

    public Person4(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Person4{" + "hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", gioitinh=" + gioitinh + '}';
    }
    public void hienthi(){
        System.out.print("hoten: "+hoten);
        System.out.print("ngaysinh: "+ngaysinh);
        System.out.print("diachi: "+diachi);
        System.out.print("gioitinh: "+gioitinh);
    }
}
