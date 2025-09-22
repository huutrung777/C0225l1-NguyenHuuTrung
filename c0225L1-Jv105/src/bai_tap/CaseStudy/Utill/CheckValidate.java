package bai_tap.CaseStudy.Utill;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CheckValidate {
    public static boolean checkMaNhanVien(String maNV) {
        String regex = "^NV-\\d{4}$";
        return maNV.matches(regex);
    }
    public static boolean checkName(String name){
        String regexName ="^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
        return name.matches(regexName);
    }
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

    public static boolean checkCMND(String cmnd) {
        String regex = "^(\\d{9}|\\d{12})$";
        return cmnd.matches(regex);
    }
    public static boolean checkSoDienThoai(String phone) {
        String regex = "^0\\d{9}$";
        return phone.matches(regex);
    }
    public static boolean checkLuong(double luong) {
        return luong > 0;
    }
}
