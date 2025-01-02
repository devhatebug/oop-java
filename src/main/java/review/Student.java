
package review;
import java.util.Scanner;

public class Student extends Person {
    private String masv;
    private String email;
    private float diem_tb;
    private int tong_tin_chi;

    public Student(String ho_ten, String ngay_sinh, String que_quan, String gioi_tinh) {
        super(ho_ten, ngay_sinh, que_quan, gioi_tinh);
        this.masv = masv;
        this.email = email;
        this.diem_tb = diem_tb;
        this.tong_tin_chi = tong_tin_chi;
    }
    
    public Student() {
    }

    public String getMasv() {
        return masv;
    }

    public String getEmail() {
        return email;
    }

    public float getDiem_tb() {
        return diem_tb;
    }

    public int getTong_tin_chi() {
        return tong_tin_chi;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiem_tb(float diem_tb) {
        this.diem_tb = diem_tb;
    }

    public void setTong_tin_chi(int tong_tin_chi) {
        this.tong_tin_chi = tong_tin_chi;
    }
    
    @Override
    public void nhapThongtin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongtin();
        System.out.print("Ma sinh vien: ");
        this.masv = sc.nextLine();
        System.out.print("Email: ");
        this.email = sc.nextLine();
        while(true) {
            System.out.print("Tong so tin chi: ");
            if(sc.hasNextInt()) {
                this.tong_tin_chi = sc.nextInt();
                break;
            } else {
                System.out.println("Vui long nhap gia tri la so!");
                sc.next();
            }
        }
        
        while(true) {
            System.out.print("Diem trung binh: ");
            if(sc.hasNextFloat()) {
                this.diem_tb = sc.nextFloat();
                break;
            } else {
                System.out.println("Vui long nhap gia tri la so!");
                sc.next();
            }
        }
    }
    
    @Override 
    public void hienThongtin() {
        
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s\n",masv, super.ho_ten, super.ngay_sinh, super.que_quan, super.gioi_tinh, email, tong_tin_chi, diem_tb );
        
    }
    
    public static void main(String[] args) {
        Student hocsinh = new Student();
        hocsinh.nhapThongtin();
        hocsinh.hienThongtin();
    }
   
}
