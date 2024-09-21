package src.resource;

import java.util.ArrayList;

public class hotro {
    private String id;
    private String ten;
    private ArrayList<user> danhsanhthanhvien;
    private  ArrayList<String> danhsachthanhtich;

    public hotro(String id, String ten, ArrayList<user> danhsanhthanhvien, ArrayList<String> danhsachthanhtich) {
        this.id = id;
        this.ten = ten;
        this.danhsanhthanhvien = danhsanhthanhvien;
        this.danhsachthanhtich = danhsachthanhtich;
    }

    public hotro() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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


