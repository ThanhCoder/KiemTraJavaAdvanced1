/*
* Create at 3/8/2023
* Author Dam Than Thanh
* */
package KiemTraJavaAdvance1.DamThanThanh.Bai3;

public class Main {
    public static void main(String[] args) {
        VanBan vanban = new VanBan();
        vanban.setNoiDung("  Xin Chào     Tôi là Đàm Thận Thanh lập   trình viên Java tại SamSung SDS ");

        // Đếm số từ
        System.out.println(vanban.demSoTu());

        // Chuyển định dạng văn bản
        vanban.setNoiDung(vanban.chuanHoaVanBan());
        System.out.println(vanban);

        // Viết thường tất cả text
        vanban.setNoiDung(vanban.vietThuongToanBo());
        System.out.println(vanban);

        // Viết hoa tất cả text
        vanban.setNoiDung(vanban.vietHoaToanBo());
        System.out.println(vanban);

        // Viết hoa chữ cái đầu tiên
        vanban.setNoiDung(vanban.vietHoaMoiTuDauTien());
        System.out.println(vanban);
    }
}
