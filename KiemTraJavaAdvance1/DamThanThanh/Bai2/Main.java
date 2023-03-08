/*
 * Create at 3/8/2023
 * Author Dam Than Thanh
 * */
package KiemTraJavaAdvance1.DamThanThanh.Bai2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Truyền vào đối tượng 1 nhân viên tạo sẵn dữ liệu
        NhanVien nv1 = new KyThuat("NV001","Đàm Thận Thanh", "21/10/2000","Hương Mạc - Từ Sơn - Bắc Ninh", "IT");
        System.out.println(nv1);
        System.out.println("Mô tả công việc: "+nv1.moTaCongViec());

        // Nhập dữ liệu vào bán phím thông tin 1 nhân viên
        Scanner in = new Scanner(System.in);

        System.out.println("\nNhập Thông tin Nhân Viên:");
        System.out.print("Nhập mã: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();

        NhanVien kt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.println(kt2);
        System.out.println("Mô tả công việc: "+kt2.moTaCongViec());
    }
}
