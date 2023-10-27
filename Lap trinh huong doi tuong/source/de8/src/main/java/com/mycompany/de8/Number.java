/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Number {
    public int value;
    public int max;
    public int min;

    public Number(int value, int max, int min) {
        this.value = value;
        this.max = max;
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Number{" + "value=" + value + ", max=" + max + ", min=" + min + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap value: ");
            value = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap max: ");
            max = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap min: ");
            min = Integer.parseInt(sc.nextLine());
    }
    public static boolean kt(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
