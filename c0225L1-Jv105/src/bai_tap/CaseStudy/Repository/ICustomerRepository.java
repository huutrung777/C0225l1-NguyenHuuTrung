package bai_tap.CaseStudy.Repository;

import bai_tap.CaseStudy.Entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean delete(String maKhachHang);
    boolean update(Customer customer);
    Customer findById(String maNhanVien);

}
