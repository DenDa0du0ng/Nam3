/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.de4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student4> arr = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("sinhvien.dat");
            InputStreamReader isw = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isw);
            String s ="";
            while((s=br.readLine())!=null){
                String a[]= s.split("\\$");
                Student4 s4 = new Student4(a[1],a[2],a[3],a[4],a[5],a[6],Float.parseFloat(a[7]));
                arr.add(s4);
            }
            br.close();
            isw.close();
            fis.close();
        }catch(Exception ex){}
        for(int i = 0; i<arr.size();i++){
            Student4 s4 = (Student4)arr.get(i);
            s4.toString();
        }
    }
    
}
