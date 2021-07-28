package cpu.dev.academy.exercises.task2;

import cpu.dev.academy.exercises.task2.model.Customer;
import cpu.dev.academy.exercises.task2.model.Logger;
import cpu.dev.academy.exercises.task2.repository.CustomerRepository;

import java.util.List;

public class CustomerService {
    private Logger logger;
    private CustomerRepository repository;

    public void deleteCustomerComplaints(Customer customer) {
        logger.log("Complaints raised by " + customer.getName() + " have been deleted!");
    }

    public void sendPromotionToAllCustomers(List<Customer> customers) {
        for (Customer customer : customers) {
            repository.sendNotification(customer);
        }

//        alternative and more concise forms
//        customers.forEach(customer -> repository.sendNotification(customer));
//        OR
//        customers.forEach(repository::sendNotification);
    }
}
