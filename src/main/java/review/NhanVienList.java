package review;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienList {

    public void nhapNhanVien(ArrayList<NhanVien> arr) {
        NhanVien nv = new NhanVien();
        nv.nhapThongtin();
        try {
           arr.add(nv); 
           System.out.println("Them sinh vien thanh cong!");
        } catch(Exception err) {
            err.printStackTrace();
        }
        
    }

    public void hienDanhSachNhanVien(ArrayList<NhanVien> arr) {
        System.out.println("====================================================");
        System.out.println("Thong tin nhan vien");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Ho ten", "Ngay sinh", "Dia chi", "Gioi tinh", "Phong ban", "Luong co ban", "He so luong", "He so phu cap", "Luong thuc linh");
        for (NhanVien x : arr) {
            x.hienThongtin();
        }
    }

    public void getNhanVienLuongMin(ArrayList<NhanVien> arr) {
        NhanVien nv = arr.get(0);
        float min = arr.get(0).getLuongThucLinh();
        for (NhanVien x : arr) {
            if (x.getLuongThucLinh() < min) {
                min = x.getLuongThucLinh();
                nv = x;
            }
        }
        System.out.println("Ten nhan vien: " + nv.HoTen);
    }

    public void luuNhanVien(ArrayList<NhanVien> arr) {
        File file = new File("C:\\Users\\togia\\Desktop\\nhanvien.dat");
        try (PrintWriter out = new PrintWriter(new FileWriter(file))) {
            if (!arr.isEmpty()) {
                out.println("Thong tin nhan vien");
                out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Ho ten", "Ngay sinh", "Dia chi", "Gioi tinh", "Phong ban", "Luong co ban", "He so luong", "He so phu cap", "Luong thuc linh");
                for (NhanVien nv : arr) {
                    out.printf("%-20s %-20s %-20s %-20s %-20s %-20d %-20f %-20f %-20f\n", nv.HoTen, nv.ngaySinh, nv.DiaChi, nv.GioiTinh, nv.PhongBan, nv.LuongCoBan, nv.HeSoLuong, nv.HeSoPhuCap, nv.getLuongThucLinh());
                }
                out.close();
                System.out.println("Luu thanh cong!");
            } else {
                System.out.println("Danh sach sinh vien trong!");
            }
        } catch(Exception err) {
            err.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ArrayList<NhanVien> NhanVienList = new ArrayList<>();
        NhanVienList arr = new NhanVienList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3. Doc file nhanvien.dat");
            System.out.println("4. Luu nhanh vien vao file");
            System.out.println("5. Xem nhan vien co luong thap nhat");
            System.out.println("6. Thoat");
            System.out.println("----------------------------------------------------");
            int op;
            while (true) {
                System.out.print("Lua chon cua ban: ");
                if (sc.hasNextInt()) {
                    op = sc.nextInt();
                    break;
                } else {
                    System.out.print("Vui long nhap gia tri tu 1 toi 5!");
                    sc.next();
                }
            }

            switch (op) {
                case 1 ->
                    arr.nhapNhanVien(NhanVienList);
                case 2 ->
                    arr.hienDanhSachNhanVien(NhanVienList);
                case 4 ->
                    arr.luuNhanVien(NhanVienList);
                case 5 -> 
                    arr.getNhanVienLuongMin(NhanVienList);
                case 6 -> {
                    sc.close();
                    System.out.println("Thoat chuong trinh");
                    return;
                }
                default -> {
                    System.out.println("Vui long nhap gia tri tu 1 den 5!");
                }
            }
        }
    }
}
