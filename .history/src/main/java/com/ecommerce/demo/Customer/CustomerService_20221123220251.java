package com.ecommerce.demo.Customer;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository cusRepo;

    public String createCustomer(Customer cusData) throws NoSuchAlgorithmException {
        if (cusRepo.returnCustomer(cusData.getName()) != null) {
            return "User is Created";
        } else {
            return "User is not added";
        }
    }
}
