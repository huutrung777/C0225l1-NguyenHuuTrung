package bai_tap.CaseStudy.Utill;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CheckValidateCustomer {
    // Kiểm tra mã khách hàng KH-YYYY
    public static boolean checkMaKhachHang(String maKH) {
        String regex = "^KH-\\d{4}$";
        return maKH.matches(regex);
    }

    // Kiểm tra tên (viết hoa ký tự đầu mỗi từ)
    public static boolean checkName(String name){
        String regexName ="^([A-ZÀ-Ỵ][a-zà-ỹ]*)(\\s[A-ZÀ-Ỵ][a-zà-ỹ]*)*$";
        return name.matches(regexName);
    }

    // Kiểm tra ngày sinh (>= 18 tuổi)
    public static boolean checkNgaySinh(String ngaySinh) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDate = LocalDate.parse(ngaySinh, formatter);
            LocalDate today = LocalDate.now();
            int age = Period.between(birthDate, today).getYears();
            return age >= 18;
        } catch (Exception e) {
            return false;
        }
    }

    // Kiểm tra CMND (9 hoặc 12 số)
    public static boolean checkCMND(String cmnd) {
        String regex = "^(\\d{9}|\\d{12})$";
        return cmnd.matches(regex);
    }

    // Kiểm tra số điện thoại (bắt đầu bằng 0, đủ 10 số)
    public static boolean checkSoDienThoai(String phone) {
        String regex = "^0\\d{9}$";
        return phone.matches(regex);
    }

    // Kiểm tra email cơ bản
    public static boolean checkEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }

    // Kiểm tra loại khách (Diamond, Platinum, Gold, Silver, Member)
    public static boolean checkLoaiKhach(String loaiKhach) {
        String regex = "^(Diamond|Platinum|Gold|Silver|Member)$";
        return loaiKhach.matches(regex);
    }
}
