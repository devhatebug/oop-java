package review;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    protected String PhongBan;
    protected int LuongCoBan;
    protected float HeSoLuong, HeSoPhuCap;

    public NhanVien(String PhongBan, int LuongCoBan, float HeSoLuong, float HeSoPhuCap, String HoTen, String ngaySinh, String DiaChi, String GioiTinh) {
        super(HoTen, ngaySinh, DiaChi, GioiTinh);
        this.PhongBan = PhongBan;
        this.LuongCoBan = LuongCoBan;
        this.HeSoLuong = HeSoLuong;
        this.HeSoPhuCap = HeSoPhuCap;
    }

    public NhanVien() {
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public int getLuongCoBan() {
        return LuongCoBan;
    }

    public float getHeSoLuong() {
        return HeSoLuong;
    }

    public float getHeSoPhuCap() {
        return HeSoPhuCap;
    }
    
    public float getLuongThucLinh() {
        return LuongCoBan*(HeSoLuong + HeSoPhuCap);
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public void setLuongCoBan(int LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public void setHeSoLuong(float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public void setHeSoPhuCap(float HeSoPhuCap) {
        this.HeSoPhuCap = HeSoPhuCap;
    }
    
    @Override
    public void nhapThongtin() {
        Scanner sc = new Scanner(System.in);
       super.nhapThongtin();
       System.out.print("Phong ban: ");
       this.PhongBan = sc.nextLine();
       
       while(true) {
           System.out.print("Luong co ban: ");
           if(sc.hasNextInt()) {
               this.LuongCoBan = sc.nextInt();
               break;
           } else {
               System.out.println("Vui long nhap so!");
               sc.next();
           }
       }
       
       while(true) {
           System.out.print("He so luong: ");
           if(sc.hasNextFloat()) {
               this.HeSoLuong = sc.nextFloat();
               break;
           } else {
               System.out.println("Vui long nhap so!");
               sc.next();
           }
       }
       
       while(true) {
           System.out.print("He so phu cap: ");
           if(sc.hasNextFloat()) {
               this.HeSoPhuCap = sc.nextFloat();
               break;
           } else {
               System.out.println("Vui long nhap so!");
               sc.next();
           }
       }
    }
    
    @Override
    public void hienThongtin() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20d %-20f %-20f %-20f\n", super.HoTen, super.ngaySinh, super.DiaChi, super.GioiTinh, PhongBan, LuongCoBan, HeSoLuong, HeSoPhuCap, getLuongThucLinh());
    }
    
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.nhapThongtin();
        nv.hienThongtin();
    }
}
