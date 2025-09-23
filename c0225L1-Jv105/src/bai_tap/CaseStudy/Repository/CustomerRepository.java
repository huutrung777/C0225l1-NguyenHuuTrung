package bai_tap.CaseStudy.Repository;

import bai_tap.CaseStudy.Entity.Customer;
import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Utill.ReadAndWriteFile;
import bai_tap.mvc3.Entity.Oto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
private final String CUSTOMER_FILE = "c0225L1-Jv105/src/bai_tap/CaseStudy/Data/Customer.csv";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CUSTOMER_FILE);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Customer customer = new Customer(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), array[5], array[6], array[7], array[8]);
                customerList.add(customer);
            }
        }catch (Exception e){
            System.out.println("đọc file bị lỗi ");
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> list = new ArrayList<>();
        list.add(customer.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE,list,true);
        } catch (Exception e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int maNhanVien) {
        boolean isSuccessDelete = false;
        List<Customer> customerList = findAll();

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaNhanVien().equals(maNhanVien)) {
                customerList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInfoToCSV());
        }
        try {
            bai_tap.mvc1.Utill.ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessDelete;
    }
}
