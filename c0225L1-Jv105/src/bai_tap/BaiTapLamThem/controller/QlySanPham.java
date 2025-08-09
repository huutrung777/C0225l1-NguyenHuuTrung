package bai_tap.BaiTapLamThem.controller;

import bai_tap.BaiTapLamThem.entity.SanPham;

public class QlySanPham {
    private static SanPham[] sanPhamList = new SanPham[5];

    static {
        sanPhamList[0] = new SanPham(1, "maytinhban", 150000);
        sanPhamList[1] = new SanPham(2, "laptop", 150000);
    }

    public static SanPham[] getAll() {
        return sanPhamList;
    }

    public static void add(SanPham sanPham) {
        for (int i = 0; i < sanPhamList.length; i++) {
            if (sanPhamList[i] == null) {
                sanPhamList[i] = sanPham;
                break;
            }
        }
    }
}
