package bai_tap.mvc2.service;

import bai_tap.mvc2.entity.khachHang;

import java.util.List;

public interface IkhachHangService {
    List<khachHang> findAll();
    boolean add(khachHang khachHang);
    boolean delete(String id);
    khachHang findById(String id);
}
