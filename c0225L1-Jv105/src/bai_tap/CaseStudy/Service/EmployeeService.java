package bai_tap.CaseStudy.Service;

import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Repository.EmployeeRepository;
import bai_tap.CaseStudy.Repository.IEmployeeRepository;
import bai_tap.mvc1.entity.Student;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    private IEmployeeRepository employeeRepository=new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean add(Employee employee) {
        List<Employee> employees = employeeRepository.findAll();
        for (int i = 0; i <employees.size() ; i++) {
            if (employees.get(i)!=null){
                if (employees.get(i).getMaNhanVien()==employee.getMaNhanVien()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return employeeRepository.add(employee);
    }

    @Override
    public boolean delete(int maNhanVien) {
return employeeRepository.delete(maNhanVien);
    }
}
