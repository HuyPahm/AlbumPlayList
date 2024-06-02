package ntu.proj.myapplication;

import java.io.Serializable;
import java.util.HashMap;
import java.io.Serializable;
import java.util.HashMap;

public class Task implements Serializable {

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHuyenThanh() {
        return HuyenThanh;
    }

    public void setHuyenThanh(String huyenThanh) {
        HuyenThanh = huyenThanh;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        PhanLoai = phanLoai;
    }

    public String getTenChuSX() {
        return TenChuSX;
    }

    public void setTenChuSX(String tenChuSX) {
        TenChuSX = tenChuSX;
    }

    public String getLoaiHinhSX() {
        return LoaiHinhSX;
    }

    public void setLoaiHinhSX(String loaiHinhSX) {
        LoaiHinhSX = loaiHinhSX;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getTenDaiDIen() {
        return TenDaiDIen;
    }

    public void setTenDaiDIen(String tenDaiDIen) {
        TenDaiDIen = tenDaiDIen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSoHangSao() {
        return SoHangSao;
    }

    public void setSoHangSao(String soHangSao) {
        SoHangSao = soHangSao;
    }

    public String getNamCongNhan() {
        return NamCongNhan;
    }

    public void setNamCongNhan(String namCongNhan) {
        NamCongNhan = namCongNhan;
    }

    String ID;
    String HuyenThanh;
    String TenSP;
    String PhanLoai;
    String TenChuSX;
    String LoaiHinhSX;
    String DiaChi;
    String TenDaiDIen;
    String SDT;
    String SoHangSao;
    String NamCongNhan;

    public Task(String ID, String huyenThanh, String tenSP, String phanLoai, String tenChuSX, String loaiHinhSX, String diaChi, String tenDaiDIen, String SDT, String soHangSao, String namCongNhan) {
        this.ID = ID;
        HuyenThanh = huyenThanh;
        TenSP = tenSP;
        PhanLoai = phanLoai;
        TenChuSX = tenChuSX;
        LoaiHinhSX = loaiHinhSX;
        DiaChi = diaChi;
        TenDaiDIen = tenDaiDIen;
        this.SDT = SDT;
        SoHangSao = soHangSao;
        NamCongNhan = namCongNhan;
    }

//    public Testing() {
//    }

    public HashMap<String, String> toFirebaseObject() {
        HashMap<String, String> testObject = new HashMap<String, String>();
        testObject.put("ID", ID);
        testObject.put("HuyenThanh", HuyenThanh);
        testObject.put("TenSP", TenSP);
        testObject.put("PhanLoai", PhanLoai);
        testObject.put("Tên Chu SX", TenChuSX);
        testObject.put("Loại Hình", LoaiHinhSX);
        testObject.put("Địa Chỉ", DiaChi);
        testObject.put("Tên Đại Diện", TenDaiDIen);
        testObject.put("Điện Thoại", SDT);
        testObject.put("SỐ Hạng Sao", SoHangSao);
        testObject.put("Năm Công Nhận", NamCongNhan);

        return testObject;

    }
}