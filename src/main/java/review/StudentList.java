package review;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class StudentList {

    public void nhapThongtin(ArrayList<Student> arr, Student sv) {
        sv.nhapThongtin();
        try {
            arr.add(sv);
            System.out.println("Them sinh vien thanh cong");
        } catch (Exception e) {
            System.out.println("Da xay ra loi!");
        }
    }

    public void hienThongtin(ArrayList<Student> arr) {
        System.out.println("====================================================");
        System.out.println("Thong tin: ");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s\n", "MaSV", "Ho ten", "Ngay sinh", "Que quan", "Gioi tinh", "Email", "Tong so tin chi", "Diem trung binh");
        for (Student svs : arr) {
            svs.hienThongtin();
        }
        float max = arr.get(0).getDiem_tb();
        Student sv1 = arr.get(0);
        for (Student sinhvien : arr) {
            if (sinhvien.getDiem_tb() > max) {
                max = sinhvien.getDiem_tb();
                sv1 = sinhvien;
            }
        }
        System.out.println("Sinh vien co diem trung binh cao nhat la: ");
        System.out.printf("%s %s\n", "Ho ten: ", sv1.getHo_ten());
        System.out.printf("%s %s\n", "Ma sinh vien: ", sv1.getMasv());
        System.out.println("====================================================");
    }

    public void luuDanhSachSinhvien(ArrayList<Student> arr) {
        File file = new File("C:\\Users\\togia\\Desktop\\sinhvien.dat");
        try (PrintWriter out = new PrintWriter(new FileWriter(file))) {
            if (!arr.isEmpty()) {
                out.println("Thong tin sinh vien: ");
                out.printf("%-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s\n", "MaSV", "Ho ten", "Ngay sinh", "Que quan", "Gioi tinh", "Email", "Tong so tin chi", "Diem trung binh");
                for (Student sv : arr) {
                    out.printf("%-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s\n",sv.getMasv(), sv.getHo_ten(), sv.getNgay_sinh(), sv.que_quan, sv.gioi_tinh, sv.getEmail(), sv.getTong_tin_chi(), sv.getDiem_tb());
                }
                System.out.println("Luu thong tin sinh vien thanh cong!");
            } else {
                System.out.println("Danh sach sinh vien trong!");
            }
            out.close();
        } catch(Exception err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<>();
        StudentList arr = new StudentList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====================================================");
            System.out.println("Hanh dong: ");
            System.out.println("1.Them sinh vien ");
            System.out.println("2.Hien thi danh sach sinh vien ");
            System.out.println("3.Luu sinh vien");
            System.out.println("4.Thoat ");
            System.out.println("====================================================");
            int op;
            while (true) {
                System.out.print("Lua chon hanh dong: ");
                if (sc.hasNextInt()) {
                    op = sc.nextInt();
                    break;
                } else {
                    System.out.println("Vui long nhap so tu 1 den 4!");
                    sc.next();
                }
            }
            switch (op) {
                case 1 -> {
                    Student sv = new Student();
                    arr.nhapThongtin(StudentList, sv);
                }
                case 2 ->
                    arr.hienThongtin(StudentList);
                case 3 ->
                    arr.luuDanhSachSinhvien(StudentList);
                case 4 -> {
                    sc.close();
                    System.out.println("Thoat chuong trinh.");
                    return;
                }
                default ->
                    System.out.println("Vui long chon lai!");

            }
        }
    }
}
