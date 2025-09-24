package bai_tap.CaseStudy.Service;

import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Repository.EmployeeRepository;
import bai_tap.CaseStudy.Repository.IEmployeeRepository;

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
                if (employees.get(i).getMaID()==employee.getMaID()){
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
    public boolean delete(String maNhanVien) {
        return employeeRepository.delete(maNhanVien);
    }

    @Override
    public boolean update(Employee employee) {
        return employeeRepository.update(employee);
    }
    public Employee findById(String maNhanVien) {
        for (Employee e : employeeRepository.findAll()) {
            if (e.getMaID().equals(maNhanVien)) {
                return e;
            }
        }
        return null;
    }


}