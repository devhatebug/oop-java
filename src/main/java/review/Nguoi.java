
package review;

import java.util.Scanner;

public class Nguoi {
    protected String HoTen, ngaySinh, DiaChi, GioiTinh;

    public Nguoi(String HoTen, String ngaySinh, String DiaChi, String GioiTinh) {
        this.HoTen = HoTen;
        this.ngaySinh = ngaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }
    
    public Nguoi() {
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    public void nhapThongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        System.out.print("Ho ten: ");
        this.HoTen = sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Dia chi: ");
        this.DiaChi = sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.GioiTinh = sc.nextLine();
    }
    
    public void hienThongtin() {
        System.out.printf("%-20s %-20s %-20s %-20s\n", HoTen, ngaySinh, DiaChi, GioiTinh);
    }
    
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        nguoi.nhapThongtin();
        nguoi.hienThongtin();
    }
}
