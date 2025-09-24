package bai_tap.CaseStudy.Service;

import bai_tap.CaseStudy.Entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean delete(String maNhanVien);
    boolean update(Employee employee);
    Employee findById(String maNhanVien);
}
