package lk.ijse.dep.dao.custom.impl;

import lk.ijse.dep.dao.custom.CustomerDAO;
import lk.ijse.dep.entity.Customer;

import java.util.List;

public class CustomerDAOImpl2 implements CustomerDAO {

    @Override
    public String getLastCustomerId() {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer find(String key) {
        return null;
    }

    @Override
    public boolean save(Customer entity) {
        return false;
    }

    @Override
    public boolean update(Customer entity) {
        return false;
    }

    @Override
    public boolean delete(String key) {
        return false;
    }
}
