/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review.form;

/**
 *
 * @author neil
 */
public class SinhVien extends Person {

    String masv, email;
    double diemtk;

    public SinhVien(String masv, String email, double diemtk, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.masv = masv;
        this.email = email;
        this.diemtk = diemtk;
    }

    public SinhVien() {
    }

    public String getMasv() {
        return masv;
    }

    public String getEmail() {
        return email;
    }

    public double getDiemtk() {
        return diemtk;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiemtk(double diemtk) {
        this.diemtk = diemtk;
    }
    
    
    @Override
    public void hienThongtin() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20f\n", super.hoten, super.ngaysinh, super.diachi, super.gioitinh,masv, email, diemtk);
    }
}
