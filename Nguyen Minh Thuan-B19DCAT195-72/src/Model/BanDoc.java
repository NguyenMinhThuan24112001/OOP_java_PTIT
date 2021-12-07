/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class BanDoc implements Serializable {//đọc ghi đối tượng nên phải implement serialiable
    private int ma;
    private String hoten,dchi,dthoai;
    //tự đôjng tăng dùng static
    private static int sma=10000;

    public BanDoc() {
    }

    public BanDoc(int ma, String hoten, String dchi, String dthoai) {
        this.ma = ma;
        this.hoten = hoten;
        this.dchi = dchi;
        this.dthoai = dthoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDchiString() {
        return dchi;
    }

    public void setDchiString(String dchi) {
        this.dchi = dchi;
    }

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    //lưu được vào trong bảngt thì p dùng Object[]
    public Object[] toObject(){
        return new Object[]{
            // muốn đưa ra cái gì thì cho vào đây
            ma,hoten,dchi,dthoai
        };
    }
    
}
