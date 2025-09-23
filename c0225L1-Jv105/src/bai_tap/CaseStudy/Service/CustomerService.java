package bai_tap.CaseStudy.Service;

import bai_tap.CaseStudy.Entity.Customer;
import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Repository.CustomerRepository;
import bai_tap.CaseStudy.Repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private ICustomerRepository customerRepository=new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll() ;
    }

    @Override
    public boolean add(Customer customer) {
        List<Customer> customerList = customerRepository.findAll();
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i)!=null){
                if (customerList.get(i).getMaNhanVien()==customer.getMaNhanVien()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return customerList.add(customer);
    }

    @Override
    public boolean delete(int maNhanVien) {
        return customerRepository.delete(maNhanVien);
    }
}
