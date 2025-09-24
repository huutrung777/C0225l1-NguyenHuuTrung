package bai_tap.CaseStudy.Repository;

import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.mvc3.Entity.Oto;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean delete(String maNhanVien);
    boolean update(Employee employee);
    Employee findById(String maNhanVien);

}
