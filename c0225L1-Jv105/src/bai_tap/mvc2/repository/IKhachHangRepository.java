package bai_tap.mvc2.repository;

import bai_tap.mvc2.entity.KhachHang;

import java.util.List;

public interface IKhachHangRepository {
    List<KhachHang> findAll();
    boolean add(KhachHang khachHang);
    boolean delete(String id);
    KhachHang findById(String id);

}
