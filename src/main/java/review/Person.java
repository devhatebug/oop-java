package review;
import java.util.Scanner;

public class Person {
    protected String ho_ten;
    protected String ngay_sinh;
    protected String que_quan;
    protected String gioi_tinh;
    
    public Person() {}

    public Person(String ho_ten, String ngay_sinh, String que_quan, String gioi_tinh) {
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.que_quan = que_quan;
        this.gioi_tinh = gioi_tinh;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public void setQue_quan(String que_quan) {
        this.que_quan = que_quan;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public String getQue_quan() {
        return que_quan;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }
    
    public void nhapThongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        System.out.print("Ho ten: ");
        this.ho_ten = sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngay_sinh = sc.nextLine();
        System.out.print("Que quan: ");
        this.que_quan = sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioi_tinh = sc.nextLine();
    }
    
    public void hienThongtin() {
        System.out.println("====================================================");
        System.out.println("Thong tin: ");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Ho ten", "Ngay sinh", "Que quan", "Gioi tinh");
        System.out.printf("%-15s %-15s %-15s %-15s\n", ho_ten, ngay_sinh, que_quan, gioi_tinh);
        System.out.println("====================================================");
    }
    
    public static void main(String[] args) {
        Person nguoi1 = new Person();
        nguoi1.nhapThongtin();
        nguoi1.hienThongtin();
    }
}



