package com.example.nhom04_recycleview;

import java.util.ArrayList;
import java.util.List;

public class MonHoc {
    public String TenHinh;
    public String MaHP;
    public String TenHP;

    public MonHoc(String tenHinh, String maHP, String tenHP, String tenGV) {
        TenHinh = tenHinh;
        MaHP = maHP;
        TenHP = tenHP;
        TenGV = tenGV;
    }
    public static List<MonHoc> LayDSMonHoc(){
        List<MonHoc> lstMonHoc = new ArrayList<>();
        lstMonHoc.add(new MonHoc("didong","CMP354","Lập Trình Di Động", "Nguyễn Huy Cường"));
        lstMonHoc.add(new MonHoc("java","CMP324","Lập Trình java", "Nguyễn Văn A"));
        lstMonHoc.add(new MonHoc("window","CMP332","Lập Trình window", "Nguyễn Huy B"));
        return lstMonHoc;
    }
    public String getTenHinh() {
        return TenHinh;
    }

    public void setTenHinh(String tenHinh) {
        TenHinh = tenHinh;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String maHP) {
        MaHP = maHP;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String tenHP) {
        TenHP = tenHP;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String tenGV) {
        TenGV = tenGV;
    }

    public String TenGV;
}
