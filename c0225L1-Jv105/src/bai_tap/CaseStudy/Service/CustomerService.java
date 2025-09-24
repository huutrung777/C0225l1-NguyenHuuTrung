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
                if (customerList.get(i).getMaID()==customer.getMaID()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return customerRepository.add(customer);
    }

    @Override
    public boolean delete(String maNhanVien) {
        return customerRepository.delete(maNhanVien);
    }

    @Override
    public boolean update(Customer customer) {
        return customerRepository.update(customer);
    }

    @Override
    public Customer findByMaNhanVien(String maNhanVien) {
        for (Customer c : customerRepository.findAll()) {
            if (c.getMaID().equals(maNhanVien)) {
                return c;
            }
        }
        return null;
    }


}