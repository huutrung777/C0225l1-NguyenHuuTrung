package bai_tap.mvc2.repository;

import bai_tap.mvc2.entity.khachHang;

import java.util.List;

public interface IkhachHangRepository {
    List<khachHang> findAll();
    boolean add(khachHang khachHang);
    boolean delete(String id);
    khachHang findById(String id);

}
