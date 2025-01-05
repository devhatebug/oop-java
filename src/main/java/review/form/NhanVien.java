package review.form;

public class NhanVien extends Person {
    protected String phongban;
    protected double hesoluong, thamnien, luongcoban;

    public NhanVien(String phongban, double hesoluong, double thamnien, double luongcoban, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    public NhanVien() {
        
    }

    public String getPhongban() {
        return phongban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public double getThamnien() {
        return thamnien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }
    
    public double getLuongthuclinh() {
        return luongcoban*hesoluong*(1 + thamnien/100);
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void setThamnien(double thamnien) {
        this.thamnien = thamnien;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    @Override
    public void hienThongtin() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20f %-20f %-20f %-20f\n", super.hoten, super.ngaysinh, super.diachi, super.gioitinh,phongban, hesoluong, thamnien, luongcoban, getLuongthuclinh());
    }
    
}
