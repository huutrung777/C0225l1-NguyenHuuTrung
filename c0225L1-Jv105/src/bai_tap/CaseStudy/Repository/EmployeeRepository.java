package bai_tap.CaseStudy.Repository;

import bai_tap.CaseStudy.Entity.Customer;
import bai_tap.CaseStudy.Entity.Employee;


import bai_tap.CaseStudy.Utill.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
private final String EMPLOYEE_FILE="c0225L1-Jv105/src/bai_tap/CaseStudy/Data/Employee.csv";


    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(EMPLOYEE_FILE);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Employee employee = new Employee(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
                employeeList.add(employee);
            }
        }catch (Exception e){
            System.out.println("đọc file bị lỗi ");
        }

        return employeeList;
    }
    @Override
    public boolean add(Employee employee) {
        List<String> list = new ArrayList<>();
        list.add(employee.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE,list,true);
        } catch (Exception e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int maNhanVien) {
        boolean isSuccessDelete = false;
        List<Employee> employeeList = findAll();

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien().equals(maNhanVien)) {
                employeeList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoToCSV());
        }
        try {
            bai_tap.mvc1.Utill.ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessDelete;
    }
}
