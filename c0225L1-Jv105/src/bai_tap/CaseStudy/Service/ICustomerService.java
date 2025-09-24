package bai_tap.CaseStudy.Service;

import bai_tap.CaseStudy.Entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean delete(String maNhanVien);
    boolean update(Customer customer);
    Customer findByMaNhanVien(String maNhanVien);

}
