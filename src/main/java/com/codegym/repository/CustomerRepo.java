package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepo {
    private static final Map<Integer, Customer> customers = new HashMap<>();

    static {
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Hai Phong"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Sai Gon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijing"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "NewYork"));
    }

    public Collection<Customer> findAll() {
        return customers.values();
    }

    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer findById(int id) {
        return customers.get(id);
    }

    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    public void remove(int id) {
        customers.remove(id);
    }
}
