package src.resource;

import java.util.ArrayList;

public class hotro {
    private int id;
    private String ten;
    private ArrayList<user> danhsanhthanhvien;
    private  ArrayList<String> danhsachthanhtich;

    public hotro(int id, String ten, ArrayList<user> danhsanhthanhvien, ArrayList<String> danhsachthanhtich) {
        this.id = id;
        this.ten = ten;
        this.danhsanhthanhvien = danhsanhthanhvien;
        this.danhsachthanhtich = danhsachthanhtich;
    }

    public hotro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<user> getDanhsanhthanhvien() {
        return danhsanhthanhvien;
    }

    public void setDanhsanhthanhvien(ArrayList<user> danhsanhthanhvien) {
        this.danhsanhthanhvien = danhsanhthanhvien;
    }

    public ArrayList<String> getDanhsachthanhtich() {
        return danhsachthanhtich;
    }

    public void setDanhsachthanhtich(ArrayList<String> danhsachthanhtich) {
        this.danhsachthanhtich = danhsachthanhtich;
    }
}


