package com.codegnan.app.javaapp01.operations;

import com.codegnan.app.javaapp01.entity.Customer;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {
   private HashSet<Customer> customers = new HashSet<>();

    public CustomerOperations() {
        Customer customer1 = new Customer(101, "Rahul", "Sharma", 'M');
        Customer customer2 = new Customer(102, "Priya", "Reddy", 'F');
        Customer customer3 = new Customer(103, "Arjun", "Kumar", 'M');
        Customer customer4 = new Customer(104, "Sneha", "Rao", 'F');
        Customer customer5 = new Customer(105, "Kiran", "Patel", 'M');

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
    }

    // To display customers
    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    //1. Add a customer
    public  boolean addCustomer(int id, String firstname, String lastname, char gender){
        return customers.add(new Customer(id, firstname, lastname, gender));
    }

    // 2. Update customer
    public boolean updateCustomer(int id, String firstname, String lastname, char gender){
        Customer customer = findCustomerById(id);
        if(customer == null){
            return false;
        }
        // removing before updating
        customers.remove(customer);

        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setGender(gender);
        return customers.add(customer);
    }

    //3. delete a customer
    public boolean deleteCustomer(int customerId) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == customerId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    //4. Retrieve all customers
    public HashSet<Customer> getCustomers(){
        return customers;
    }

    //5. find customer by ID
    public Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }

        return null;
    }

    //6. Find Customer by FirstName
    public Customer findCustomerByFirstName(String firstname){
        for(Customer customer: customers){
            if(customer.getFirstName() != null && customer.getFirstName().equals(firstname)){
                return customer;
            }
        }
        return null;
    }
}
